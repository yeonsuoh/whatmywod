package com.wmw.whatmywod.service

import com.wmw.whatmywod.domain.Wod
import com.wmw.whatmywod.dto.WodListResponseDto
import com.wmw.whatmywod.dto.WodRequestDto
import com.wmw.whatmywod.repository.UserRepository
import com.wmw.whatmywod.repository.WodRepository
import com.wmw.whatmywod.repository.WorkoutRepository
import org.springframework.stereotype.Service
import java.time.temporal.WeekFields
import java.util.*

@Service
class WodService(
    private val wodRepository: WodRepository,
    private val userRepository: UserRepository,
    private val workoutRepository: WorkoutRepository,
) {

    fun findAll(): List<WodListResponseDto> {

        val wods = wodRepository.findAll();
        return wods.map {
            val weekOfYear = it.date.get(WeekFields.of(Locale.getDefault()).weekOfYear()).toLong()
            WodListResponseDto(
                id = it.id,
                workoutName = it.workout.name,
                userId = it.user.id,
                date = it.date,
                weight = it.weight,
                times = it.times,
                description = it.description,
                year = it.date.year.toLong(),
                month = it.date.monthValue.toLong(),
                week = weekOfYear
            )
        }
    }

    fun saveWod(request: WodRequestDto): Wod {
        val workout = workoutRepository.findById(request.workoutId)
        val user = userRepository.findById(request.userId)

        // todo -> workout, user 유효성 검증 후 .get() 제거

        val savedWod = wodRepository.save(
            Wod(
                workout = workout.get(),
                user = user.get(),
                date = request.date,
                weight = request.weight,
                times = request.times,
                description = request.description,
            )
        )
        return savedWod
    }
}
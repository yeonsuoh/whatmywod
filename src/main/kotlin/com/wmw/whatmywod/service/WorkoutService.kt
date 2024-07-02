package com.wmw.whatmywod.service

import com.wmw.whatmywod.domain.Workout
import com.wmw.whatmywod.dto.WorkoutResponseDto
import com.wmw.whatmywod.repository.WorkoutRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class WorkoutService(
    private val workoutRepository: WorkoutRepository,
) {

    @Transactional
    fun save(name: String): Workout {
        val workout = Workout(name = name)
        return workoutRepository.save(workout)
    }

    fun getAllWorkouts(): List<WorkoutResponseDto> {
        return workoutRepository.findAll().map {
            entity -> WorkoutResponseDto(entity.name)
        }
    }
}
package com.wmw.whatmywod.dto

import java.time.LocalDate

data class WodListResponseDto(
    val id: Long,
    val workoutName: String,
    val userId: Long,
    val date: LocalDate,
    val weight: Long?,
    val times: Long?,
    val description: String?,
    val year: LocalDate,
    val month: LocalDate,
    val week: Long,
)
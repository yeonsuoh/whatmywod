package com.wmw.whatmywod.dto

import java.time.LocalDate

data class WodRequestDto(
    val workoutId: Long,
    val userId: Long,
    val date: LocalDate,
    val weight: Long?,
    val times: Long?,
    val description: String?,
)
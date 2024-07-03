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
    val year: Long,
    val month: Long,
    val week: Long,
)
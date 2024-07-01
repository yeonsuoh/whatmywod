package com.wmw.whatmywod.repository

import com.wmw.whatmywod.domain.Workout
import org.springframework.data.jpa.repository.JpaRepository

interface WorkoutRepository : JpaRepository<Workout, Long> {
}
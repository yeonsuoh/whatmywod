package com.wmw.whatmywod.repository

import com.wmw.whatmywod.domain.Wod
import org.springframework.data.jpa.repository.JpaRepository

interface WodRepository: JpaRepository<Wod, Long> {
}
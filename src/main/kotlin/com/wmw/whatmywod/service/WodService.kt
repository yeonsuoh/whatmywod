package com.wmw.whatmywod.service

import com.wmw.whatmywod.domain.Wod
import com.wmw.whatmywod.repository.WodRepository
import org.springframework.stereotype.Service

@Service
class WodService(
    private val wodRepository: WodRepository,
) {

    fun findAll(): List<Wod> {
        return wodRepository.findAll();
    }
}
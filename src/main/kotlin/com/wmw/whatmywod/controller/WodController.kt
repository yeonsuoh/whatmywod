package com.wmw.whatmywod.controller

import com.wmw.whatmywod.domain.Wod
import com.wmw.whatmywod.service.WodService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WodController(
    private val wodService: WodService,
) {

    @GetMapping("/wods")
    fun findAllWods() : ResponseEntity<List<Wod>> = ResponseEntity.ok(wodService.findAll())

}
package com.wmw.whatmywod.controller.api

import com.wmw.whatmywod.domain.Wod
import com.wmw.whatmywod.dto.WodRequestDto
import com.wmw.whatmywod.service.WodService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class WodApiController(
    private val wodService: WodService,
) {

    @GetMapping("/wods")
    fun findAllWods() : ResponseEntity<List<Wod>> = ResponseEntity.ok(wodService.findAll())

    @PostMapping("/wods")
    fun saveWod(
        @RequestBody
        request: WodRequestDto
    ): ResponseEntity<Wod> {
        val savedWod = wodService.saveWod(request)
        return ResponseEntity.ok(savedWod)
    }

}
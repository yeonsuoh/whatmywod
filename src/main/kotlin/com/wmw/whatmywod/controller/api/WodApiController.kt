package com.wmw.whatmywod.controller.api

import com.wmw.whatmywod.domain.Wod
import com.wmw.whatmywod.dto.WodRequestDto
import com.wmw.whatmywod.repository.WodRepository
import com.wmw.whatmywod.service.WodService
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import java.time.LocalDate
import java.time.temporal.WeekFields
import java.util.*


@Controller
class WodApiController(
    private val wodService: WodService,
    private val wodRepository: WodRepository,
) {
    @ResponseBody
    @PostMapping("/wods")
    fun saveWod(
        @RequestBody
        request: WodRequestDto
    ): ResponseEntity<Wod> {
        val savedWod = wodService.saveWod(request)
        return ResponseEntity.ok(savedWod)
    }

}
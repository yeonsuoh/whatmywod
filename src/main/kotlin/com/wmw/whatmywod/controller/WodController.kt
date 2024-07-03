package com.wmw.whatmywod.controller

import com.wmw.whatmywod.dto.WodRequestDto
import com.wmw.whatmywod.service.WodService
import com.wmw.whatmywod.service.WorkoutService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import java.time.LocalDate

@Controller
class WodController(
    private val wodService: WodService,
    private val workoutService: WorkoutService,
) {

    @GetMapping("/wod")
    fun showWodForm(model: Model): String {
        model.addAttribute("wodRequestDto", WodRequestDto(0, 1, LocalDate.now(), null, null, null))
        model.addAttribute("workouts", workoutService.findAll())
        return "wod"
    }

    @PostMapping("/wod")
    fun saveWod(@ModelAttribute wodRequestDto: WodRequestDto): String {
        // wodService-save 호출
        wodService.saveWod(wodRequestDto)

        return "redirect:/wod"
    }

}
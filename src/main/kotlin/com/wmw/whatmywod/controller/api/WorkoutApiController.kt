package com.wmw.whatmywod.controller.api

import com.wmw.whatmywod.domain.Workout
import com.wmw.whatmywod.service.WorkoutService
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.view.RedirectView

@Controller
@RequestMapping("/workout")
class WorkoutApiController(
    private val workoutService: WorkoutService,
) {

    @PostMapping
    fun createWorkout(
        @RequestParam name: String
    ) : RedirectView {
        workoutService.save(name)
        return RedirectView("/workout")
    }
}
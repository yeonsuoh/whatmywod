package com.wmw.whatmywod.controller

import com.wmw.whatmywod.service.WorkoutService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/workout")
class WorkoutController(
    private val workoutService: WorkoutService,
) {

    @GetMapping
    fun workout(model: Model): String {
        val workouts = workoutService.getAllWorkouts()
        model.addAttribute("workouts", workouts)
        return "workout"
    }
}
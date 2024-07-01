package com.wmw.whatmywod.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/workout")
class WorkoutController {

    @GetMapping
    fun workout(): String {
        return "workout"
    }
}
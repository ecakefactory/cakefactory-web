package com.cakefactory.app.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class CFHomeController {

    @GetMapping("/","/home")
    fun home(model: Model):String {
        model.addAttribute("categories", listOf("Birthday Cake", "Photo Cake", "Square Cake"))
        return "home"
    }

}
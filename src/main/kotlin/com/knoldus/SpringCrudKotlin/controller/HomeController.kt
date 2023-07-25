package com.knoldus.SpringCrudKotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/home")
class HomeController {

    @GetMapping("/hello")
    fun helloWorld():String = "Hello Team!!\n Have a nice day!!\n Welcome to the journey of learning SpringBoot with Kotlin!!"
}
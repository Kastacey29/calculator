package com.skypro.calculator.controller;

import com.skypro.calculator.service.TasksService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {
private final TasksService service;

    public Controller(TasksService service) {
        this.service = service;
    }

    @GetMapping
    public String grate() {
       return service.grate();
    }

        @GetMapping("/plus")
public Integer plus(@RequestParam ("num1") Integer num1,@RequestParam ("num2") Integer num2) {
        return this.service.plus(num1,num2);
    }

    @GetMapping("/minus")
    public Integer minus(@RequestParam ("num1") Integer num1,@RequestParam ("num2") Integer num2) {
        return this.service.minus(num1,num2);
    }
    @GetMapping("/multiply")
    public Integer multiply(@RequestParam ("num1") Integer num1,@RequestParam ("num2") Integer num2) {
        return this.service.multiply(num1,num2);
    }
    @GetMapping("/divide")
    public Double divide(@RequestParam ("num1") Integer num1,@RequestParam ("num2") Integer num2) {
        return this.service.divide(num1,num2);
    }
}

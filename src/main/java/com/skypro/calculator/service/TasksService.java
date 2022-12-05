package com.skypro.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class TasksService {
public String grate() {
    return "Добро пожаловать в калькулятор!";
}

public Integer plus(Integer num1, Integer num2) {
    if (num1 == null || num2 == null) {
        throw  new IllegalArgumentException("Введите значения!");
    }
    return num1+num2;
}

    public Integer minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw  new IllegalArgumentException("Введите значения!");
        }
        return num1-num2;
            }

    public Integer multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw  new IllegalArgumentException("Введите значения!");
        }
        return num1*num2;

    }

    public Double divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw  new IllegalArgumentException("Введите значения!");
        }
        if (num2 == 0) {
            throw  new IllegalArgumentException("Делить на 0 нельзя!");
        }
        return (double)num1/num2;
    }

}

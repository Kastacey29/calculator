package com.skypro.calculator;

import com.skypro.calculator.service.TasksService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ControllerTest {
private final Integer NUM1=20;
private final Integer NUM2=-25;
private final Integer UNCORRECT_NUM2=0;

private final TasksService service=new TasksService();

@Test
    public void shouldEqualsForPlus() {
    Integer expected =service.plus(NUM1,NUM2);
    Integer actual = NUM1+NUM2;
    Assertions.assertEquals(expected,actual);
}

    @Test
    public void shouldEqualsForMinus() {
        Integer expected =service.minus(NUM1,NUM2);
        Integer actual = NUM1-NUM2;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldEqualsForMultiply() {
        Integer expected =service.multiply(NUM1,NUM2);
        Integer actual = NUM1*NUM2;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldEqualsForDivide() {
        double expected =service.divide(NUM1,NUM2);
        double actual =(double) NUM1/NUM2;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldThrowException() {
    Assertions.assertThrows(IllegalArgumentException.class,()->service.divide(NUM1,UNCORRECT_NUM2));
    }
}

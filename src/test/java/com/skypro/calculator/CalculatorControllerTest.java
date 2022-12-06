package com.skypro.calculator;

import com.skypro.calculator.service.TasksService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorControllerTest {
    private static final Integer NUM1 = 20;
    private static final Integer NUM2 = -25;
    private static final Integer UNCORRECT_NUM2 = 0;

    private final TasksService service = new TasksService();

    public static Stream<Arguments> generateParams() {
        return Stream.of(Arguments.of(NUM1, NUM2), Arguments.of(NUM1, UNCORRECT_NUM2));
    }

    @ParameterizedTest
    @MethodSource("generateParams")
    public void shouldEqualsForPlus(Integer a, Integer b) {
        Integer expected = service.plus(a, b);
        Integer actual = a + b;
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("generateParams")
    public void shouldEqualsForMinus(Integer a, Integer b) {
        Integer expected = service.minus(a, b);
        Integer actual = a - b;
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("generateParams")
    public void shouldEqualsForMultiply(Integer a, Integer b) {
        Integer expected = service.multiply(a, b);
        Integer actual = a * b;
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("generateParams")
    public void shouldEqualsForDivide(Integer a, Integer b) {
        double expected = service.divide(a, b);
        double actual = (double) a / b;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.divide(NUM1, UNCORRECT_NUM2));
    }
}

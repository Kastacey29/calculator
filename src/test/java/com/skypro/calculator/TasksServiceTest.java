package com.skypro.calculator;

import com.skypro.calculator.service.TasksService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TasksServiceTest {
    private TasksService service = new TasksService();
    private static final Integer NUM1 = 25;
    private static final Integer NUM2 = -50;
    private static final Integer UNCORRECT_NUM2 = 0;


    public static Stream<Arguments> generateParams() {
        return Stream.of(Arguments.of(NUM1, NUM2), Arguments.of(NUM1, UNCORRECT_NUM2));
    }

    @ParameterizedTest
    @MethodSource("generateParams")
    public void shouldEqualsForPlus(Integer value1, Integer value2) {
        Assertions.assertEquals(service.plus(value1, value2), value1 + value2);
    }

    @ParameterizedTest
    @MethodSource("generateParams")
    public void shouldEqualsForMinus(Integer value1, Integer value2) {
        Assertions.assertEquals(service.minus(value1, value2), value1 - value2);
    }

    @ParameterizedTest
    @MethodSource("generateParams")
    public void shouldEqualsForMoltiply(Integer value1, Integer value2) {
        Assertions.assertEquals(service.multiply(value1, value2), value1 * value2);
    }

    @ParameterizedTest
    @MethodSource("generateParams")
    public void shouldEqualsForDivide(Integer value1, Integer value2) {
        Assertions.assertEquals(service.divide(value1, value2), (double) value1 / value2);
    }

}

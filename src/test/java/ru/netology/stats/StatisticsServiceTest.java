package ru.netology.stats;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxIfB() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {0, 5, 4, 4, 5, 3, 3, 1, 2, 2, 0};
        long expected = 5;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

}



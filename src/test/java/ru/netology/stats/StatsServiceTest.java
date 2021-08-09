package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void minSales() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.minSales(sales);
        long expected = 9;
        assertEquals(expected, actual);

    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.maxSales(sales);

        long expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void salesAmount() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.salesAmount(sales);

        long expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void averageAmount() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.averageAmount(sales);

        long expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void worstSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.worstSalesMonth(sales);

        long expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void bestSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.bestSalesMonth(sales);

        long expected = 5;
        assertEquals(expected, actual);
    }
}
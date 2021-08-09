package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long salesAmount(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageAmount(long[] sales) {
        long average = 0;
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        average = sum / 12;
        return average;
    }



    public long worstSalesMonth(long[] sales) {
        int countMonth = 0;
        for (long sale : sales) {

            if (sale < 15) {
                countMonth++;
            }

        }
        return countMonth;
    }

    public long bestSalesMonth(long[] sales) {
        int countMonth = 0;
        for (long sale : sales) {

            if (sale > 15) {
                countMonth++;
            }

        }
        return countMonth;

    }
}


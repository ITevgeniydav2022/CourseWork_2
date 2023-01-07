package model;

import java.time.LocalDateTime;

public class MonthlyTask implements Repeatability{
    @Override
    public LocalDateTime nextTime(LocalDateTime currentDateTime) {
        return currentDateTime.minusMonths(1);
    }

    @Override
    public String toString() {
        return "ежемесячная задача";
    }
}

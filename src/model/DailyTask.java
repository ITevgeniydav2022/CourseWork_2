package model;

import java.time.LocalDateTime;

public class DailyTask implements Repeatability{
    @Override
    public LocalDateTime nextTime(LocalDateTime currentDateTime) {
        return currentDateTime.plusDays(1);
    }

    @Override
    public String toString() {
        return "ежедневная задача";
    }
}

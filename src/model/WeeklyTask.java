package model;

import java.time.LocalDateTime;

public class WeeklyTask implements Repeatability{
    @Override
    public LocalDateTime nextTime(LocalDateTime currentDateTime) {
        return currentDateTime.plusWeeks(1);
    }

    @Override
    public String toString() {
        return "еженедельная задача";
    }
}

package model;

import java.time.LocalDateTime;

public class AnnualTask implements Repeatability{
    @Override
    public LocalDateTime nextTime(LocalDateTime currentDateTime) {
        return currentDateTime.plusYears(1);
    }

    @Override
    public String toString() {
        return "ежегодная задача";
    }
}

package com.gustavo.utils;
import java.time.LocalTime;

public class TimeInterval {
    private LocalTime localTime = LocalTime.of(0,0,0);

    public TimeInterval(Integer seconds) {
        if (seconds < 0) {
            throw new IllegalArgumentException("Please, enter with a positive number.");
        }
        setLocalTime(localTime.plusSeconds(seconds));
    }

    public void plusSecond(Integer seconds) {
        setLocalTime(localTime.plusSeconds(seconds));
    }

    public void plusSecondUsingTimeIntervalObj(TimeInterval ti) {
        plusSecond(ti.getLocalTime().toSecondOfDay());
    }

    public LocalTime getLocalTime() { return localTime; }

    public void setLocalTime(LocalTime localTime) { this.localTime = localTime; }
}

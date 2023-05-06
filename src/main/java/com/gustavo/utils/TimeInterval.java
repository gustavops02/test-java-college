package com.gustavo.utils;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeInterval {

    private LocalTime localTime = LocalTime.of(0,0,0);

    public TimeInterval() {
    }

    public TimeInterval(Integer seconds) {
        if (seconds < 0) { // Do not make sense work with negative numbers
            throw new IllegalArgumentException("Please, enter with a positive number. ;)");
        }
        setLocalTime(localTime.plusSeconds(seconds));

    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

}

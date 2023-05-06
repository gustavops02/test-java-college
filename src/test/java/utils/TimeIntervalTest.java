package utils;

public class TimeIntervalTest {

    private static final int secondsEqualOneHour =  3600;
    private Integer hours;
    private Integer minutes;
    private Integer seconds;


    public TimeIntervalTest(Integer secondsToBeExecuted) {
        setHours(secondsToBeExecuted / secondsEqualOneHour);
        setMinutes((secondsToBeExecuted % secondsEqualOneHour) / 60);
        setSeconds(secondsToBeExecuted % 60);
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getSeconds() {
        return seconds;
    }

    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "Time Interval: " + getHours() + ":" + getMinutes() + ":" + getSeconds();
    }
}

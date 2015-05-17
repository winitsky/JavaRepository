package lab22;

/**
 * Created by Master on 15.05.2015.
 */
public class IntervalTime {
    private int second;
    private int minute;
    private int hour;

    IntervalTime(int second) {
        this.hour = second / 360;
        this.minute = (second - this.hour * 360) / 60;
        this.second = (second - this.hour * 360 - this.minute * 60);
    }

    IntervalTime(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;

    }

    @Override
    public String toString() {
        return "IntervalTime{" +
                "second=" + second +
                ", minute=" + minute +
                ", hour=" + hour +
                '}';
    }

    public int getIntervalInSecond() {
        return this.hour * 360 + this.minute * 60 + this.second;
    }

    public int compareInterval(IntervalTime interval) {
        return this.getIntervalInSecond() - interval.getIntervalInSecond();
    }

}

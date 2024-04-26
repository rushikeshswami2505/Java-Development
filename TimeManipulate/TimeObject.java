package TimeManipulate.TimePackage;
// package TimeManipulate;

public class TimeObject {
    private int seocond, minute, hour, day;

    public int getSeocond() {
        return seocond;
    }

    public void setSeocond(int seocond) {
        this.seocond = seocond;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setTime(int seocond, int minute, int hour, int day) {
        this.seocond = seocond;
        this.minute = minute;
        this.hour = hour;
        this.day = day;
    }

    // Method 1
    public TimeObject AddTimeByTwobOject(TimeObject timeObject1, TimeObject timeObject2) {
        System.out.println("\n..........Method 1.........");
        return add(timeObject1, timeObject2);
    }

    // Method 2
    public TimeObject AddTimeByOneObject(TimeObject timeObject1) {
        System.out.println("\n..........Method 2.........");
        return add(this, timeObject1);
    }

    public void ShowTIme() {
        System.out.println("---> Seconds: " + seocond + " Minute: " + minute + " Hour: " + hour + " Day: " + day);
    }

    private TimeObject add(TimeObject t1, TimeObject t2) {
        TimeObject timeObject = new TimeObject();
        int second = t1.seocond + t2.seocond;
        int minute = t1.minute + t2.minute + second / 60;
        int hour = t1.hour + t2.hour + minute / 60;
        int day = t1.day + t2.day + hour / 24;
        timeObject.setTime(second % 60, minute % 60, hour % 24, day);

        System.out
                .print("Time 1 = " + t1.seocond + ":" + t1.minute + ":" + t1.hour + ":" + t1.day + "\nTime 2 = "
                        + t2.seocond + ":"
                        + t2.minute + ":" + t2.hour + ":" + t2.day);
        System.out.println(
                "\nTotal= " + timeObject.seocond + ":" + timeObject.minute + ":" + timeObject.hour + ":"
                        + timeObject.day);
        return timeObject;
    }
}
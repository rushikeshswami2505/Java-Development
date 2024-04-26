package TimeManipulate.TimePackage;
// package TimeManipulate;
import java.util.*;

public class TimeSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TimeObject timeObject1 = new TimeObject();
        TimeObject timeObject2 = new TimeObject();
        try {
            System.out.println("*********Enter Day 1 Time*******");
            System.out.print("\nEnter Day 1 seconds: ");
            timeObject1.setSeocond(sc.nextInt());
            System.out.print("Enter Day 1 minute: ");
            timeObject1.setMinute(sc.nextInt());
            System.out.print("Enter Day 1 hour: ");
            timeObject1.setHour(sc.nextInt());
            System.out.print("Enter Day 1 day: ");
            timeObject1.setDay(sc.nextInt());

            System.out.println("\n*********Enter Day 2 Time*******");
            System.out.print("\nEnter Day 2 seconds: ");
            timeObject2.setSeocond(sc.nextInt());
            System.out.print("Enter Day 2 minute: ");
            timeObject2.setMinute(sc.nextInt());
            System.out.print("Enter Day 2 hour: ");
            timeObject2.setHour(sc.nextInt());
            System.out.print("Enter Day 2 day: ");
            timeObject2.setDay(sc.nextInt());
        } catch (Exception igException) {
            System.err.println("Please enter integer value");
            sc.close();
            return;
        }

        TimeObject timeObjectAddion;
        // Method 1
        timeObjectAddion = timeObject1.AddTimeByTwobOject(timeObject1, timeObject2);
        timeObjectAddion.ShowTIme();
//obj+obj
        // Method 2
        timeObjectAddion = timeObject1.AddTimeByOneObject(timeObject2);
        timeObjectAddion.ShowTIme();
        sc.close();
    }
}
import java.util.Scanner;
/*
Integers sleepingTime1, sleepingTime2, sleepingTime3, and childrenCount are read from input. Compute the average sleeping time of each child using floating-point division, and assign the result to averageTime.

Ex: If the input is 13 9 14 3, then the output is:

12.0
 */


public class SleepStatistics {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int sleepingTime1;
        int sleepingTime2;
        int sleepingTime3;
        int childrenCount;
        double averageTime;

        sleepingTime1 = scnr.nextInt();
        sleepingTime2 = scnr.nextInt();
        sleepingTime3 = scnr.nextInt();
        childrenCount = scnr.nextInt();

        /* Your code goes here */
        averageTime = (sleepingTime1 + sleepingTime2 + sleepingTime3) / (double )childrenCount;

        System.out.println(averageTime);
    }
}
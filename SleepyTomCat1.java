package ConditionalStatementsMore;

import java.util.Scanner;

public class SleepyTomCat1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която въвежда броя почивни дни и отпечатва дали Том може да се наспи добре и колко е разликата от нормата за текущата година,
        // като приемем че годината има 365 дни.
        //Пример: 20 почивни дни -> работните дни са 345 (365 – 20 = 345).
        // Реалното време за игра е 24 275 минути (345 * 63 + 20 *127).
        // Разликата от нормата е 5 725 минути (30 000 – 24 275 = 5 725) или 95 часа и 25 минути.

        int holidays = Integer.parseInt(scanner.nextLine());

        int daysPerYear = 365;
        int workingDays = daysPerYear - holidays;
        int minutesDayOff = 127;
        int minutesWorkingDay = 63;
        double realGameTime = workingDays * minutesWorkingDay + holidays * minutesDayOff;
        int neededTime = 30000;
        int diff = (int) Math.abs(neededTime - realGameTime);
        int H = diff / 60;
        double M = diff % 60;

        if (neededTime >= realGameTime)
        {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %.0f minutes less for play", H, M);
        }
        else
        {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %.0f minutes more for play", H, M);
        }
    }
}

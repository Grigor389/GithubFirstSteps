package ConditionalStatements.Exercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameSerial = scanner.nextLine();

        int serialTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());


        double lunchTime = breakTime / 8.00;
                // breakTime * 0.125;

        double relaxationTime = breakTime / 4.00;
               // breakTime * 0.25

        double timeLeft = breakTime - (lunchTime + relaxationTime);

        if(timeLeft >= serialTime)
        {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameSerial, Math.ceil(timeLeft - serialTime));
        }
        else
        {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameSerial, Math.ceil(serialTime - timeLeft));
        }




    }
}

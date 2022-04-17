package ConditionalStatements.Exercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videoCardsPrice = videoCards * 250.00;
        double cpuPrice = (videoCardsPrice * 0.35) * cpu;
        double ramPrice = (videoCardsPrice * 0.10) * ram;

        double finalPrice = 0;

        if (videoCards > cpu)
        {
            finalPrice = (videoCardsPrice + cpuPrice + ramPrice) * 0.85;
        }
        else
        {
            finalPrice = videoCardsPrice + cpuPrice + ramPrice;
        }
        if (budget >= finalPrice)
        {
            System.out.printf("You have %.2f leva left!", budget - finalPrice);
        }
        else
        {
            System.out.printf("Not enough money! You need %.2f leva more!" , finalPrice - budget);
        }
    }
}

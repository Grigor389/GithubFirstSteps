package ConditionalStatementsMore;

import java.util.Scanner;

public class PipesInPool3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double water = p1 * hours + p2 * hours;

        if (water <= v)
        {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",
                    Math.abs( water / v * 100),
                    Math.abs(p1 * hours / water * 100),
                    Math.abs(p2 * hours / water * 100));
        }
        else
        {
            System.out.printf("For %.2f hours the water overflows %.2f liters.", hours , water - v );
        }
    }
}

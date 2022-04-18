package ConditionalStatementsMore;

import java.io.PrintStream;
import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //От лозе с площ X квадратни метри се заделя 40% от реколтата за производство на вино.
        // От 1 кв.м лозе се изкарват Y килограма грозде. За 1 литър вино са нужни 2,5 кг. грозде.
        // Желаното количество вино за продан е Z литра.

        //Напишете програма, която пресмята колко вино може да се произведе и дали това количество е достатъчно.
        // Ако е достатъчно, остатъкът се разделя по равно между работниците на лозето.

        //Входът се чете от конзолата и се състои от точно 4 реда:
        //	•	1ви ред: X кв.м е лозето – цяло число в интервала [10 … 5000]
        //	•	2ри ред: Y грозде за един кв.м – реално число в интервала [0.00 … 10.00]
        //	•	3ти ред: Z нужни литри вино – цяло число в интервала [10 … 600]
        //	•	4ти ред: брой работници – цяло число в интервала [1 … 20]

        double wineYard = Double.parseDouble(scanner.nextLine());
        double grapes = Double.parseDouble(scanner.nextLine());
        double liters = Double.parseDouble(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double harvest = (wineYard * 0.40) * grapes;
        double wine = harvest / 2.5;
        double litersLeft = Math.abs(wine - liters);
        double litersPerPerson = litersLeft / workers;

        if (liters <= wine)
        {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.", Math.floor(wine));
            System.out.println();
            System.out.printf("%s liters left -> %s liters per person.", (int)Math.ceil(litersLeft), (int)Math.ceil(litersPerPerson));
        }
        else
        {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(litersLeft));
        }








    }
}

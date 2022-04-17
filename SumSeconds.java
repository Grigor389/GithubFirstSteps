package ConditionalStatements.Exercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int f = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());
        int t = Integer.parseInt(scanner.nextLine());

        int sumSeconds = f + s + t;
        int min = sumSeconds / 60;
        int sec = sumSeconds % 60;

            //         System.out.printf("%d:%02d%n", min,sec);
        System.out.printf("%d:%02d%n", min,sec);

        if(sec <= 9)
        {
            //            System.out.printf("%d:0%d%n", min, sec);
            System.out.printf("%d:0%d%n", min, sec);
            //            System.out.println(min + ":0" + sec);
            System.out.println(min + ":0" + sec);
        } else
        {
            //            System.out.printf("%d:%d", min,sec);
            System.out.printf("%d:%d", min,sec);
        }
    }
}

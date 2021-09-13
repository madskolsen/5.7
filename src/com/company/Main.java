package com.company;
import java.util.Scanner;
public class Main {







    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Angiv længderne på dine 3 pinde for at se om de kan lave en trekant");
        System.out.println("Angiv første pind i cm: ");
        double stick1 = scanner.nextDouble();
        System.out.println("Angiv anden pind i cm: ");
        double stick2 = scanner.nextDouble();
        System.out.println("Angiv tredje pind i cm: ");
        double stick3 = scanner.nextDouble();

        if (stick1>stick2+stick3 || stick2>stick1+stick3 || stick3>stick1+stick2) {
            System.out.println("Det er ikke muligt at lave en trekant med dine pinde!");
        } else if (stick1<=0 || stick2 <=0 || stick3 <=0) {
            System.out.println("Der er vist ene af dine pinde du ikke kan se kammerat...");
        }else {
            System.out.println("Du kan godt lave en trekant med dine pinde!");
        }
    }
}

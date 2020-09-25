package chapter2;

import java.util.Scanner;

public class SeasonOfYear {
    public static void main (String arg[]) {

        //1. get the season of the year
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name a season of the year");
        String season = scanner.next();

        //2. get the number
        System.out.println("Tell me a number");
        int number = scanner.nextInt();

        //3. get an adjective
        System.out.println("Describe your season");
        String adjecive = scanner.next();

        //4 show the sentence result
        System.out.println("On a " + adjecive + " " + season + " day, i drink a minimum of " + number + " cups of coffee");
    }
}

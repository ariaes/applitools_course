package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){


        //1. get the numbers of hours worked
        System.out.println("Enter the number of hours");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. get the hourly pay rate
        System.out.println("Enter the employ pay rate");
        double rate = scanner.nextDouble();
        scanner.close();

        //3. multiply hour and pay rate
        double grossPay = hours * rate;

        //display result
        System.out.println(hours + " X " + rate + "= $" + grossPay );
    }
}

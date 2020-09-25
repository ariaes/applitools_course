package chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static void main (String arg[]){
        int requiredSalary = 30000;
        int requiredYears = 2;

        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter your current year");
        int year = scanner.nextInt();
        scanner.close();

        if (salary >= requiredSalary){
            if (year >= requiredYears){
                System.out.println("Congrats");
            }
            else
                System.out.println("You need mora than " + year + "years");
        }
        else
            System.out.println("Sorr still earning");
    }
}

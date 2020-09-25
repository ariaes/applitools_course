package chapter3;

import java.util.Scanner;

public class TestResult {
    public static void main(String args[]){

        //get the test core
        System.out.println("Enter your test score");
        Scanner scannner = new Scanner(System.in);
        double score = scannner.nextDouble();

        //determine the letter grade
        char grade;

        if (score < 60){
            grade = 'F';
        }
        else if (score < 70){
            grade = 'D';
        }
        else if (score < 80){
            grade = 'C';
        }
        else if (score < 90){
            grade = 'B';
        }
        else
            grade = 'A';

        scannner.close();
        System.out.println("your grade is:" + grade);
    }
}

package inna.abramenko.task;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");

        Scanner sc = new Scanner(System.in);

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            System.out.println("Sum: " + (num1 + num2));
            System.out.println("Multiplication: " + (num1*num2));

    }
}

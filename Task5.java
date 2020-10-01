package inna.abramenko.task;

import java.util.Scanner;

public class Task5 {

    static void setMonth(int a) {
        String[] month = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        String s;
        try {
            s = month[a - 1];
            System.out.println("It is " + s + ".");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Incorrect month number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number: ");
        int n = sc.nextInt();
        setMonth(n);
    }
}

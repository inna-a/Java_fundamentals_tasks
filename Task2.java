package inna.abramenko.task;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        System.out.println("Enter a word: ");

        Scanner sc = new Scanner(System.in);

            StringBuffer rev = new StringBuffer(sc.nextLine());
            rev.reverse();
            System.out.println(rev.toString());


    }
}

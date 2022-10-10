package com.basicoreproblems;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        if ((number % 2) == 0)
            System.out.println("the entered no is Even");
        else
            System.out.println("the entered no is Odd");
    }
}

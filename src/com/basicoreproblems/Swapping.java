package com.basicoreproblems;
import java.util.Scanner;

public class Swapping {
    public static void swap(int num1, int num2){
        int temp=num2;
        num2=num1;
        num1=temp;
        System.out.println("After swapping : \nFirst no = "+num1+"\nSecond no = "+num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First no : ");
        int num1 = sc.nextInt();
        System.out.println("Second no : ");
        int num2 = sc.nextInt();
        System.out.println("Before swapping : \nFirst no = " + num1 + "\nSecond no = " + num2);
        swap(num1,num2);
    }
}

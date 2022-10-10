//Java Program to Find the Largest Among Three Numbers
package com.basicoreproblems;

import java.util.Scanner;

public class LargestElement {
    public static int maxElement(int n1, int n2, int n3){
        int max;
        if ((n1>n2) && (n1>n3))
            max = n1;
        else if ((n2>n3) && (n2>n1))
            max = n2;
        else
            max = n3;

        return max;
    }
    public static void main(String[] args) {
        int n1, n2, n3, max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        n1 = sc.nextInt();
        System.out.println("Enter Second Number: ");
        n2 = sc.nextInt();
        System.out.println("Enter Third Number: ");
        n3 = sc.nextInt();

        System.out.println("Largest Number is: "+maxElement(n1, n2, n3));
    }
}

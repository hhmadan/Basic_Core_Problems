// I/P -> The Harmonic Value N. Ensure N != 0
// Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
// O/P -> Print the Nth Harmonic Value.
package com.basicoreproblems;

import java.util.Scanner;

public class HarmonicNum {
    public static void main(String[] args) {
            System.out.print("Enter any number : ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.print("The Harmonic Series is : ");
            double result = 0.0;
            while(num > 0)
            {
                result = result + (double) 1 / num;
                num--;
                System.out.print(result +"  ");
            }
            System.out.println("");
            System.out.println("Output of Harmonic Series is "+result);
        }
}
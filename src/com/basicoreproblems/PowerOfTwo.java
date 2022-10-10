//Desc -> This program takes a command-line argument N and prints a table of the powers of 2 that are
// less than or equal to 2^N.
// I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
// Logic -> repeat until i equals N.
// O/P -> Powers of till N.
package com.basicoreproblems;
import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Enter number till you want Powers of 2: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 0 && num < 31) {
            for (int i = 0; i <= num; i++) {
                if (i == 0)
                    System.out.println("2 power " + i + " = 1");
                else
                    System.out.println("2 power " + i + " = " + (int) Math.pow(2, i));
            }
        }
    }
}

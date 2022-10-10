// I/P -> Number to find the prime factors
// Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
// O/P -> Print the prime factors of number N.
package com.basicoreproblems;
import java.util.Scanner;

public class Factors {
    public static void primeFactor(int n) {
            while (n%2==0)
            {
                System.out.print(2 + " ");
                n /= 2;
            }

            for (int i = 3; i <= Math.sqrt(n); i+= 2)
            {
                while (n%i == 0)
                {
                    System.out.print(i + " ");
                    n /= i;
                }
            }

            if (n > 2)
                System.out.print(n);
        }
    public static void main(String[] args){
        System.out.println("Enter number to find its Prime Factors: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            primeFactor(n);
    }
}
//Java Program to Compute Quotient and Remainder
package com.basicoreproblems;

import java.util.Scanner;

public class QuotientRemainder {
    public static long calculateQuotient(long dividend, long divisor){
        return dividend/divisor;
    }
    public static long calculateRemainder(long dividend, long divisor){
        return dividend%divisor;
    }
    public static void main(String[] args) {
            long dividend, divisor, remainder, quotient;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the dividend : ");
            dividend = sc.nextInt();
            System.out.println("enter the divisor : ");
            divisor = sc.nextInt();

            System.out.println("enter the remainder = "+calculateRemainder(dividend,divisor));
            System.out.println("enter the quotient = "+calculateQuotient(dividend,divisor));

        }

}

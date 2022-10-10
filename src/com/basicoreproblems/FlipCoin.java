//Flip Coin and print percentage of Heads and Tails
// I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
// Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
// O/P -> Percentage of Head vs Tails
package com.basicoreproblems;
import java.util.Scanner;
public class FlipCoin {

    //Calculates percentage for Heads or Tails
    public static float getPercentage(int coin_side, int num) {
        return (float) coin_side / num * 100;
        }

    public static void main(String[] args) {
        int num, head = 0, tail = 0;
        System.out.println("Enter number of times to flip coin: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if (num>0) {
            for (int i = 1; i <= num; i++) {
                if (Math.random() < 0.5) {
                    System.out.println("It is Heads...");
                    head += 1;
                } else {
                    System.out.println("It is Tails...");
                    tail += 1;
                }
            }
            System.out.println(head);
            System.out.println(tail);
            float h_Percentage = getPercentage(head, num);
            float t_Percentage = getPercentage(tail, num);
            System.out.println("Percentage of Heads is: " + h_Percentage + "%");
            System.out.println("Percentage of Tails is: " + t_Percentage + "%");
        } else {
            System.out.println("Invalid entry...! Please enter Positive Integer");
        }
    }
}


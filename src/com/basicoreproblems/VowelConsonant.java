package com.basicoreproblems;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        System.out.println("Enter a Letter: ");
        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);

        if ((letter <= 'z' && letter >= 'a') || (letter <= 'Z' && letter >= 'A')) {
            switch (letter) {
                case 'a' -> System.out.println("a is Vowel");
                case 'e' -> System.out.println("e is Vowel");
                case 'i' -> System.out.println("i is Vowel");
                case 'o' -> System.out.println("o is Vowel");
                case 'u' -> System.out.println("u is Vowel");
                case 'A' -> System.out.println("A is Vowel");
                case 'E' -> System.out.println("E is Vowel");
                case 'I' -> System.out.println("I is Vowel");
                case 'O' -> System.out.println("O is Vowel");
                case 'U' -> System.out.println("U is Vowel");
                default -> System.out.println(letter + " is Consonant");
            }
        } else {
            System.out.println("Please enter either Small or Upper Case alphabet..!");
        }
    }

}

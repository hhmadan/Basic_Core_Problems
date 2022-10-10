package com.basicoreproblems;
import java.util.Scanner;
import java.lang.Math;
public class Quadratic {
    public class QuadraticEqnRoots {
        public static void main(String[] args) {
            double a, b, c, delta, root1, root2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value for First Term, a: ");
            a = sc.nextInt();
            System.out.println("Enter value for Second Term, b: ");
            b = sc.nextInt();
            System.out.println("Enter value for Third Term, c: ");
            c = sc.nextInt();

            delta = b * b - 4 * a * c;
            root1 = (-b + Math.sqrt(delta)) / (2 * a);
            root2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("1st root of given Quadratic Equation is: " + root1);
            System.out.println("2nd root of given Quadratic Equation is: " + root2);
        }

    }
}
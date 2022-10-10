package com.basicoreproblems;

import java.util.Scanner;

public class EuclideanDistance {
    public static void main(String[] args) {

        double x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x co-ordinate value : ");
        x = sc.nextDouble();
        System.out.println("Enter the y co-ordinate value : ");
        y = sc.nextDouble();
        double euclideanDistance = euclideanDistance(x,y);
        System.out.printf("The Euclidean Distance is:" + euclideanDistance);

    }
    public static double euclideanDistance(double x, double y) {

        double distance = (double)Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return distance;
    }

}

package com.basicoreproblems;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        System.out.println("Enter temperature in fahrenheit: ");
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        System.out.println("Enter wind speed in miles per hour : ");
        double vel = sc.nextDouble();
        if((temp<50)&&((vel>120)||(vel<3))){
            double speed=Math.pow(vel,0.16);
            double ans=  ((0.4275*temp) - 35.75);
            double windChill =35.74+(0.6215*temp)+(ans*speed);
            System.out.println("Wind Chill is: = "+windChill);
        }else
            System.out.println("Invalid Entry...! Temperature  should be greater than 50 \n " +
                    "Velocity should be greater than 120 and less than 3");

    }
}

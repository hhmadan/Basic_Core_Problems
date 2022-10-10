//I/P -> Year, ensure it is a 4-digit number.
// Logic -> Determine if it is a Leap Year.
// O/P -> Print the year is a Leap Year or not.

package com.basicoreproblems;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter a Year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year%400 == 0)
            System.out.println(year+" is Leap Year");
        else if (year%100 == 0)
            System.out.println(year+" is NOT Leap Year");
        else if (year%4 == 0)
            System.out.println(year+" is Leap Year");
        else
            System.out.println(year+" is NOT Leap Year");
    }
}

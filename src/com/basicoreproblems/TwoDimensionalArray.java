package com.basicoreproblems;

import java.io.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) throws IOException {
        int rows,columns;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        rows = sc.nextInt();
        System.out.println("Enter Number of Columns : ");
        columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        //Input array elements...
        System.out.println("Enter elements...");
        for(int a = 0; a < rows; a++){
            for (int b=0; b<columns; b++){
                arr[a][b]=sc.nextInt();
            }
        }


      FileOutputStream file = new FileOutputStream("arrays.txt");
      PrintWriter pw = new PrintWriter(file);
    //  OutputStreamWriter output = new OutputStreamWriter(file);
       for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++) {
                 pw.println(arr[i][j]+" ");
                //  output.write((a[i][j] + " "));
            }
            //  System.out.println("\n");
            pw.println("\n");
           // output.write("\n");
       }
       pw.close();
       //output.close();
    }
}

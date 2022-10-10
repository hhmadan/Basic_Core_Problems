package com.basicoreproblems;

import java.util.Scanner;

public class TripletArray {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter the elements : ");
        for(int a=0;a<size;a++){
            arr[a]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i] + arr[j] + arr[k]==0){
                        System.out.println("Triplets which sums to 0 are : "+arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }
}

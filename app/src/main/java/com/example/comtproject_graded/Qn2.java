package com.example.comtproject_graded;

import java.util.Scanner;

public class Qn2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //This is for the lower limit
        System.out.print("Enter lower limit: ");
        int lowerlimit = input.nextInt();
        //This is for the upper limit
        System.out.print("Enter upper limit: ");
        int upperlimit = input.nextInt();
        //Counting excluding lower and upper limit
        System.out.print("Counting: ");
        for(int i = lowerlimit+1; i<upperlimit; i++){
            System.out.print(i+" ");
        }

    }
}

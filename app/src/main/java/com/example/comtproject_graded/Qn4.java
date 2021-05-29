package com.example.comtproject_graded;

import java.util.Scanner;

public class Qn4 {
    public static void main(String[] args) {
        int costOfiPad=1000;
        //For user to input number of iPads
        System.out.print("Enter the number of iPads: ");
        Scanner noOfiPads = new Scanner(System.in);
        //Convert Scanner to int
        int i = noOfiPads.nextInt();
        int totalCost=calculatePrice(costOfiPad,i);
        System.out.println("The Total Cost of the iPads is $"+totalCost);

    }

    private static int calculatePrice(int costOfiPad,int i) {
        return costOfiPad*i;
    }
}

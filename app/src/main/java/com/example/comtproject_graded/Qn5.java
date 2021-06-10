package com.example.comtproject_graded;

import java.util.Scanner;

public class Qn5 {
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        Scanner integer = new Scanner(System.in);
        //This is to convert the scanner class to int
        int firstNumber = integer.nextInt();
        System.out.print("Enter second number: ");
        integer = new Scanner(System.in);
        //This is to convert the scanner class to int
        int secondNumber = integer.nextInt();
        //To call the method
        computeProduct(firstNumber, secondNumber);
    }

    public static void computeProduct(int firstNumber, int secondNumber) {
        int finalProduct = firstNumber*secondNumber;
        //To make sure both firstNumber and secondNumber are both in range
        if ( firstNumber >= 10 && firstNumber <= 50 && secondNumber >= 10 && secondNumber <=50) {
            System.out.println("The product of " + firstNumber + " and " + secondNumber + " is " + finalProduct);
        }
        else {
            System.out.println("Not in range");
        }
    }
}

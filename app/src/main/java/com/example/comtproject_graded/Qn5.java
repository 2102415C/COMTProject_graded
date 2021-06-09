package com.example.comtproject_graded;

import java.util.Scanner;

public class Qn5 {
    public static void main(String[] args){
        System.out.print("Enter first number: ");
        Scanner firstNumber = new Scanner(System.in);
        int number1 = firstNumber.nextInt();
        System.out.print("Enter second number: ");
        Scanner secondNumber = new Scanner(System.in);
        int number2 = secondNumber.nextInt();
        int finalProduct = computeProduct(number1,number2);
        if ( number1  number2 ) {
            System.out.println("The product of " + number1 + "and " + number2 + "is " + finalProduct);
        }
        else {
            System.out.println("Not in range");
        }
    }

    public static int computeProduct(int firstNumber, int secondNumber) {
        return firstNumber*secondNumber;
    }
}

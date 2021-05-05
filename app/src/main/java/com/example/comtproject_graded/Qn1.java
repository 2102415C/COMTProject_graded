package com.example.comtproject_graded;

import java.util.Scanner;

public class Qn1 {
    public static void main(String[] args) {
        //This is for the user to input the first no.
        Scanner input = new Scanner(System.in);
        System.out.print("First number: ");
        int firstnum = input.nextInt();
        //This is for the second no.
        System.out.print("Second number: ");
        int secondnum = input.nextInt();
        //This is for the third no.
        System.out.print("Third number: ");
        int thirdnum = input.nextInt();

        if (firstnum<secondnum && firstnum<thirdnum) {
            System.out.println("\n"+"The smallest number is "+firstnum);
        }
        else if (secondnum<thirdnum) {
            System.out.println("\n" + "The smallest number is " + secondnum);
        }
        else {
            System.out.println("\n" + "The smallest number is " + thirdnum);
        }

    }
}

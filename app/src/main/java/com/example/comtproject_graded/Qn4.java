package com.example.comtproject_graded;

public class Qn4 {
    public static void main(String[] args) {
        int costOfMobile=1500;
        int noOfPhones=3;
        int totalCost=calculatePrice(costOfMobile,noOfPhones);
        System.out.println(totalCost);

    }

    private static int calculatePrice(int costOfMobile, int noOfPhones) {
        return costOfMobile*noOfPhones;
    }
}

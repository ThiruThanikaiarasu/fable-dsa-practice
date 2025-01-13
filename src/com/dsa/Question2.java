package com.dsa;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numberOfProducts = scanner.nextInt();

        int[] productPrices = new int[numberOfProducts];
        int totalPrice = 0;

        System.out.println("Enter the prices of the products: ");
        for (int i = 0; i < numberOfProducts; i++) {
            productPrices[i] = scanner.nextInt();
            totalPrice += productPrices[i];
        }

        if (isPerfectCube(totalPrice)) {
            System.out.println("Yes");
        } else {
            int additionalAmount = calculateAdditionalAmount(totalPrice);
            System.out.println("the additional amount needed to make the total price a perfect cube" + additionalAmount);
        }
    }

    public static boolean isPerfectCube(int number) {
        int cubeRoot = (int) Math.round(Math.cbrt(number));
        return Math.pow(cubeRoot, 3) == number;
    }


    public static int calculateAdditionalAmount(int totalPrice) {
        int additionalAmount = 0;

        while (!isPerfectCube(totalPrice + additionalAmount)) {
            additionalAmount++;
        }

        return additionalAmount;
    }

}

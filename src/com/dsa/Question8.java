package com.dsa;

import java.util.Scanner;

public class Question8 {

    private static int countProfitableDays(int[] sales) {
        int profitableDays = 0;

        for(int sale : sales) {
            if(sale > 0) {
                profitableDays++;
            }
        }
        return profitableDays;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total number of days: ");
        int numberOfDays = scanner.nextInt();
        int[] sales = new int[numberOfDays];

        for (int iterator = 0; iterator < numberOfDays; iterator++) {
            System.out.print("Enter day" + (iterator + 1) + " sale: ");
            sales[iterator] = scanner.nextInt();
        }

        int result = countProfitableDays(sales);

        System.out.println("Out of " + numberOfDays + " days, there were " + result + " profitable days.");
    }
}

package com.dsa;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the stock value: ");
        int stock = scanner.nextInt();
        int distributions = calculateDistributions(stock);

        System.out.println("The number of distributions before stock reaches 0 is: " + distributions);
    }

    private static int calculateDistributions(int stock) {
        int distributions = 0;

        while (stock > 0) {
            if (stock % 2 == 0) {
                stock /= 2;
            } else {
                stock -= 1;
            }
            distributions++;
        }

        return distributions;
    }
}

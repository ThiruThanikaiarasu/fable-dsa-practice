package com.dsa;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.print("Enter the value of K: ");
        int k = scanner.nextInt();

        System.out.println("Enter the numbers: ");
        for (int iterator = 0; iterator < n; iterator++) {
            numbers[iterator] = scanner.nextInt();
        }

        int score = calculatePlayerScore(numbers, k);
        System.out.println("The player's score is: " + score);
    }

    private static int calculatePlayerScore(int[] numbers, int k) {
        int score = 0;

        for (int number : numbers) {
            score += number / k;
        }

        return score;
    }
}

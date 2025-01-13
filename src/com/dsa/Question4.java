package com.dsa;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the message to calculate the encryption key: ");
        int message = scanner.nextInt();
        int encryptionKey = calculateEncryptionKey(message);

        System.out.println("The encryption key is: " + encryptionKey);
    }

    private static int calculateEncryptionKey(int message) {
        int sum = 0;

        while (message > 0) {
            int digit = message % 10;
            if (isPrime(digit)) {
                sum += digit;
            }
            message /= 10;
        }

        return sum;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}

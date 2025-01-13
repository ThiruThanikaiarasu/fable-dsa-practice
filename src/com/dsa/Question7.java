package com.dsa;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the order ID to generate the OTP: ");
        int orderId = scanner.nextInt();
        int otp = generateOneTimePassword(orderId);

        System.out.println("The one-time password (OTP) for order ID " + orderId + " is: " + otp);
    }

    private static int generateOneTimePassword(int orderId) {
        int otp = 1;

        while (orderId > 0) {
            otp *= orderId % 10;
            orderId /= 10;
        }

        return otp;
    }
}

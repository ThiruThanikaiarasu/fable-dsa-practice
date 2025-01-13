package com.dsa;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of dimensions: ");
        int numberOfDimensions = scanner.nextInt();
        int[] dimensions = new int[numberOfDimensions];

        System.out.println("Enter the dimensions: ");
        for (int iterator = 0; iterator < numberOfDimensions; iterator++) {
            dimensions[iterator] = scanner.nextInt();
        }

        int cubeCount = countPerfectCubes(dimensions);
        System.out.println("The number of perfect cube numbers in the list is: " + cubeCount);
    }

    private static int countPerfectCubes(int[] dimensions) {
        int cubeCount = 0;

        for (int dimension : dimensions) {
            int cubeRoot = (int) Math.round(Math.cbrt(dimension));
            if (Math.pow(cubeRoot, 3) == dimension) {
                cubeCount++;
            }
        }

        return cubeCount;
    }
}

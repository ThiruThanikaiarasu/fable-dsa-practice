package com.dsa;

public class Question1 {
    public static void main(String[] args) {
        int[] trusses = {4, 5, 6, 10};

        double largestArea = findLargestArea(trusses);

        System.out.printf("%f\n", largestArea);
    }

    public static double findLargestArea(int[] trusses) {
        double maxArea = 0.0;

        for (int i = 0; i < trusses.length; i += 2) {
            int base = trusses[i];
            int height = trusses[i + 1];

            double area = (base * height) / 2.0;

            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }
}

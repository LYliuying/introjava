package vu.co.kaiyin.introjava.chapter2;

import java.util.Scanner;

public class ComputeCircleAreaFromUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter radius: ");
        double radius = scanner.nextDouble();
        double area = calculateArea(radius);
    }

    private static double calculateArea(double radius) {
        return 0.0;
    }
}

package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // 1
        int bobSalary = 45699;
        int garySalary = 67799;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is: " + highestSalary);

        // 2
        int carPrice = 28500;
        int truckPrice = 78870;
        int lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The cheaper vehicle costs: " + lowestPrice);

        // 3
        double radius = 7.25;
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + circleArea);
    }
}

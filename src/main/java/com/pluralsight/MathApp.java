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

        // 4
        double num = 5.0;
        double sqrtNum = Math.sqrt(num);
        System.out.println("The square root of the variable is: " + sqrtNum);

        // 5
        double x1 = 5, x2 = 85;
        double y1 = 10, y2 = 50;
        double distance = Math.hypot((x2 - x1), (y2 - y1));
        System.out.println("The distance between the two points is: " + distance);

        // 6
        double num2 = -3.8;
        double absNum2 = Math.abs(num2);
        System.out.println("The absolute value of the variable is: " + absNum2);
    }
}

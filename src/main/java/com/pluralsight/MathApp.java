package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // 1
        double bobSalary = 45699.00;
        double garySalary = 67799.00;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is: $" + highestSalary);

        // 2
        double carPrice = 28500.00;
        double truckPrice = 78870.00;
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The cheaper vehicle costs: $" + lowestPrice);

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

        // 7
        double randNum = Math.random();
        System.out.println("The randomly generated number is:" + randNum);

        // 8
        int days = 24;
        int hoursInADAy = 24;
        int minutesInAnHour = 60;
        int secondsInAMinute = 60;
        int millisecondsInASecond = 1000;

        int hours = days * hoursInADAy;
        int minutes = hours * minutesInAnHour;
        int seconds = minutes * secondsInAMinute;
        int milliseconds = seconds * millisecondsInASecond;

        System.out.println("There are " + minutes + " minutes in " + days + " days");
        System.out.println("There are " + milliseconds + " milliseconds in " + days + " days");
    }
}

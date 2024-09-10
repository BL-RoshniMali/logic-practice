package com.bridgelabz.logicpractice;

public class EmployeeWage {

    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOURS = 8;
    public static final int PART_TIME_HOURS = 5;

    public static void main(String[] args) {
        int empType = (int) (Math.random() * 3); // Generates a random value of 0, 1, or 2

        int workingHours = 0;
        switch (empType) {
            case FULL_TIME:
                workingHours = FULL_DAY_HOURS;
                System.out.println("Employee is Full-time");
                break;
            case PART_TIME:
                workingHours = PART_TIME_HOURS;
                System.out.println("Employee is Part-time");
                break;
            default:
                System.out.println("Employee is Absent");
                break;
        }

        int dailyWage = WAGE_PER_HOUR * workingHours;
        System.out.println("Daily Employee Wage: " + dailyWage);
    }
}

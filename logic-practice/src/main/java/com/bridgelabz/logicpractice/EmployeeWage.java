package com.bridgelabz.logicpractice;

public class EmployeeWage {

    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOURS = 8;
    public static final int PART_TIME_HOURS = 5;
    public static final int WORKING_DAYS_PER_MONTH = 25;

    public static void main(String[] args) {
        int totalWage = 0;

        for (int day = 1; day <= WORKING_DAYS_PER_MONTH; day++) {
            int empType = (int) (Math.random() * 3); // 0 for Absent, 1 for Full-time, 2 for Part-time
            int workingHours = 0;

            switch (empType) {
                case FULL_TIME:
                    workingHours = FULL_DAY_HOURS;
                    System.out.println("Day " + day + ": Full-time Employee");
                    break;
                case PART_TIME:
                    workingHours = PART_TIME_HOURS;
                    System.out.println("Day " + day + ": Part-time Employee");
                    break;
                default:
                    System.out.println("Day " + day + ": Employee Absent");
                    break;
            }

            int dailyWage = WAGE_PER_HOUR * workingHours;
            totalWage += dailyWage;
        }

        System.out.println("Total Wage for the Month: " + totalWage);
    }
}

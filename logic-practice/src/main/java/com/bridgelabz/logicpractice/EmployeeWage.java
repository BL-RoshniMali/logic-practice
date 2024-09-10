package com.bridgelabz.logicpractice;

public class EmployeeWage {

    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOURS = 8;
    public static final int PART_TIME_HOURS = 5;
    public static final int MAX_WORKING_HOURS = 100;
    public static final int MAX_WORKING_DAYS = 20;

    public static void main(String[] args) {
        int totalWage = 0;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        while (totalWorkingHours < MAX_WORKING_HOURS && totalWorkingDays < MAX_WORKING_DAYS) {
            totalWorkingDays++;
            int empType = (int) (Math.random() * 3); // 0 for Absent, 1 for Full-time, 2 for Part-time
            int workingHours = 0;

            switch (empType) {
                case FULL_TIME:
                    workingHours = FULL_DAY_HOURS;
                    System.out.println("Day " + totalWorkingDays + ": Full-time Employee");
                    break;
                case PART_TIME:
                    workingHours = PART_TIME_HOURS;
                    System.out.println("Day " + totalWorkingDays + ": Part-time Employee");
                    break;
                default:
                    System.out.println("Day " + totalWorkingDays + ": Employee Absent");
                    break;
            }

            totalWorkingHours += workingHours;
            int dailyWage = WAGE_PER_HOUR * workingHours;
            totalWage += dailyWage;
        }

        System.out.println("Total Wage for the Month: " + totalWage);
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
    }
}

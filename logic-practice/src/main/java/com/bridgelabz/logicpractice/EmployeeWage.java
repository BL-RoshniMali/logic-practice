package com.bridgelabz.logicpractice;

public class EmployeeWage {

    public static void main(String[] args) {
        int IS_PRESENT = 1;
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOURS = 8;
        int PART_TIME_HOURS = 5;

        // UC1: Check if the employee is present or absent
        double attendanceCheck = Math.random();
        int attendance = (attendanceCheck < 0.5) ? 0 : 1;

        if (attendance == IS_PRESENT) {
            System.out.println("Employee is Present");

            // UC3: Part-time employee condition
            boolean isPartTime = Math.random() < 0.5; // Randomly decide part-time or full-time
            int workingHours = isPartTime ? PART_TIME_HOURS : FULL_DAY_HOURS;

            // UC2: Calculate Daily Employee Wage
            int dailyWage = WAGE_PER_HOUR * workingHours;
            System.out.println("Daily Employee Wage: " + dailyWage);
        } else {
            System.out.println("Employee is Absent");
        }
    }
}

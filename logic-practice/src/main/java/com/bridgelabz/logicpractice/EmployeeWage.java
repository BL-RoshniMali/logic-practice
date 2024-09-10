package com.bridgelabz.logicpractice;

public class EmployeeWage {

    public static void main(String[] args) {
        int IS_PRESENT = 1;
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOURS = 8;

        // UC1: Check if the employee is present or absent
        double attendanceCheck = Math.random();
        int attendance = (attendanceCheck < 0.5) ? 0 : 1;

        if (attendance == IS_PRESENT) {
            System.out.println("Employee is Present");
            // UC2: Calculate Daily Employee Wage
            int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
            System.out.println("Daily Employee Wage: " + dailyWage);
        } else {
            System.out.println("Employee is Absent");
        }
    }
}

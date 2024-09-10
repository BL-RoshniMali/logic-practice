package com.bridgelabz.logicpractice;

public class EmployeeWage {

    public static void main(String[] args) {
        int IS_PRESENT = 1;

        // UC1: Check if the employee is present or absent
        double attendanceCheck = Math.random(); // generates a random value between 0.0 and 1.0
        int attendance = (attendanceCheck < 0.5) ? 0 : 1; // simulating 50% attendance

        if (attendance == IS_PRESENT) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}

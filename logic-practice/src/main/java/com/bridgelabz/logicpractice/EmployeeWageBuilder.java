package com.bridgelabz.logicpractice;

public class EmployeeWageBuilder {

    // Instance/class variables
    private final String company;
    private final int wagePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;

    // Constructor to initialize the company-specific details
    public EmployeeWageBuilder(String company, int wagePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    // UC7: Class method to compute employee wage
    public int computeEmployeeWage() {
        int totalWage = 0;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        while (totalWorkingHours < maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empType = (int) (Math.random() * 3); // 0 for Absent, 1 for Full-time, 2 for Part-time
            int workingHours = 0;

            switch (empType) {
                case 1: // Full-time employee
                    workingHours = 8;
                    break;
                case 2: // Part-time employee
                    workingHours = 5;
                    break;
                default: // Absent
                    workingHours = 0;
            }

            totalWorkingHours += workingHours;
            int dailyWage = wagePerHour * workingHours;
            totalWage += dailyWage;
        }

        // Print the total wage
        System.out.println("Total wage for company " + company + " is: " + totalWage);
        return totalWage;
    }

}

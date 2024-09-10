package com.bridgelabz.logicpractice;

public class Main {

    public static void main(String[] args) {
        // UC8: Compute employee wage for multiple companies
        EmployeeWageBuilder companyA = new EmployeeWageBuilder("CompanyA", 20, 20, 100);
        EmployeeWageBuilder companyB = new EmployeeWageBuilder("CompanyB", 15, 25, 120);

        // Compute wage for both companies
        companyA.computeEmployeeWage();
        companyB.computeEmployeeWage();
    }
}

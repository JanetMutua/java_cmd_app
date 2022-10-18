package Janetjava;

import org.w3c.dom.ls.LSOutput;

public class ControlFlow {
    public static void main(String[] args){

        // comparison operators

        int y = 34;
        int c = 89;
        System.out.println(y >= c);

        // logical operators

        boolean isAsthmatic = true;
        boolean isDiabetic = false;
        boolean isBloodTypeO = false;

        System.out.println((isAsthmatic || isDiabetic) && !isBloodTypeO);

        //====================================conditional statements==============================

        boolean isSavings = false;
        if (isSavings)
            System.out.println("Make more, stress less");
        else
            System.out.println("Work more, save more");

        //================================unsimplified code snippet====================================
        int income = 250_000;
        if (income >= 100_000){
            boolean hasHighIncome = true;
        }

        //declaring the variable outside the if statement
        //best practice method
        int herIncome = 30_000;
        boolean hasHighSalary = false;
        if (herIncome >= 100_000)
            hasHighSalary = true;

        System.out.println(hasHighSalary);

        //===================================simplified if statement version==========================================

        int myIncome = 350_000;
        boolean hasGoodIncome = (myIncome >= 200_000);
        System.out.println(hasGoodIncome);


        //=========================================Ternary Operators==================================================
        int salary = 230_000;
        String className = salary >= 100_000 ? "First class citizen" : "Economy class citizen";
        System.out.println(className);

        //============================================Switch Statements============================

        String userRole = "Moderator";

        switch (userRole) {
            case "Admin":
                System.out.println("Login as Admin");
                break;
            case "Moderator":
                System.out.println("Login as the moderator");
                break;
            default:
                System.out.println("Request login access");

        }



    }

}

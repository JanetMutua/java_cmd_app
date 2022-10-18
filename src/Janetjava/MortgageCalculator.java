package Janetjava;

import java.text.NumberFormat;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main (String[] args){
        Scanner mortgageCalculator = new Scanner(System.in);
        final byte PERCENT = 100;
        final byte MONTHS = 12;
        while (true){
            System.out.print("Enter Principal Amount: ");
            int principalAmount = mortgageCalculator.nextInt();
            if (principalAmount > 1_000 && principalAmount <= 1_000_000) {
                System.out.print("Enter Annual Interest Rate:");
                double annualInterest = mortgageCalculator.nextDouble();
                double monthlyInterest = annualInterest / PERCENT / MONTHS;
                if (annualInterest > 0 && annualInterest <= 30) {
                    System.out.print("Enter period (years): ");
                    byte years = mortgageCalculator.nextByte();
                    if (years > 0 && years <= 30) {
                        int noPayments = years * MONTHS;
                        double appreciationRate = Math.pow(++monthlyInterest, noPayments);
                        double mortgageRate = principalAmount * ((monthlyInterest * appreciationRate) / (appreciationRate - 1));
                        String mortgageAmount = NumberFormat.getCurrencyInstance().format(mortgageRate);
                        System.out.println("Mortgage: " + mortgageAmount);
                        break;
                    } else
                        System.out.println("Enter a number between 0 & 30");
                } else
                    System.out.println("Enter a number between 0 & 30");
            }else
                System.out.println("Enter a number between 1000 & 1,000,000");
        }

    }
}

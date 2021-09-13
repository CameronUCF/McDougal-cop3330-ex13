/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cameron McDougal
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        float principal;
        float interestRate;
        int years;
        int compoundRate;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the principal amount?");
        principal = scanner.nextFloat();

        System.out.println("What is the rate?");
        interestRate = scanner.nextFloat();
        interestRate /= 100;

        System.out.println("What is the number of years?");
        years = scanner.nextInt();

        System.out.println("What is the number of times the interest is compounded per year?");
        compoundRate = scanner.nextInt();

        scanner.close();

        float compoundedInterest = (1 + (interestRate / compoundRate));
        compoundedInterest =  principal * (float)Math.pow(compoundedInterest, years * compoundRate);
        System.out.printf("$%.0f invested at %.1f%% for %d years compounded %d times per year is $%.2f", principal, interestRate * 100, years, compoundRate, compoundedInterest);
    }
}

package org.example.interestQuestion;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        double principle,rate;
        int time;

        System.out.println("Enter Principle : ");
        principle=io.nextDouble();
        System.out.println("Rate : ");
        rate=io.nextDouble();
        System.out.println("Time : ");
        time=io.nextInt();

        Interest interest=new Interest(principle,rate,time);
        System.out.println("Simple Interest : "+interest.getSimpleInterest());
        System.out.println("Compound Interest : "+interest.getCompoundInterest());
    }
}

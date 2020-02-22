package org.example.interestQuestion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.Scanner;

public class App {

    public static final Logger logger= (Logger) LogManager.getLogger();

    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        double principle,rate;
        int time;

        logger.info("Enter principle : ");
        principle=io.nextDouble();
        logger.info("Enter rate : ");
        rate=io.nextDouble();
        logger.info("Enter time : ");
        time=io.nextInt();

        Interest interest=new Interest(principle,rate,time);
        logger.info("Simple Interest : {}",interest.getSimpleInterest()+"");
        logger.info("Compound Interest : {}",interest.getCompoundInterest()+"");
    }
}

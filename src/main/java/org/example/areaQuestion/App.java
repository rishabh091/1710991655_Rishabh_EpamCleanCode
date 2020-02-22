package org.example.areaQuestion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.Scanner;

public class App
{
    private static Scanner io=new Scanner(System.in);
    public static final Logger logger= (Logger) LogManager.getLogger();

    public static void main( String[] args )
    {
        double area;
        String material;
        boolean automation = false;

        logger.info("Enter area : ");
        area = io.nextDouble();

        logger.info("Enter material type : ");
        material = getMaterialType();

        if(material.toLowerCase().equals(Standards.highStandardMaterials.toString().toLowerCase())){
            logger.info("Select automation (true/false) : ");
            automation = io.nextBoolean();
        }

        CalculateInterest calculateInterest = new CalculateInterest();
        try{
            logger.info("Cost is : {}",calculateInterest.getInterest(area,material,automation));
        }
        catch (InvalidMaterialSelect e){
            logger.error(e.getMessage());
        }

        io.close();
    }

    private static String getMaterialType(){
        Standards[] standards = Standards.values();
        for(Standards s: standards){
            logger.info("Type '" + s + "' for " + s);
        }
        logger.info("Input : ");
        String material = io.next();

        return material;
    }
}

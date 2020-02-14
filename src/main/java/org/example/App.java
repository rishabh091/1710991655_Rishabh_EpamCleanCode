package org.example;

import java.util.Scanner;

public class App
{
    private static Scanner io=new Scanner(System.in);

    public static void main( String[] args )
    {
        double area;
        String material;
        boolean automation = false;

        System.out.println("Enter area : ");
        area = io.nextDouble();

        System.out.println("Choose Material : ");
        material = getMaterialType();

        if(material.toLowerCase().equals(Standards.highStandardMaterials.toString().toLowerCase())){
            System.out.println("Select automation (true/false) : ");
            automation = io.nextBoolean();
        }

        CalculateInterest calculateInterest = new CalculateInterest();
        try{
            System.out.println(calculateInterest.getInterest(area,material,automation));
        }
        catch (InvalidMaterialSelect e){
            System.err.println(e);
        }

        io.close();
    }

    private static String getMaterialType(){
        Standards[] standards = Standards.values();
        for(Standards s: standards){
            System.out.println("Type '" + s + "' for " + s);
        }
        System.out.println("Input : ");
        String material = io.next();

        return material;
    }
}

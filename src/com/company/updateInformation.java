package com.company;
//Import exception class
import java.io.*;
//Import scanner class
import java.util.Scanner;
//Import file writer class
import java.io.FileWriter;

public class updateInformation
{
    public static void newInformation() {


        //Scanner
        Scanner sc = new Scanner(System.in);

        //Ask for weight
        System.out.println("Please add your weight (lbs): ");
        double weight = sc.nextDouble();

        //Ask for height
        System.out.println("Please add your height (inches): ");
        double height = sc.nextDouble();

        //Ask for preference
        System.out.println("Select your weight loss or gain preference: 1. Weight loss, no muscle " +
                "2. Weight loss, with muscle  3. Weight gain, no muscle  4. Weight gain, with " +
                "muscle");
        String preference = sc.next();


        //File writer
        try {
            //Write into file code
            PrintWriter myWriter = new
    PrintWriter(new
FileWriter("/Users/chriskim/IdeaProjects/Trivia game/src/com/company/userInformationFile",
                    true));
            //Write weight, height, preference into code
            myWriter.write(  weight + "," + height + "," + preference);
            //Close writer object
            myWriter.close();

        } catch (IOException e) {
            //Catch errors
            e.printStackTrace();
        }

        //If, if else statements to call main methods depending on preference
        if (preference.equals("1")) {
            //Calling method1
            System.out.println(Main.method1(weight, height));
        } else if (preference.equals("2")) {
            //Calling method2
            System.out.println(Main.method2(weight, height));
        } else if (preference.equals("3")) {
            //Calling method3
            System.out.println(Main.method3(weight, height));
        } else if (preference.equals("4")) {
            //Calling method4
            System.out.println(Main.method4(weight, height));
        } else {
            //Directing user to input numbers for preference
            System.out.println("Please select a number, restarting program...");
            //Restarts method
            reenterInfo();
        }

    }

    public static void replaceOldInfo()
    {
        //Scanner
        Scanner input = new Scanner(System.in);

        //Name
        System.out.println("Name: ");
        String name = input.next();

        //Password
        System.out.println("Password: ");
        String password = input.next();

        //Weight
        System.out.println("Add new weight: ");
        double  weight = input.nextDouble();

        //Height
        System.out.println("Add New height (inches): ");
        double  height = input.nextDouble();

        //Ask for preference
        System.out.println("Select your weight loss or gain preference: 1. Weight loss, no muscle " +
                "2. Weight loss, with muscle  3. Weight gain, no muscle  4. Weight gain, with " +
                "muscle");
        String newPreference = input.next();


        //File writer
        try {
            //Writer object
            PrintWriter myWriter = new
                    PrintWriter(new
FileWriter("/Users/chriskim/IdeaProjects/Trivia game/src/com/company/userInformationFile",
                    true));
            //Write into file all info
            myWriter.write("\n" + name + "," + password + "," + weight + "," +  height + "," +
                    newPreference);
            //Close object
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //If, if else statements to call main methods depending on preference
        if (newPreference.equals("1")) {
            //Calling method1
            System.out.println(Main.method1( weight,  height));
        } else if (newPreference.equals("2")) {
            //Calling method2
            System.out.println(Main.method2( weight,  height));
        } else if (newPreference.equals("3")) {
            //Calling method3
            System.out.println(Main.method3( weight,  height));
        } else if (newPreference.equals("4")) {
            //Calling method4
            System.out.println(Main.method4( weight,  height));
        } else {
            //Directing user to input numbers for preference
            System.out.println("Please select a number, restarting program...");
            //Calls new method
            reenterInfo();
        }

    }

    public static void oldInfo(String[] data)
    {
        double weight = Double.parseDouble(data[2]);
        double height = Double.parseDouble(data[3]);

        //If, if else statements to call main methods depending on preference
        if (data[4].equals("1")) {
            //Calling method1
            System.out.println(Main.method1(weight, height));
        } else if (data[4].equals("2")) {
            //Calling method2
            System.out.println(Main.method2(weight, height));
        } else if (data[4].equals("3")) {
            //Calling method3
            System.out.println(Main.method3(weight, height));
        } else if (data[4].equals("4")) {
            //Calling method4
            System.out.println(Main.method4(weight, height));
        } else {
            //Directing user to input numbers for preference
            System.out.println("Please select a number, restarting program...");
            //Restarts method
            reenterInfo();
        }


    }
    public static void reenterInfo()
    {
        //Scanner
        Scanner input = new Scanner(System.in);

        //Asking for name again
        System.out.println("Please enter name again: ");
        String name = input.next();

        //Asking for password again
        System.out.println("Please enter your password again: ");
        String password = input.next();

        //File writer
        try {
            //make Print Writer object
            PrintWriter myWriter = new PrintWriter(new
                    FileWriter(
  "/Users/chriskim/IdeaProjects/Trivia game/src/com/company/userInformationFile",
                    true));
            //Write name and password into file
            myWriter.write( name + "," + password + ",");
            //Close writer object
            myWriter.close();
        } catch (IOException ex) {
            //Catch errors
            ex.printStackTrace();
        }

        //Calling newInformation method
        newInformation();

    }

}

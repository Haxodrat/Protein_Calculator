package com.company;
//Import Scanner
import java.util.Scanner;
//Import FileWriter Classes
import java.io.PrintWriter;
import java.io.FileWriter;
//Import Exception class
import java.io.IOException;
public class createUser {
    public static void makeAccount(String name) {
        //Make scanner
        Scanner input = new Scanner(System.in);

        //Introduction to function of program + user's name
        System.out.println("Hello, " + name + ". This is the Protein Calculator");

        //Ask to make password for future access and log-ins
        System.out.println("Please make a password");
        String password = input.next();

        //File writer
        try {
            //make Print Writer object
            PrintWriter myWriter = new PrintWriter(new
                    FileWriter(
 "/Users/chriskim/IdeaProjects/Trivia game/src/com/company/userInformationFile",
                    true));
            //Write name and password into file
            myWriter.write( "\n" + name + "," + password + ",");
            //Close writer object
            myWriter.close();
        } catch (IOException ex) {
            //Catch errors
            ex.printStackTrace();

        }

        //Call new information method to write more info
        updateInformation.newInformation();


    }
}

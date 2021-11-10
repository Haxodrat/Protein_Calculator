package com.company;
//Import exception class
import java.io.FileNotFoundException;
//Import arrays class
import java.util.ArrayList;
import java.util.Arrays;
//Import list class
import java.util.List;
//Import scanner
import java.util.Scanner;
//Import file class
import java.io.File;
public class existingUser {
    public static void accessProfile() throws FileNotFoundException
    {

        //region Scanner

        //Creating scanner
        Scanner input = new Scanner(System.in);

        //States that user is in file
        System.out.println("User is in file.");

        //Asking for password for access
        System.out.println("What is your password?");
        String password = input.next();

        //If statements regarding user's response for password
        String filePath =
                "/Users/chriskim/IdeaProjects/Trivia game/src/com/company/userInformationFile";
        Scanner fileReader = new Scanner(new File(filePath));

        //While loop to read file
        while (fileReader.hasNextLine()) {

            //Storing line to variable
            String dataLine = fileReader.nextLine();

            //Creating an empty array
            String[] individualData;

            //Storing and splitting the elements of the line into elements with commas
            individualData = dataLine.split(",");

            //Converting to list
            List<String> list = Arrays.asList(individualData);

            //Print list
            System.out.println(Arrays.stream(individualData).toList());

            //Checking if password that user inputted is within file using if statements
            //If statement that checks that password is in file
            if (password.equals(list.get(1)))
            {
                //Calls next method
                existingUser.continueAccess(individualData);
            }
            //Else if statement that checks if file is checking correct line and
            // line has correct password
            else if (!(fileReader.hasNextLine()) && !(password.equals(list.get(1))))
            {
                //Restarts program
                System.out.println("Incorrect Password");
                accessProfile();
            }

        }
    }

    public static void continueAccess(String[] individualData)
    {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Asking user if he/she wants to change their information
        System.out.println("Would you like to update your information? Yes or No.");
        String oldResponse = input.next();
        String newResponse = oldResponse.toLowerCase();

        //end region

        //if statement regarding user's response for updating information
        if (newResponse.equals("yes"))
        {
            //Calls replaceOldInfo method to update info within file
            updateInformation.replaceOldInfo();

            //Exits program
            System.exit(0);
        }
        else if (newResponse.equals("no"));
        {
            //Calls oldInfo method
            updateInformation.oldInfo(individualData);
            System.exit(0);
        }

    }
}

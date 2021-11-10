package com.company;
//Import Scanner class
import java.util.Scanner;
//Import File class
import java.io.File;
//Import FileNotFoundException class
import java.io.FileNotFoundException;

//Main class
public class Main
{

    //Main method
    public static void main(String[] args) throws FileNotFoundException
    {



        //Making count to determine if user is old or new user
        int count = 0;

        //Region Scanner

        //Creating scanner
        Scanner userScan = new Scanner(System.in);

        //Asking for name of user
        System.out.println("What is your name?");
        String name = userScan.next();

        //end region

        //Reading file to check for user's name
        String filePath = "/Users/chriskim/IdeaProjects/Trivia game/src/com/company/userInformationFile";
        //Creating new Scanner
        Scanner fileReader = new Scanner(new File(filePath));
        //While loop to read each line
        while (fileReader.hasNextLine()) {
            //Storing line to variable
            String dataLine = fileReader.nextLine();
            //Splitting the elements of the line into elements with commas
            String[] individualData = dataLine.split(",");
            //Storing the first elements of the data line into a variable
            String savedName = individualData[0];

            //Checking if name that user inputted is within file using if statements

            //name is in file
            if (name.equals(savedName))
            {
                //Add to count
                count ++;

                //Calling the accessProfile method within the existingUser class
                existingUser.accessProfile();
            }


        }

        //If count is zero, so the name did not equal an element in the file
        if (count == 0)
        {

            //Calling the makeAccount method within the createUser class
            createUser.makeAccount(name);
        }
    }

    //Methods for calculations

    //Method1 for weight loss, no muscle
    public static double method1(double weight, double height)
    {
        //Algorithm for protein calculations
        double weightProduct = (weight * 0.6);
        double heightProduct = (height * 0.2);
        System.out.print("Recommended Daily Protein Intake: ");
        return (weightProduct + heightProduct);


    }

    //Method2 for weight loss, with muscle
    public static double method2(double weight, double height)
    {
        //Algorithm for protein calculations
        double weightLossMuscle = (weight * 1.0);
        double heightLossMuscle = (height * 0.3);
        System.out.print("Recommended Daily Protein Intake: ");
        return (weightLossMuscle + heightLossMuscle);
    }

    //Method3 for weight gain, no muscle
    public static double method3(double weight, double height)
    {
        //Algorithm for protein calculations
        double weightGain = (weight * 0.6);
        double heightGain = (height * 0.1);
        System.out.print("Recommended Daily Protein Intake: ");
        return (weightGain + heightGain);
    }

    //Method4 for weight gain with muscle
    public static double method4(double weight, double height)
    {
        //Algorithm for protein calculations
        double weightGainMuscle = weight * 1.1;
        double heightGainMuscle = height * 0.1;
        System.out.print("Recommended Daily Protein Intake: ");
        return (weightGainMuscle + heightGainMuscle);

    }

}

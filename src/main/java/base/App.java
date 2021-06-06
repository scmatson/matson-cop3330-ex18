package base;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Scott Matson
 */
/*
Exercise 18 - Temperature Converter

You’ll often need to determine which part of a program is run based on user input or other events.

Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit. Prompt for the starting temperature.
The program should prompt for the type of conversion and then perform the conversion.

The formulas are
C = (F − 32) × 5 / 9 and F = (C × 9 / 5) + 32

Example Output

Press C to convert from Fahrenheit to Celsius.
Press F to convert from Celsius to Fahrenheit.
Your choice: C
Please enter the temperature in Fahrenheit: 32
The temperature in Celsius is 0.

Constraints
-Ensure that you allow upper or lowercase values for C and F.
-Use as few output statements as possible and avoid repeating output strings.

Challenges
-Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
-Break the program into functions that perform the computations.
-Implement this program as a GUI program that automatically updates the values when any value changes.
-Modify the program so it also supports the Kelvin scale.

 */
public class App {

    static Scanner ui = new Scanner(System.in);
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##0.##");
        System.out.println("Type C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        String cf = isCF();

        String c = "Celsius";
        String f = "Fahrenheit";

        if(cf.equals("c"))
        {
            System.out.print("Please enter the temperature in " + c + ": ");
            double temp = ui.nextDouble();
            double C_to_F = ((temp - 32) * 5 / 9);
            System.out.println("The temperature in " + f + " is " + df.format(C_to_F) + ".");

        }
        else
        {
            System.out.print("Please enter the temperature in " + f + ": ");
            double temp = ui.nextDouble();
            double F_to_C = ((temp * 9 / 5) + 32);
            System.out.println("The temperature in " + c + " is " + df.format(F_to_C) + ".");
        }
    }

    public static String isCF()
    {
        while(true)
        {
            String a = ui.nextLine();
            String b = a.toLowerCase();
            if(b.equals("c"))
            {
                return b;
            }
            else if(b.equals("f"))
            {
                return b;
            }
            else
            {
                System.out.print("Please type C for Celsius or F for Fahrenheit: ");
            }
        }
    }
}

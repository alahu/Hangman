package com.company;

import java.io.*;
import java.text.*;

public class Main
{
    public static void main (String[] args) throws IOException
    {
        //How to read a line from the keyboard
        //Declare an object of type BufferedReader as you see below

        BufferedReader in = new BufferedReader (new InputStreamReader (System.in));

        //To read in words from keyboard, assign a string variable the value of in.readLine()
        //To read in integers from keyboard, assign an int variable the value of Integer.parseInt(in.readLine())
        //To read in doubles (real) from keyboard, assign a double variable the value of Double.parseDouble(in.readLine())


	/*Example on on to read in from a file
	  You need to specify the whole path of where the file is located
	  The file has to exist or there will be a compiling error
	  Declare an object of type BufferedReader as you see below
	  To read in a line from a file, assign a string variable the value of fr.readLine()

	BufferedReader fr = new BufferedReader (new FileReader ("h:\\NetBeansProjects\\message.txt"));
	String message = "";
	message = fr.readLine();
	*/

        DecimalFormat o = new DecimalFormat("0.00");
        //To format numbers for outputting
        //Usage:  System.out.println(o.format(<variable>));
        //To read in a line from a file, assign a string variable the value of fr.readLine()


    } // main method
} // Template class


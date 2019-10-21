//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

import java.io.File;
import java.io.FileNotFoundException;

public class OddEvenCounterRunner
{
   public static void main(String args[])
   {
	   Scanner input;
	try {
		input = new Scanner(new File("OELine.txt"));
		OddEvenCounter count = new OddEvenCounter();
		   
		while(input.hasNextLine())
		{
			String Line = input.nextLine();
			count.setLine(Line);
			System.out.println(Line);
			System.out.println(count);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
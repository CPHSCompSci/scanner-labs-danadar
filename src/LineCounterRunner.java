//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;  
import java.io.File;
import java.io.FileNotFoundException;

public class LineCounterRunner
{
   public static void main(String[] args)
   {
	try {
		Scanner input = new Scanner(new File("LineCounter.txt"));
		LineCounter counter = new LineCounter();
		   
		while(input.hasNextLine())
		{
			String line = input.nextLine();
			counter.setLine(line);
			System.out.println(line);
			System.out.println(counter);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
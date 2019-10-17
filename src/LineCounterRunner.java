//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;  

public class LineCounterRunner
{
   public static void main(String[] args)
   {
	   Scanner input = new Scanner(System.in);
	   LineCounter counter = new LineCounter();
	   
	   System.out.println("Enter a list of numbers separated by spaces.");
	   counter.setLine(input.nextLine());
	   System.out.println();
	   System.out.println("Count = " + counter.getCount());
   }
}
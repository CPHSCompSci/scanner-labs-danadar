//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenCounterRunner
{
   public static void main(String args[])
   {
	   Scanner input = new Scanner(System.in);
	   OddEvenCounter count = new OddEvenCounter();
	   
	   System.out.println("Enter a line of strings separated by spaces");
	   count.setLine(input.nextLine());
	   System.out.println();
	   
	   System.out.println("even count = " + count.getEvenCount());
	   System.out.println("odd count = " + count.getOddCount());
	}
}
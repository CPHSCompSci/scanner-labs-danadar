//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenCounter
{
	private String line;

   public OddEvenCounter()
   {
	   this.line = "";
   }

   public OddEvenCounter(String s)
   {
	   this.line = s;
   }

	public void setLine(String s)
	{
		this.line = s;
	}

	public int getEvenCount()
	{
		int count= 0;
		char[] evens = {'0', '2', '4', '6', '8'};
		String[] nums = line.split(" ");
		
		for(String s: nums)
		{
			for(char c: evens)
			{
				if(s.charAt(s.length() - 1) == c)
				{
					count++;
				}
			}
		}
		
		return count;
	}

	public int getOddCount()
	{
		int count= 0;
		char[] odds = {'1', '3', '5', '7', '9'};
		String[] nums = line.split(" ");
		
		for(String s: nums)
		{
			for(char c: odds)
			{
				if(s.charAt(s.length() - 1) == c)
				{
					count++;
				}
			}
		}
		return count;
	}

	public String toString( )
	{
		return "";
	}
}
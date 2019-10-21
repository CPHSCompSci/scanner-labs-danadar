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
		Scanner even = new Scanner(line);
		
		while(even.hasNextInt())
		{
			if(even.nextInt() % 2 == 0)
			{
				count++;
			}
		}
		
		return count;
	}

	public int getOddCount()
	{
		int count= 0;
		Scanner odd = new Scanner(line);
		
		while(odd.hasNextInt())
		{
			if(odd.nextInt() % 2 == 1)
			{
				count++;
			}
		}
		
		return count;
	}

	public String toString( )
	{
		return "even count =" + this.getEvenCount() + "\nodd count = " + this.getOddCount();
	}
}
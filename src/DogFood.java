//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFood
{
   private double amount;

   public DogFood()
   {		
   }

   public DogFood(String line)
   {
		Scanner chopper = new Scanner(line);
		double cups = 0;
		
		String[] nums = line.split(" ");
		for(String s: nums)
		{
			if(Integer.parseInt(s) >= 80)
			{
				cups += 7.5;
			}
			else if(Integer.parseInt(s) >= 60)
			{
				cups += 6;
			}
			else if(Integer.parseInt(s) >= 40)
			{
				cups += 4.5;
			}
			else if(Integer.parseInt(s) >= 20)
			{
				cups += 3.5;
			}
			else if(Integer.parseInt(s) >= 10)
			{
				cups += 2;
			}
			else if(Integer.parseInt(s) >= 8)
			{
				cups += 1.5;
			}
			else if(Integer.parseInt(s) >= 5)
			{
				cups += 1;
			}
			else if(Integer.parseInt(s) >= 2)
			{
				cups += 0.5;
			}
			else
			{
				System.out.println("An invalid number was entered");
			}
		}
		this.amount = Math.ceil(cups / 10);
		System.out.println(cups + " cups");
   }

   public double getAmount()
   {
   		return amount;
   }

	public String toString()
	{
		return amount + " - 10 POUND BAGS\n";
	}
}
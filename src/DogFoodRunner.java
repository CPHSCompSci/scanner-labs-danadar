//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Math;

public class DogFoodRunner
{
	public static void main(String[] args)
	{
		Scanner input;
		try {
			input = new Scanner(new File("DogFood.txt"));
			DogFood food;
			
			while(input.hasNextLine())
			{
				String Line = input.nextLine();
				System.out.println(Line);
				food = new DogFood(Line);
				System.out.println(food);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
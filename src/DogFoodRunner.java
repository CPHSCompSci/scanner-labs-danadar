//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFoodRunner
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the dog's weight on the first day of each week, separated by a space.");
		DogFood food = new DogFood(input.nextLine());
		System.out.println(food.getAmount() + "- 10 POUND BAGS");
	}
}
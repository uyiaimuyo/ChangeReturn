import java.util.Scanner;
public class ChangeReturn 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
	
		int quars = 0;
		int dimes = 0;
		int nicks = 0;
		int pennies = 0;
		
		System.out.print("Please enter cash cost: $");
		double cost = scan.nextDouble();
		System.out.print("Please enter cash given: $");
		double amount = scan.nextDouble();
		
		double change = amount - cost;
		
		while(change > 0)
		{
			if(change >= 0.25)
			{
				change -= 0.25;
				quars++;
			}
			else if(change >= 0.10)
			{
				change -= 0.10;
				dimes++;
			}
			else if(change >= 0.05)
			{
				change -= 0.05;
				nicks++;
			}
			else if(change >= 0.01)
			{
				change -= 0.01;
				pennies ++;
			}	
		}
		System.out.println("Your change comes to " + quars + " quarters, " + nicks + " nickels, " + dimes + " dimes and " + pennies + " pennies.");
		
	}

}

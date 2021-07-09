package hit.day05;

import java.util.Scanner;
public class ProgrammingDemo3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a value...");
		int i=scan.nextInt();
		
		switch(i)
		{			
			case 100:
			{
				System.out.println("the value is 100....");
				break;
			}
			case 200:
			{
				System.out.println("the value is 200.....");
				break;
			}
			default:
			{
				System.out.println("the value entered should either 100 or 200");
			}
				
		}
	}
}

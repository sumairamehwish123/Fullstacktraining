package hit.day05;

import java.util.Scanner;
public class ProgrammingDemo1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number...:");
		int i=scan.nextInt();
		
		if(i==100)
		{
			System.out.println("Yes the value is 100............");
			System.out.println("second line...");
		}
		else if(i==200)
		{
			System.out.println("the value is 200................");	
		}
		else if(i==300) {
			System.out.println("the value is 300..................");
		}
		else {
			System.out.println("the value cannot be other than 100/200/300");
		}
	}
}
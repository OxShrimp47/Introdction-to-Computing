/*Name:Tommy Lee Truong
 *Last Edit:Mar 17 2017
 *Program Name:Number
 */
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number 0-25: ");
		double num = input.nextInt();
		char charA = 'A';
		
		if (num <= 25 && num >= 0)
			System.out.println("You have entered " + num + ", character of the alphabet is " + (char)(charA + num));
		else
			System.out.println("Outside of acceptable range");	
		
	
			
		
	}

}

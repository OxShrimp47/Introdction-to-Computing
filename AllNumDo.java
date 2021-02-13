/*Name:Tommy Lee Truong
 *Last Edit:Apr 14 2017
 *Program Name: Sum All 3
 */
import java.util.Scanner;

public class AllNumDo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		int i = 0, Sum = 0;
		//add a Sum variable
		do {Sum = Sum + i;
		// Create code to find Sum total of numbers
			System.out.println("Number " + i);
			i++;
		} while ( i <= max);
		System.out.print("Sum " + Sum);
		//Output the Sum total of numbers
	}
}

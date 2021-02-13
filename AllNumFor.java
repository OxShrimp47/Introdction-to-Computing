/*Name:Tommy Lee Truong
 *Last Edit:Apr 14 2017
 *Program Name: Sum All 2
 */
import java.util.Scanner;

public class AllNumFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		int Sum = 0;
		//add variable for sum
		
		for (int i = 0; i <= max; i++) {
			Sum = Sum + i;
			//add code to find sum
			System.out.println("Number " + i);
		}
		System.out.print("Sum "+ Sum);
		//output the sum
	}
}

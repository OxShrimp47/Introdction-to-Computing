/*Name:Tommy Lee Truong
 *Last Edit:Apr 7 2017
 *Program Name:Sum All
 */
import java.util.Scanner;
public class SumAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program will asks for a maximum number to print and print each number starting at 0 along with a total sum");
		System.out.println("Please in put maximum number to print");
		Scanner input = new Scanner(System.in);
		int Max = 0, Ans = 0;
		Max = input.nextInt();
		while (Max >= 0){
			System.out.println("number " + Max);
			Ans = Ans + Max;
			Max = --Max;
		
		}
		System.out.println("Sum is " + Ans);
	}

}

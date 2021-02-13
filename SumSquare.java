/*Name:Tommy Lee Truong
 *Last Edit:Apr 14 2017
 *Program Name: Sum of Squares
 */
import java.util.Scanner;
public class SumSquare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the max number: ");
		int Max = input.nextInt();
		int Sum = 0;
		for (int i = 1, Squ = 0; i <= Max; i++){
			Squ = i * i;
			System.out.println("Number " + i + " squared is " + Squ);
			Sum = Sum + Squ;
		}
		System.out.println("Sum of squares is " + Sum);

	}

}

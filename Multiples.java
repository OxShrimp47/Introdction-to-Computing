/*Name:Tommy Lee Truong
 *Last Edit:Apr 14 2017
 *Program Name: Multiples
 */
import java.util.Scanner;
public class Multiples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the max number: ");

		Scanner input = new Scanner(System.in);
		int Max = input.nextInt();
		System.out.println("Enter the Base: ");
		int Base = input.nextInt();
		for (int i = 1, Ans = 0; Ans <= Max; i++){
			Ans = Base * i;
			if (Ans <= Max)
			System.out.println("Number is " + Ans);
		}

	}

}

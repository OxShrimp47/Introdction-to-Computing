/*Name:Tommy Lee Truong
 *Last Edit:Aug 30 2017
 *Program Name: Remainder Function
 */
import java.util.Scanner;

public class RemainderFunc {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int max = 0;
		int divider = 0;
		int remainder = 0;
		System.out.print("Please enter the max number: ");
		max = num.nextInt();
		System.out.print("Please enter the divisor: ");
		divider = num.nextInt();
		for (int i = 1; i <= max; i++){
			remainder = i % divider;
			System.out.println("Num: " + i + " % " + divider + " = " + remainder);
		}
		num.close();
	}

}

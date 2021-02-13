/*Name:Tommy Lee Truong
 *Last Edit:Apr 14 2017
 *Program Name: Positive Average
 */
import java.util.Scanner;
public class PosAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0, avg = 0, t = 0, sum = 0;
		do {
			System.out.print("Enter " + t + " number: ");
			num = input.nextInt();
			if (num > 0){
			sum = sum + num;
			++t;}
			avg = sum/t;
		} while (num > 0);
		System.out.print("Average is " + avg);
	}

}

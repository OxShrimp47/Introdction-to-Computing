/*Name:Tommy Lee Truong
 *Last Edit:Apr 7 2017
 *Program Name: Any Average
 */
import java.util.Scanner;
public class AnyAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program will find the average of numbers between 0 and a positive input");
		System.out.println("Please input a number");
		Scanner input = new Scanner(System.in);
		int Num = 0, Sum = 0, Avg = 0, Num2 = 0;
		Num = input.nextInt();
		Num2 = Num+1;
		while (Num >= 0){
			Sum = Sum + Num;
			Num = --Num;
		}
		Avg = Sum/Num2;
		System.out.print("Average is " + Avg);
		
		
		
		
		
	}

}

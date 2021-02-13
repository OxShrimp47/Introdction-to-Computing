/*Name:Tommy Lee Truong
 *Last Edit:Apr 7 2017
 *Program Name:Even Number
 */
import java.util.Scanner;
public class EvenNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program will asks for a maximum number to print and print each even number starting at 0");
		System.out.println("Please in put maximum number to print");
		Scanner input = new Scanner(System.in);
		int Max = 0, Ans = 0;
		Max =  input.nextInt();
		if (Max < 0){
			System.out.print("Input is negative and cannot be run");
		}
		while(Max >= 0){
			Ans = Max % 2;
			if (Ans == 0){
			System.out.println(Max);
			}
			Max = --Max;
		}
		
	}

}

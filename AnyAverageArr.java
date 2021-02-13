/*Name:Tommy Lee Truong
 *Last Edit:Apr 21 2017
 *Program Name: Any Average Array
 */
import java.util.Scanner;
public class AnyAverageArr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("This program will find the average of any numbers");
		System.out.print("Please choose the amount of numbers to average :" );
		int num = input.nextInt();
		int[]arr1 = new int[num + 1];
		int x = 0;
		int i = 0;
		while (i < num){
			System.out.print("Please enter " + i + " number: ");
			arr1 [i] = input.nextInt();
			i++;
		}
		System.out.println("The numbers being averaged are:");
		i = 0;
		while (i < num){
		System.out.print(arr1[i] + " ");
		if ((i+1)%5 == 0){
			System.out.println("");
		}
		x = x + arr1[i];
		i++;
		
		}
		int avg = x/num;
		System.out.print("Average is : " + avg);
	}

}

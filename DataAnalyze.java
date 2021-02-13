/*Name:Tommy Lee Truong
 *Last Edit:Apr 30 2017
 *Program Name: Data Analysis
 */
import java.util.Scanner;

public class DataAnalyze {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the sample size: ");
		int size = input.nextInt();
		int[]arr1 = new int[size + 1];
		System.out.println("Enter numbers for Trial 1");
		for (int i = 1; i <= size; i++){
		System.out.print("Enter sample #" + i + ":");
		arr1[i] = input.nextInt();
		}
		int[]arr2 = new int[size + 1];
		System.out.println("Enter numbers for Trial 2");
		for (int i = 1; i <= size; i++){
			System.out.print("Enter sample #" + i + ":");
			arr2[i] = input.nextInt();
			}
		int[]arr3 = new int[size + 1];
		System.out.println("Enter numbers for Trial 3");
		for (int i = 1; i <= size; i++){
			System.out.print("Enter sample #" + i + ":");
			arr3[i] = input.nextInt();
			}
		int[]arr4 = new int[size + 1];
		System.out.println("Enter numbers for Trial 4");
		for (int i = 1; i <= size; i++){
			System.out.print("Enter sample #" + i + ":");
			arr4[i] = input.nextInt();
			}
		System.out.println("\tSample #\tTrial 1\tTrial 2\tTrial 3\tTrial 4");
		for (int i = 1; i <= size; i++){
		System.out.println("\t" + i + "\t\t" +arr1[i] + "\t" + arr2[i] + "\t" + arr3[i] + "\t" + arr4[i]);
	}
		int max = 0, min = 0, avg = 0, sum = 0, x= 0;
		System.out.print("\tAverage:");
		int[]arrA = new int[4];
		for ( x = 0; x < 4; x++){
			sum = 0;
			if (x==0){
		for (int i = 1; i <= size; i++){
			sum = arr1[i] + sum;
			avg = sum/size;
		}
			}
			if (x==1){
				for (int i = 1; i <= size; i++){
					sum = arr2[i] + sum;
					avg = sum/size;
				}
					}
			if (x==2){
				for (int i = 1; i <= size; i++){
					sum = arr3[i] + sum;
					avg = sum/size;
				}
					}
			if (x==3){
				for (int i = 1; i <= size; i++){
					sum = arr4[i] + sum;
					avg = sum/size;
				}
					}
			arrA[x] = avg;
			System.out.print("\t" + arrA[x]);
			max = arrA[0];
			min = arrA[0];
			if (arrA[x] >= max){
				max = arrA[x];
			}
			if (arrA[x] <= min){
				min = arrA[x];
			}
		}
		System.out.println("");
		System.out.println("Min Average: " + min);
		System.out.println("Max Avergae: " + max);
		if (min == max){
			System.out.print("The trials match EXACTLY!");
		}
			else if (max < (2 * min)){
			System.out.print("The trials concur with each other!");
			}
		
			else{
				System.out.print("The trials do not concur!");
			}
			
				
		}
	}	
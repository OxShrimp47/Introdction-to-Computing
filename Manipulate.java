/*Name:Tommy Lee Truong
 *Last Edit:Feb 17 2017
 *Program Name:Manipulating Numbers
 */
import java.util.Scanner;

public class Manipulate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Please input 2 numbers, ");
		System.out.println("this program will show their results in 5 arithmetic problems.");
		
		Scanner input = new Scanner (System.in);
		int n1, n2;
		System.out.println("Please enter a number.");
		n1 = input.nextInt();
		System.out.println("please enter another number.");
		n2 = input.nextInt();
		
		int sum;
		sum = (n1+n2);
		
		int difference;
		difference = (n1-n2);
		
		int product;
		product = (n1*n2);
		
		int quotient;
		quotient = (n1/n2);
		
		int percent;
		percent = (n1%n2);
		System.out.println("Their sum is " + sum);
		System.out.println("Their difference is " + difference);
		System.out.println("Their product is " + product);
		System.out.print("Their quotient is " + quotient);
		System.out.println(" with a remainder of " + percent);
		
		System.out.print("Please input 2  more numbers, ");
		System.out.println("this program will show their results in 5 arithmetic problems.");
		
		short n3, n4;
		System.out.println("Please enter a number.");
		n3 = input.nextShort();
		System.out.println("please enter another number.");
		n4 = input.nextShort();
		
		short sum2;
		sum2 = (short)(n3+n4);
		
		short difference2;
		difference2 = (short)(n3-n4);
		
		short product2;
		product2 = (short)(n3*n4);
		
		short quotient2;
		quotient2 = (short)(n3/n4);
		
		short percent2;
		percent2 = (short)(n3%n4);
		System.out.println("Their sum is " + sum2);
		System.out.println("Their difference is " + difference2);
		System.out.println("Their product is " + product2);
		System.out.print("Their quotient is " + quotient2);
		System.out.println(" with a remainder of " + percent2);
		
		System.out.print("Please input 2  more numbers, ");
		System.out.println("this program will show their results in 5 arithmetic problems.");
		
		float n5, n6;
		System.out.println("Please enter a number.");
		n5 = input.nextFloat();
		System.out.println("please enter another number.");
		n6 = input.nextFloat();
		
		float sum3;
		sum3 = (float)(n5+n6);
		
		float difference3;
		difference3 = (float)(n5-n6);
		
		float product3;
		product3 = (float)(n5*n6);
		
		float quotient3;
		quotient3 = (float)(n5/n6);
		
		float percent3;
		percent3 = (float)(n5%n6);
		System.out.println("Their sum is " + sum3);
		System.out.println("Their difference is " + difference3);
		System.out.println("Their product is " + product3);
		System.out.print("Their quotient is " + quotient3);
		System.out.println(" with a remainder of " + percent3);
		
		System.out.print("Please input 2  more numbers, ");
		System.out.println("this program will show their results in 5 arithmetic problems.");
		
		double n7, n8;
		System.out.println("Please enter a number.");
		n7 = input.nextDouble();
		System.out.println("please enter another number.");
		n8 = input.nextDouble();
		
		double sum4;
		sum4 = (double)(n7+n8);
		
		double difference4;
		difference4 = (double)(n7-n8);
		
		double product4;
		product4 = (double)(n7*n8);
		
		double quotient4;
		quotient4 = (double)(n7/n8);
		
		double percent4;
		percent4 = (double)(n7%n8);
		System.out.println("Their sum is " + sum4);
		System.out.println("Their difference is " + difference4);
		System.out.println("Their product is " + product4);
		System.out.print("Their quotient is " + quotient4);
		System.out.println(" with a remainder of " + percent4);
	}

}

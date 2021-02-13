/*Name:Tommy Lee Truong
 *Last Edit:Feb 17 2017
 *Program Name:Interviewer2
 */
import java.util.Scanner;

public class Interviewer2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner (System.in);

		
		String name;
		System.out.print("What is your name?");
		name = input.nextLine();
		
		int age;
		System.out.print("Hello, ");
		System.out.print(name);
		System.out.println(". How ;old are you?");
		age = input.nextInt();
		
		int fat;
		System.out.println("How much do you weigh in pounds?");
		fat = input.nextInt();
		int fat2;
		fat2 = (int)(fat/2.2);
		
		String home;
		System.out.print("Where are you from?");
		home = input.nextLine();
		
		String color;
		System.out.print("What is your favorite color?");
		color = input.nextLine();
		
		String share;
		System.out.print(name);
		System.out.print(" Would you mind if I share this information with the world?");
		share = input.nextLine();
		
		System.out.print(share);
		System.out.println("?");
		System.out.println("Interesting, Im gonna share it anyway.");
		System.out.println(name + " is " + age + " years old and lives in " + home+ ".");
		System.out.println("His favorite color is " + color + ". Who likes the color " + color + " eww!" );
		System.out.println("And he is really fat too, like " + fat2 + "kilograms!");
		System.out.print("It was nice to meet you " + name + ", lets talk again sometime.");
	
	}

}

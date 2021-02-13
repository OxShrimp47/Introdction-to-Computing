/*Name:Tommy Lee Truong
 *Last Edit:Sept 13 2017
 *Program Name: Cheese Shop 2
 */
import java.util.Random;
import java.util.Scanner;
public class GenCheeseShop {
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);
		final int MAXCHEESE = 5;
		
		String[] names = new String[MAXCHEESE];
		double[] prices = new double[MAXCHEESE];
		int[] amounts = new int[MAXCHEESE];
		double[] cost = new double[MAXCHEESE];
		double subT = 0;

		// Special 3 Cheeses
	if(0 < MAXCHEESE){
		names[0] = "Dalaran Sharp";
		prices[0] = 1.25;
	}if(1 < MAXCHEESE){
		names[1] = "Stormwind Brie";
		prices[1] = 10.00;
	}if(2 < MAXCHEESE){
		names[2] = "Alterac Swiss";
		prices[2] = 40.00;
}
 		System.out.println("We sell " + MAXCHEESE + " kinds of Cheese");
	if(0 < MAXCHEESE){
		System.out.println(names[0] + ": $" + prices[0] + " per pound");
	}if(1 < MAXCHEESE){
		System.out.println(names[1] + ": $" + prices[1] + " per pound");
	}if(2 < MAXCHEESE){
		System.out.println(names[2] + ": $" + prices[2] + " per pound");
 		
	}
 		Random ranGen = new Random(100);

		for (int i = 3; i < MAXCHEESE; i++) {
			names[i] = "Cheese Type " + (char)('A' + i);
			prices[i] = ranGen.nextInt(1000)/100.0;
			amounts[i] = 0;

			System.out.println(names[i] + ": $" + prices[i] + " per pound");
		}
		if (MAXCHEESE > 0){

		for (int i = 0; i < MAXCHEESE; i++) {

			System.out.print("Enter the amount of " + names[i] + "in lbs: ");
			amounts[i] = num.nextInt();
			cost[i] = amounts[i] * prices[i];
			subT += cost[i];
		}
		int item = 0;
System.out.print("Display the itemized list? (1 for yes) ");
item = num.nextInt();
if (item == 1){
for (int i = 0; i < MAXCHEESE; i++){
	if (amounts[i] > 0){
	System.out.println(amounts[i] + " lbs of " + names[i] + " @ " + prices[i] +  " = " + cost[i]);
	}}}
		}
double discount = 0;
if (subT >= 100.00){
	discount = 25.00;
}
else if (subT >= 50.00){
	discount = 10.00;
}
double Total = subT - discount;

System.out.println("Sub Total : $" + subT);
System.out.println("- Discount: $" + discount);
System.out.println("Total     : $" + Total);
num.close();
}
}


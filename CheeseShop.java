/*Name:Tommy Lee Truong
 *Last Edit:Sept 6 2017
 *Program Name: Cheese Shop
 */
import java.util.Scanner;
public class CheeseShop {
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);
		int aDS = 0;
		int aSB = 0;
		int aAS = 0;
		int item = 0;
System.out.println("We sell 3 kinds of Cheese!");
System.out.println("Dalaran Sharp: $1.25 per pound");
System.out.println("Stormwind Brie: $10.00 per pound");
System.out.println("Alterac Swiss: $40.00 per pound");
System.out.print("Enter the amount of in Dalaran Sharp lbs: ");
aDS = num.nextInt();
System.out.print("Enter the amount of in Stormwind Brie lbs: ");
aSB = num.nextInt();
System.out.print("Enter the amount of in Alterac Swiss lbs: ");
aAS = num.nextInt();
System.out.print("Display the itemized list? (1 for yes) ");
item = num.nextInt();
double cDS = aDS * 1.25;
double cSB = aSB * 10.00;
double cAS = aAS * 40.00;
double subT = cDS + cSB + cAS;
double discount = 0;
if (subT >= 100.00){
	discount = 25.00;
}
else if (subT >= 50.00){
	discount = 10.00;
}
double Total = subT - discount;

if (item == 1){
	if (aDS > 0){
	System.out.println(aDS + " lbs of Dalaran Sharp @ 1.25 = " + cDS);
	}if (aSB > 0){
	System.out.println(aSB + " lbs of Stormwind Brie @ 10.00 = " + cSB);
	}if (aAS > 0){
	System.out.println(aAS + " lbs of Alterac Swiss @ 40.00 = " + cAS);	
}}
System.out.println("Sub Total : " + subT);
System.out.println("- Discount: " + discount);
System.out.println("Total     : " + Total);
num.close();
}
}

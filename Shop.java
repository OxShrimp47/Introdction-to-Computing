/*Name:Tommy Lee Truong
 *Last Edit:Oct 13 2017
 *Program Name: Shop
 */
import java.util.Scanner;
public class Shop {		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int key = 100;
		String[]name = new String[key];
		Double[]price = new Double[key];
		int[]amt = new int[key];
		Double DR = 0.0;
		float DQ = 0;
		Double ST = 0.0;
		Double st = 0.0;
		int loop = 1;
		while (loop == 1) {
				System.out.println("This program supports 4 functions:");
				System.out.println("\t"+"1. Setup Shop");
				System.out.println("\t"+"2. Buy");
				System.out.println("\t"+"3. List Items");
				System.out.println("\t"+"4. Checkout");	
				System.out.print("Please choose the function you want: ");
					int Function = input.nextInt();
				if(Function == 1) {
					System.out.print("Please enter the number of items: ");
						key = input.nextInt();
					for(int i = 0; i <= key-1; i++) {
						System.out.print("Enter name of product " + i + ": ");
							name[i] = input.next();
						System.out.print("Enter price of product " + i + ": ");
							price[i] = input.nextDouble();
					}
					System.out.print("Please enter the amount to qualify for discount: ");
						DQ = input.nextFloat();
					System.out.print("Please enter the discount rate (0.1 for 10%): ");
						DR = input.nextDouble();
				}
				if(Function == 2) {
					if(key!=100) {
						
						for(int i = 0; i <= key-1; i++) {
							System.out.print("Enter the amount of  " + name[i] + ": ");
								amt[i] = input.nextInt();
							st = amt[i] * price[i];
							ST += st;
						}
					}
					else {
						System.out.println("Shop is not setup yet!");
					}
				}
				if(Function == 3) {
					if(ST>0) {
						for(int i = 0; i <= key-1; i++) {
							st = amt[i] * price[i];
							if(amt[i]>0) {
							System.out.println(amt[i] + " count of " + name[i] + " @ " + price[i] + " = " + st);
							}
						}
					}
					else {
						System.out.println("You have not bought anything");
					}
				}
				if(Function == 4) {
					if(key!=100) {
						Double Discount = 0.0;
						if(ST > DQ) {
							Discount = DR * ST;
						}
						Double Total = ST - Discount;
						System.out.println("Thanks for coming!");
						System.out.println("Sub Total: " + ST);
						System.out.println("-Discount: " + Discount);
						System.out.println("Total: " + Total);
					}
					else {
						System.out.println("Shop is not setup yet!");
					}
				}
				else if(Function >4) {
					System.out.print("Error: Do not know " + Function);
				}
		}
		input.close();
	}
}This program supports 4 functions:
	1. Setup Shop
	2. Buy
	3. List Items
	4. Checkout
Please choose the function you want: You have not bought anything
This program supports 4 functions:
	1. Setup Shop
	2. Buy
	3. List Items
	4. Checkout
Please choose the function you want: Please enter the number of items: Enter name of product 0: Enter price of product 0: Enter name of product 1: Enter price of product 1: Enter name of product 2: Enter price of product 2: Enter name of product 3: Enter price of product 3: Enter name of product 4: Enter price of product 4: Enter name of product 5: Enter price of product 5: Enter name of product 6: Enter price of product 6: Enter name of product 7: Enter price of product 7: Enter name of product 8: Enter price of product 8: Enter name of product 9: Enter price of product 9: Please enter the amount to qualify for discount: Please enter the discount rate (0.1 for 10%): This program supports 4 functions:
	1. Setup Shop
	2. Buy
	3. List Items
	4. Checkout
Please choose the function you want: You have not bought anything
This program supports 4 functions:
	1. Setup Shop
	2. Buy
	3. List Items
	4. Checkout
Please choose the function you want: Enter the amount of  stuff: Enter the amount of  thing: Enter the amount of  a: Enter the amount of  s: Enter the amount of  d: Enter the amount of  f: Enter the amount of  g: Enter the amount of  h: Enter the amount of  t: Enter the amount of  wht9: This program supports 4 functions:
	1. Setup Shop
	2. Buy
	3. List Items
	4. Checkout
Please choose the function you want: Enter the amount of  stuff: Enter the amount of  thing: Enter the amount of  a: Enter the amount of  s: Enter the amount of  d: Enter the amount of  f: Enter the amount of  g: Enter the amount of  h: Enter the amount of  t: Enter the amount of  wht9: This program supports 4 functions:
	1. Setup Shop
	2. Buy
	3. List Items
	4. Checkout
Please choose the function you want: 2 count of g @ 5.0 = 10.0
2 count of h @ 2.0 = 4.0
2 count of t @ 8.0 = 16.0
3 count of wht9 @ 56.0 = 168.0
This program supports 4 functions:
	1. Setup Shop
	2. Buy
	3. List Items
	4. Checkout
Please choose the function you want: Please enter the number of items: Enter name of product 0: Enter price of product 0: Enter name of product 1: Enter price of product 1: Please enter the amount to qualify for discount: Please enter the discount rate (0.1 for 10%): This program supports 4 functions:
	1. Setup Shop
	2. Buy
	3. List Items
	4. Checkout
Please choose the function you want: Please enter the number of items: Enter name of product 0: Enter price of product 0: Please enter the amount to qualify for discount: Please enter the discount rate (0.1 for 10%): This program supports 4 functions:
	1. Setup Shop
	2. Buy
	3. List Items
	4. Checkout
Please choose the function you want: Enter the amount of  Finale: This program supports 4 functions:
	1. Setup Shop
	2. Buy
	3. List Items
	4. Checkout
Please choose the function you want: 4 count of Finale @ 6.0 = 24.0
This program supports 4 functions:
	1. Setup Shop
	2. Buy
	3. List Items
	4. Checkout
Please choose the function you want: Thanks for coming!
Sub Total: 1522.0
-Discount: 1522.0
Total: 0.0
This program supports 4 functions:
	1. Setup Shop
	2. Buy
	3. List Items
	4. Checkout
Please choose the function you want: Enter the amount of  Finale: This program supports 4 functions:
	1. Setup Shop
	2. Buy
	3. List Items
	4. Checkout
Please choose the function you want: Thanks for coming!
Sub Total: 7522.0
-Discount: 7522.0
Total: 0.0
This program supports 4 functions:
	1. Setup Shop
	2. Buy
	3. List Items
	4. Checkout
Please choose the function you want: Error: Do not know 7This program supports 4 functions:
	1. Setup Shop
	2. Buy
	3. List Items
	4. Checkout
Please choose the function you want: 
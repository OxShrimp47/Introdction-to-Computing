/*Name:Tommy Lee Truong
 *Last Edit:Mar 19 2017
 *Program Name:Bobcar
 */
import java.util.Scanner;

public class Bobcar {

		public static void main (String[] args) {
			int Car, Day, Member, Package, Base, Base$, Discount;
			String Type;
			double Package$, Total;
			Scanner input = new Scanner (System.in);
			Base = 0;
			Package$ = 0;
			Package = 0;
			Discount = 0;
			Total = 0;
			Base$ = 0;
			Member = 0;
			Day = 0;
			Car = 0;
			Type = "A";
			System.out.println("Avaliable cars: 1 for Economy, 2 for Compact, 3 for Standard");
			System.out.println("Please choose the rental car: ");
			Car = input.nextInt();
			if (Car == 1) {
			Type = "Economy";
			}
			else if (Car == 2) {
			Type = "Compact";
			}
			else if (Car == 3) {
			Type = "Standard";
				}
			if (Car == 1) {
				Base$ = 35;
				}
			else if (Car == 2) {
				Base$ = 45;
				}
			else if (Car == 3) {
				Base$ = 95;
					}
			System.out.println("Please enter the number of rental days: ");
			Day = input.nextInt();
			Base = Base$ * Day;
			System.out.println("Club member?: 1 for yes,  0 for no: ");
			Member = input.nextInt();
			if (Member == 1) {
				System.out.println("Platinum Executive Package?: 1 for yes, 0 for no: ");
				Package = input.nextInt();
			}
				if (Package == 1) {
					Package$ = .15 * Base;
			}
			
			if (Member == 1) {
				Discount = Base$*(Day/7);
			}
			Total = Base - Discount + Package$;
			System.out.println("Base: " + Day + " days for a " + Type + " @ " + Base$ + " per day: $" + Base);
			if (Member == 1) {
			System.out.println("Club Member Discount: -$" + Discount);
			}
			if (Package == 1) {
			System.out.println("Platinum Executive Package: +$" + Package$);
			}
			System.out.println("Total Estimate for Rental: $" + Total);
			
			
		}
	
}

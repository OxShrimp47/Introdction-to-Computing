/*Name:Tommy Lee Truong
 *Last Edit:Nov 13 2017
 *Program Name: Roommate Compatibility Program 
 */
public class Date {
	private int year = 1900;
	private int month = 1;
	private int day = 1;
	
	public void Year (int newYear) {
		if (newYear > 3000 || newYear < 1900 ) {
			throw new IllegalArgumentException("year should be in the range of [1900-3000].");
		}
		else {
			year = newYear;
		}
	}
	public void Month (int newMonth) {
		if (newMonth > 12 || newMonth < 1 ) {
			throw new IllegalArgumentException("month should be in the range of [1-12].");
		}
		else {
			month = newMonth;
		}
	}
	public void Day (int newDay) {
		if (month%2 == 1) {
			if (newDay > 31 || newDay < 1 ) {
				throw new IllegalArgumentException("day should be in the range of [1-31].");
			}
			else {
				day = newDay;
			}
		}
		else if (month == 2) {
			if (newDay > 28 || newDay < 1) {
				throw new IllegalArgumentException("day should be in the range of [1-28].");
			}
			else {
				day = newDay;
			}
		}
		else {
			if (newDay > 30 || newDay < 1 ) {
				throw new IllegalArgumentException("day should be in the range of [1-30].");
			}
			else {
				day = newDay;
			}
		}
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public int comparedate (Date dt) {
		 int Diff = (Math.abs(this.getYear() - dt.getYear()) * 12) + (Math.abs(this.getMonth() - dt.getMonth()));
		return Diff;
	}
}



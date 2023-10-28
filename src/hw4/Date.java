package hw4;

class Date {
	static int year;
	static int month;
	static int day;

	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	} 

	public int DayOfYear() {
		int[] dayOfMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31 };
		if (twomonth()) {
			dayOfMonth[2] = 29;
		}
		int dayOfYear = 0;
		for (int i = 0; i < month; i++) {
			dayOfYear += dayOfMonth[i];
		}
		dayOfYear += day;
		return dayOfYear;
	}

	public boolean twomonth() {

		return (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0));

	}
}

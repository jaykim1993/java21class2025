package PrivateEx;

public class PrivateTest {

	// public 접근제어자를 이용하여 멤버변수를 정의한다.
	private int day = 30;
	private int month;
	private int year = 2026;
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(month == 2) {
			if(day<1 || day>28) {
				System.out.println("날짜오류");
			}
		}else this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}


}

import java.util.Calendar;

public class Date {
private int day;
private int month; 
private int year;
Calendar calendar = Calendar.getInstance();

public Date (int day , int month , int year) {
	this.day=day;
	this.month=month;
	this.year=year;
}
 
public int getDay() {
	return day;
}

public void setDay(int day) {
	this.day = day;
}

public int getMonth() {
	return month;
}

public void setMonth(int month) {
	this.month = month;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}
public Date getToday() {
	day=calendar.get(Calendar.DATE);
	month =calendar.get(Calendar.MONTH);
	year=calendar.get(Calendar.YEAR);
	Date today = new Date(day,month,year);
	return today;
}
public boolean isBefore(Date A) {
	if(getYear()>A.year) {
		return false;
	}
	if(getMonth()>A.month) {
		return false;
	}
	if(getDay()>A.day) {
		return false;
	}
	return true;
}



}

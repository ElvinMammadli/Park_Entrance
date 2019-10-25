import java.util.Calendar;

public class Substcription {
private Date begin;
private Date end;


public Substcription(Date begin , Date end, String plate) {
	this.begin=begin;
	this.end=end;
}


public Date getBegin() {
	return begin;
} 
public void setBegin(Date begin) {
	this.begin = begin;
}
public Date getEnd() {
	return end;
}
public void setEnd(Date end) {
	this.end = end;
}
 
public boolean isValid() {
	Calendar calendar = Calendar.getInstance();
	Date now = new Date(calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.MONTH), calendar.get(Calendar.YEAR));
	if(now.isBefore(begin)) {
		return false;
	}
	return true;
}


}

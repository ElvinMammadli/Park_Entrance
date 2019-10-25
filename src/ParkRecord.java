import java.util.Calendar;

public class ParkRecord {
private Time enterTime;
private Time exitTime;
private String plate ;
private Vehicle vehicle;
private boolean isSpecial; 
public int getParkingDuration() { 
	return 1;
} 
public ParkRecord(Time enterTime,Time exitTime,boolean issub) {
	this.enterTime=enterTime;
	this.exitTime=exitTime;
	this.isSpecial=isSpecial;
}

public Time getExitTime() {
	return exitTime;
}

public void setExitTime(Time exitTime) {
	this.exitTime = exitTime;
}

public Time getEnterTime() {
	return enterTime;
}

public void setEnterTime(Time enterTime) {
	this.enterTime = enterTime;
}

public Vehicle getVehicle() {
	return vehicle;
}

public void setVehicle(Vehicle vehicle) {
	this.vehicle = vehicle;
}

public boolean isIssub() {
	return isSpecial;
}

public void setIssub(boolean issub) {
	this.isSpecial = issub;
}
public String getPlate() {
	return plate;
}
public void setPlate(String plate) {
	this.plate = plate;
}
public int getDifference(Time other) {
	Calendar calendar = Calendar.getInstance();
 Time now = new Time(calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE));
 return (60*now.getHour()+now.getMinute())-(60*other.getHour()+other.getMinute());
}


}

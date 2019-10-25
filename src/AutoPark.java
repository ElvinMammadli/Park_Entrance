import java.util.ArrayList;

public class AutoPark {
private double hourlyFee;
private double incomeDaily;
private int capacity;
static int b; 


public AutoPark(double hourlyFee,int capacity) {
	this.hourlyFee=hourlyFee;
	this.capacity=capacity; 
}
private ArrayList <ParkRecord> parkRecords  = new ArrayList<ParkRecord>() ;
private ArrayList <SubscribedVehicle> SubscribedVehicles = new ArrayList<SubscribedVehicle>(); 

	

public boolean isParked(String plate) {
	int i=0;
	Time a = new Time(0,0);
	Time b = new Time(0,0);
	for (i =0; i<parkRecords.size();i++) {
		if(parkRecords.get(i).getPlate().equals(plate)) {
			a=parkRecords.get(i).getExitTime();
			b=parkRecords.get(i).getEnterTime();
			}
		}
			if((a==null)) {
				if(b==null) {
					return false;
				}
				else return true;
		}
return false;
}


public ParkRecord searchParked(String plate) {
	int i=0;
	Time a = new Time(0,0);
	Time b = new Time(0,0);

	for (i =0; i<parkRecords.size();i++) {
		if(parkRecords.get(i).getPlate().equals(plate)) {
			a=parkRecords.get(i).getExitTime();
			b=parkRecords.get(i).getEnterTime();

			if((a==null)) {
				if(b==null) {

					return null;
				}
				else return  parkRecords.get(i);
				}
			}
		}
			
				 return null;
		}



  
public SubscribedVehicle search(String e) {
	int i =0;
	for(i=0; i< SubscribedVehicles.size();i++) {
		if(SubscribedVehicles.get(i).getPlate().equals(e)) {
			return SubscribedVehicles.get(i);
		}
	}
	return null;
	
}
public boolean addVehicle(SubscribedVehicle b2) {
	SubscribedVehicles.add(b2);
	return true;

}

public void addRecord(ParkRecord a2) {
	parkRecords.add(a2);

}
public double getIncomeDaily() {
	return incomeDaily;
}

public void setIncomeDaily(double incomeDaily) {
	this.incomeDaily = incomeDaily;
}

public double getHourlyFee() {
	return hourlyFee;
}

public void setHourlyFee(double hourlyFee) {
	this.hourlyFee = hourlyFee;
}


public int getCapacity() {
	return capacity;
}


public void setCapacity(int capacity) {
	this.capacity = capacity;

}
public ArrayList <ParkRecord> getParkRecords() {
	return parkRecords;
}
public void setParkRecords(ArrayList <ParkRecord> parkRecords) {
	this.parkRecords = parkRecords;
}
public ArrayList <SubscribedVehicle> getSubVeh() {
	return SubscribedVehicles;
}
public void setSubVeh(ArrayList <SubscribedVehicle> subscribedVehicles) {
	this.SubscribedVehicles = subscribedVehicles;
}



}

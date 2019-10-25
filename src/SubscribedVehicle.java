import java.util.Calendar;

public class SubscribedVehicle implements Vehicle {
	private String plate;
	
	Calendar calendar = Calendar.getInstance();
	
Date now = new Date(calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.MONTH), calendar.get(Calendar.YEAR));
Date next =new Date(calendar.get(Calendar.DAY_OF_MONTH)+1, calendar.get(Calendar.MONTH), calendar.get(Calendar.YEAR));
	Substcription  sub = new Substcription(now, next, plate);
	public SubscribedVehicle(String plate) {
		this.plate=plate;
	} 
 
	public String getPlate() {			
		return plate;
	}
	

	public Substcription getSubstruction() {
		return null;
	}

	public boolean isSpecial() {
		return false;
	}

}

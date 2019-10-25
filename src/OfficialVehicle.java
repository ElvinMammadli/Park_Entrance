
public class OfficialVehicle implements Vehicle {
	private String plate;
	
	public OfficialVehicle(String plate) {
		this.plate=plate;
	}
	
	public String getPlate() {
		return plate;
	}

	public Substcription getSubstruction() {
		return null;
	}

	public boolean isSpecial() {
		return true;
	}
	

}

package model;

public class Tractor extends Vehicle{
	//1. variables
	private String additionalTechniques;
	private boolean isOnlyLargeTires;
	
	//2. get and set
	public String getAdditionalTechniques() {
		return additionalTechniques;
	}
	public void setAdditionalTechniques(String additionalTechniques) {
		if(additionalTechniques != null && additionalTechniques.matches("[A-Za-z0-9 .]+"))
			this.additionalTechniques = additionalTechniques;
		else
			this.additionalTechniques = "-------";
	}
	public boolean isOnlyLargeTires() {
		return isOnlyLargeTires;
	}
	public void setOnlyLargeTires(boolean isOnlyLargeTires) {
		this.isOnlyLargeTires = isOnlyLargeTires;
	}
	
	
	//3. constructors
	public Tractor() {
		super();
		setAdditionalTechniques("Extra tires");
		setOnlyLargeTires(false);
	}
	
	public Tractor(String title, float price, int quantity, 
			EnergyType type, String additionalTechniques, boolean isOnlyLargeTires)
	{
		super(title, price, quantity, type);
		setAdditionalTechniques(additionalTechniques);
		setOnlyLargeTires(isOnlyLargeTires);
	}
	
	public Tractor(int id, String title, float price, int quantity, 
			EnergyType type, String additionalTechniques, boolean isOnlyLargeTires)
	{
		super(id, title, price, quantity, type);
		setAdditionalTechniques(additionalTechniques);
		setOnlyLargeTires(isOnlyLargeTires);
	}
	
	
	//4. toSTring
	public String toString()
	{
		return super.toString() + " " + additionalTechniques + " " + isOnlyLargeTires;
	}
	
	//5. other functions
	

}

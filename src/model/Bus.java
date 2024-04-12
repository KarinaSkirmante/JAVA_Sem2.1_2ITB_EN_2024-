package model;

public class Bus extends Vehicle{

	//1. variables
	private int numberOfSeats;
	private boolean hasBaggageDivision;
	
	//2. get and set
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		if(numberOfSeats > 5 && numberOfSeats < 300)
			this.numberOfSeats = numberOfSeats;
		else
			this.numberOfSeats = 10;
	}
	public boolean isHasBaggageDivision() {
		return hasBaggageDivision;
	}
	public void setHasBaggageDivision(boolean hasBaggageDivision) {
		this.hasBaggageDivision = hasBaggageDivision;
	}
	
	//3. constructors
	public Bus() {
		super();
		setNumberOfSeats(50);
		setHasBaggageDivision(true);
	}
	
	public Bus(String title, float price, int quantity, EnergyType type, int numberOfSeats, boolean hasBaggageDivision )
	{
		super(title, price, quantity, type);
		setNumberOfSeats(numberOfSeats);
		setHasBaggageDivision(hasBaggageDivision);
	}
	
	//4. toString
	public String toString() {
		return super.toString() + " " + numberOfSeats + " " + hasBaggageDivision;
	}
	
}

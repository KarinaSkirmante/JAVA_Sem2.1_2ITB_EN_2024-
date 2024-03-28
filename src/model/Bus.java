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
	
	//4. toString
	
}

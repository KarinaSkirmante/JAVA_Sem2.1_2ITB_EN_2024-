package service;

import model.EnergyType;

public abstract class Vehicle {
	//1. variables
	private int id;
	private String title;
	private String code;
	private float price;
	private int quantity;
	private EnergyType energyType;
	
	private static int counter = 0;
	//2. get and set
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = counter;
		counter++;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title != null && title.matches("[A-Za-z ]{3,20}"))
			this.title = title;
		else
			this.title = "-------";
	}
	public String getCode() {
		return code;
	}
	public void setCode() {
		this.code = id + "_" + title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		if(price > 0 && price < 1000000)
			this.price = price;
		else
			this.price = 1000; 
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity > 0 && quantity < 1000)
			this.quantity = quantity;
		else
			this.quantity  =1;
	}
	public EnergyType getEnergyType() {
		return energyType;
	}
	public void setEnergyType(EnergyType energyType) {
		if(energyType != null)
			this.energyType = energyType;
		else
			this.energyType = EnergyType.not_specified;
	}
	

	
	
	
	
	//3. constructors
	
	//4. toString
	

}

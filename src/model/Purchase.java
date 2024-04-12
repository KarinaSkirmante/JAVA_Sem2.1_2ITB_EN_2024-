package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Purchase {
	//1.variables
	private String userCardId;
	//no need set functions for these variables because they are already initialized
	private ArrayList<Vehicle> shoppingList = new ArrayList<Vehicle>();
	private LocalDateTime dateTime = LocalDateTime.now();
	
	//2. get an set
	public String getUserCardId() {
		return userCardId;
	}
	public void setUserCardId(String userCardId) {
		if(userCardId !=null && userCardId.matches("[0-9]{10}"))
			this.userCardId = userCardId;
		else
			this.userCardId = "0000000000";
	}
	public ArrayList<Vehicle> getShoppingList() {
		return shoppingList;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setShoppingList(ArrayList<Vehicle> shoppingList) {
		if(shoppingList != null)
			this.shoppingList = shoppingList;
		else
			this.shoppingList = new ArrayList<Vehicle>();
	}
	
	//3. constructors
	public Purchase()
	{
		setUserCardId("0101010101");
	}
	
	public Purchase(String userCardId)
	{
		setUserCardId(userCardId);
	}
	
	public Purchase(String userCardId, ArrayList<Vehicle> shoppingList) {
		setUserCardId(userCardId);
		setShoppingList(shoppingList);
	}
	
	//4. toString
	public String toString() {
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		return userCardId + ": " + shoppingList.size() + "[" + dateTime.format(formatter) + "]"; 
	}
	
	
	
	
	
	
	//5. other functions
	
	
	
	
	
	
	
	
	
	
}

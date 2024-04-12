package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import service.MainService;

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
	public void addVehicleToShoppingListByVehicleCode(String code, int howMany) throws Exception{
		if(code == null) throw new Exception("Code is null");
		
		for(Vehicle tempV: MainService.allVehicles) {//all vehicles in my shop
			if(tempV.getCode().equals(code))//this bus or tractor is found
			{
				if(tempV.getQuantity()- howMany < 0) {
					throw new Exception("The quantity is less than You want to buy");
				}
				else
				{
					if(tempV instanceof Bus)
					{
						Bus busFromService = (Bus)tempV;
						Bus boughtBus = new Bus(busFromService.getTitle(), busFromService.getPrice(),
								howMany,busFromService.getEnergyType(), busFromService.getNumberOfSeats(),
								busFromService.isHasBaggageDivision());
						shoppingList.add(boughtBus);
					}
					else if(tempV instanceof Tractor) {
						Tractor tractorFromService = (Tractor) tempV;
						Tractor boughtTractor = new Tractor(tractorFromService.getTitle(),
								tractorFromService.getPrice(),
								howMany,tractorFromService.getEnergyType(),
								tractorFromService.getAdditionalTechniques() , 
								tractorFromService.isOnlyLargeTires());
						shoppingList.add(boughtTractor);						
					}
				
					
					
					tempV.setQuantity(tempV.getQuantity()-howMany);
				}
				return;
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}

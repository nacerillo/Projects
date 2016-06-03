import java.util.*;
public class Location2 {
	private String name;
	private String description;
	private ArrayList<Items> locItems;
	//private String headsup;
	

	public Location2(String myName, String myDesc, ArrayList<Items> item ) {
		name = myName;
		description = myDesc;
		locItems = item;
		//headsup = indicator;
		//details = myDetails; 
		
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return description;
	}

	public Items getItemOne() {
		return locItems.get(0);
		
	}

	public Items getItemTwo() {
		return locItems.get(1);
	}

	public Items getItemThree() {
		return locItems.get(2);
	}


}





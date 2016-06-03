import java.util.*;

public class Items {
	private String itName;
	private String itDescription;

	public Items(String itemName, String itemDesc) {
		itName = itemName;
		itDescription = itemDesc;
	}

	public String getItem() {
		return itName;
	}

	public String examineItem() {
		return itDescription;
	}

}

/*import java.util.*;

public class Items {
	private String itName;
	private String itDescription;

	public Items(String itemName, String itemDesc) {
		itName = itemName;
		itDescription = itemDesc;
	}

	public String grabItem() {
		return itName;
	}

	public String examineItem() {
		return itDescription;
	}

}*////


package ar.com.exercise;

/**
 * Enum of rental types
 */
public enum RentalTypes {
	
	BY_HOUR("by_hour", 5, 24),
    BY_DAY("by_day", 20, 15),
    BY_WEEK("by_week", 60, 4);
	
	private final String type;
    private final int price;
    private final int max;
    
	private RentalTypes(String type, int price, int max) {
		this.type = type;
		this.price = price;
		this.max = max;
	}

	public String getType() {
		return type;
	}

	public int getPrice() {
		return price;
	}

	public int getMax() {
		return max;
	}

}

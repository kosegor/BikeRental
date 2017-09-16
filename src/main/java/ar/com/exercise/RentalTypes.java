package ar.com.exercise;

/**
 * Enum of rental types
 */
public enum RentalTypes {
	
	BY_HOUR(5, 24),
    BY_DAY(20, 15),
    BY_WEEK(60, 4);
	
    private final int price;
    private final int max;
    
	private RentalTypes(int price, int max) {
		this.price = price;
		this.max = max;
	}

	public int getPrice() {
		return price;
	}

	public int getMax() {
		return max;
	}

}

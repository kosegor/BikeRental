package ar.com.exercise;

/*
 * 
 * Simple Rental class
 */
public class Rental {
	
	private RentalTypes rentalType;
	private String bike;
	public static final int MAXIMUM_QUANTITY = 20;
	private int quantity;
	
	/**
	 * 
	 * @return Result of rental total price
	 * @throws IllegalArgumentException Thrown quantity or rental type is not set.
	 */
	public int calculateRentalTotalPrice(){
		if (!validateQuantity() || rentalType == null){
			throw new IllegalArgumentException("Please set quantity and rental type");
		}
		return quantity*rentalType.getPrice();
	}
	
	/**
	 * 
	 * @param quantity How many hours/days/weeks is the rental
	 * @throws IllegalArgumentException Thrown when quantity is not between 1 and MAX.
	 */
	public void setQuantity(int quantity) {
		if (rentalType == null){
			throw new IllegalArgumentException("Please set rental type");
		}
		if (!validateQuantity()){
			throw new IllegalArgumentException("The quantity must be between 1 and " 
            		+ String.valueOf(rentalType.getMax()));
		}
		this.quantity = quantity;
	}
	
	/**
	 * 
	 * @param name Bikes name
	 * @throws IllegalArgumentException Thrown when bikes name is empty.
	 */
	public void setBike(String bike) {
		if (bike == null || bike.isEmpty()) {
			throw new IllegalArgumentException("The bikes name cant be empty");
        }
		this.bike = bike;
	}
	
	/**
	 * Validate quantity
	 */
	private boolean validateQuantity(){
		if (quantity < 0 || quantity > rentalType.getMax()) {
			return false;
        }
		return true;
	}
	
	public void setRentalType(RentalTypes rentalType) {
		this.rentalType = rentalType;
	}
}

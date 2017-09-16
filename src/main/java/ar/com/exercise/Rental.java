package ar.com.exercise;

/*
 * 
 * Simple Rental class
 */
public class Rental {
	
	private RentalTypes rentalType;
	private String bike;
	private int quantity;
	
	/**
	 * 
	 * @return Result of rental total price
	 */
	public int calculateRentalTotalPrice(){
		return quantity*rentalType.getPrice();
	}
	
	/**
	 * 
	 * @param quantity How many hours/days/weeks is the rental
	 */
	public void setQuantity(int quantity) throws Exception{
		if (quantity < 0 || quantity > rentalType.getMax()) {
			System.out.println("The quantity must be between 1 and " 
            		+ String.valueOf(rentalType.getMax()));
        }
		this.quantity = quantity;
	}
	
	/**
	 * 
	 * @param name Bikes name
	 */
	public void setBike(String bike) throws Exception {
		if (bike.isEmpty()) {
			System.out.println("The bikes name cant be empty");
        }
		this.bike = bike;
	}
	
	public RentalTypes getRentalType() {
		return rentalType;
	}
	public void setRentalType(RentalTypes rentalType) {
		this.rentalType = rentalType;
	}
	public String getBike() {
		return bike;
	}
	
	public int getQuantity() {
		return quantity;
	}

}

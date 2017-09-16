package ar.com.exercise;

import java.util.ArrayList;
/**
 * Family Rental class
 *
 */
public class FamilyRental {
	
	private ArrayList<Rental> rentalsList =  new ArrayList<Rental>();
	private static final int DISCOUNT = 30;
	private static final int MIN_RENTALS = 3;
	private static final int MAX_RENTALS = 5;
	
	/**
	 * 
	 * @return Calculation of rental total price
	 */
	public double calculateRentalTotalPrice(){
		int rentalPricesSum = 0;
		for (Rental rental : rentalsList) {
			rentalPricesSum=+rental.calculateRentalTotalPrice();
		}
		return rentalPricesSum/100*(100-DISCOUNT);
	}
	
	/**
	 * 
	 * @param rentalsList The list of rentals the familyRental contain
	 */
	public void setRentalsList(ArrayList<Rental> rentalsList) throws Exception {
		if (rentalsList.size() < MIN_RENTALS || rentalsList.size() > MAX_RENTALS) {
            System.out.println("The rentals quantity must be between " 
            		+ String.valueOf(MIN_RENTALS) + " and " + String.valueOf(MAX_RENTALS));
        }
		this.rentalsList = rentalsList;
	}

	public ArrayList<Rental> getRentalsList() {
		return rentalsList;
	}

}

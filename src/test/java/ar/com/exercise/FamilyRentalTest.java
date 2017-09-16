package ar.com.exercise;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit test for FamilyRental.
 */
public class FamilyRentalTest {
	
	private static final double DELTA = 1e-15;

	@Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentForNullList() {
		FamilyRental familyRental = new FamilyRental();
        familyRental.setRentalsList(null);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentForLessMinListSize() {
		FamilyRental familyRental = new FamilyRental();
		ArrayList<Rental> rentals = new ArrayList<Rental>();
        familyRental.setRentalsList(rentals);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentForMoreMaxListSize() {
		FamilyRental familyRental = new FamilyRental();
		ArrayList<Rental> rentals = new ArrayList<Rental>();
		for (int i = 0; i < FamilyRental.MAX_RENTALS+1; i++) {
			Rental rental = new Rental();
			rentals.add(rental);
		}
        familyRental.setRentalsList(rentals);
    }
	
	@Test
    public void testForCalculateFamilyRental() {
		FamilyRental familyRental = new FamilyRental();
		ArrayList<Rental> rentals = new ArrayList<Rental>();
        Rental rentalOne = new Rental();
        rentalOne.setRentalType(RentalTypes.BY_WEEK);
        rentalOne.setQuantity(3);
        Rental rentalTwo = new Rental();
        rentalTwo.setRentalType(RentalTypes.BY_DAY);
        rentalTwo.setQuantity(1);
        Rental rentalThree = new Rental();
        rentalThree.setRentalType(RentalTypes.BY_HOUR);
        rentalThree.setQuantity(10);
        
        rentals.add(rentalOne);
        rentals.add(rentalTwo);
        rentals.add(rentalThree);
        
        familyRental.setRentalsList(rentals);
        
        double totalPriceCalculated = familyRental.calculateRentalTotalPrice();
        double totalPriceExpected = ((3*60)+(10*5)+(1*15))/100*(100-FamilyRental.DISCOUNT);
        assertEquals(totalPriceCalculated, totalPriceExpected, DELTA);
    }
}

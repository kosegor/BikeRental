package ar.com.exercise;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for Rental.
 */
public class RentalTest {
	
	@Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentForRentalWithNullBike() {
        Rental rental = new Rental();
        rental.setBike(null);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentForRentalWithEmptyBike() {
        Rental rental = new Rental();
        rental.setBike("");
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentForRentalWithNullRentalType() {
        Rental rental = new Rental();
        rental.setQuantity(2);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentForRentalWithNegativeQuantity() {
        Rental rental = new Rental();
        rental.setRentalType(RentalTypes.BY_DAY);
        rental.setQuantity(-1);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentForRentalWithWrongQuantityByHour() {
        Rental rental = new Rental();
        rental.setRentalType(RentalTypes.BY_HOUR);
        rental.setQuantity(RentalTypes.BY_HOUR.getMax()+1);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentForRentalWithWrongQuantityByDay() {
        Rental rental = new Rental();
        rental.setRentalType(RentalTypes.BY_DAY);
        rental.setQuantity(RentalTypes.BY_DAY.getMax()+1);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentForRentalWithWrongQuantityByWeek() {
        Rental rental = new Rental();
        rental.setRentalType(RentalTypes.BY_WEEK);
        rental.setQuantity(RentalTypes.BY_WEEK.getMax()+1);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentForCalculateWithNullRentalType() {
        Rental rental = new Rental();
        rental.setRentalType(null);
        rental.calculateRentalTotalPrice();
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentForCalculateWithNullQuantity() {
        Rental rental = new Rental();
        rental.setRentalType(RentalTypes.BY_DAY);
        rental.calculateRentalTotalPrice();
    }
	
	@Test
    public void testForCalculateByHour() {
        Rental rental = new Rental();
        rental.setRentalType(RentalTypes.BY_HOUR);
        rental.setQuantity(10);
        rental.setBike("bike by hour");
        int totalPriceCalculated = rental.calculateRentalTotalPrice();
        int totalPriceExpected = 10*5;
        assertEquals(totalPriceCalculated, totalPriceExpected);
    }
	
	@Test()
    public void testForCalculateByDay() {
        Rental rental = new Rental();
        rental.setRentalType(RentalTypes.BY_DAY);
        rental.setQuantity(1);
        rental.setBike("bike by day");
        int totalPriceCalculated = rental.calculateRentalTotalPrice();
        int totalPriceExpected = 1*20;
        assertEquals(totalPriceCalculated, totalPriceExpected);
    }
	
	@Test
    public void testForCalculateByWeek() {
        Rental rental = new Rental();
        rental.setRentalType(RentalTypes.BY_WEEK);
        rental.setQuantity(3);
        rental.setBike("bike by week");
        int totalPriceCalculated = rental.calculateRentalTotalPrice();
        int totalPriceExpected = 3*60;
        assertEquals(totalPriceCalculated, totalPriceExpected);
    }

}

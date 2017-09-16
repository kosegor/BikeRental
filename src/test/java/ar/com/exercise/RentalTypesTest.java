package ar.com.exercise;

import org.junit.Test;

public class RentalTypesTest {
	@Test
    public void should() {
		RentalTypes.valueOf(RentalTypes.BY_DAY.toString());
	}
}

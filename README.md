# Design:
I designed 2 classes and 1 enum for the solution.
 - 	RentalTypes is an enum that contains the 3 rental modalities.
	Each one contains the price per hour/day/week and the max quantity of hours/days/weeks the client can order.
 -  Rental is a class that models a simple rental order.
	It contains the name of bike, rental type and quantity of order, the setter methods with validations for the attributes and the method to calculate the final price.
 -  FamilyRental is a class that models a family rental package.
	It contains a collection of rentals, the setter method with validations and the method to calculate the final price.
	
#Development Practices:
I used IllegalArgumentException to throw when the setter's parameter is invalid or out of defined range.
I created unitary tests for each class. The dependencies I used for test generation and reports are:
	- JUnit
	- Jacoco

#Technologies Used:
 - Eclipse Mars
 - Maven 3.5.0
 - Java 8
 
#Running the Tests:
 - To run the tests open the command line, locate in the project root folder and run 'mvn test'.
 - To see the tests report go to ..\target\jacoco-ut and open the index.html file.

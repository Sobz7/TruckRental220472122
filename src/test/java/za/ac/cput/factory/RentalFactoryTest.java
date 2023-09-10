// RentalFactory Test.java
// Rental Factory Test Classes
// Author: Sobantu Malotana (220472122)
// Date: 07 April 2023

package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Rental;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RentalFactoryTest {
    @Test
    public void test(){
        Rental rental = RentalFactory.createRental(122,12,123, LocalDate. of(2023, 11, 31) ,LocalDate. of(2023, 11, 31) ,42750.0);
        System.out.println(rental.toString());
        assertNotNull(rental);
    }
}
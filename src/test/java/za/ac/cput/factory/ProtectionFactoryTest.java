

package za.ac.cput.factory;

import org.junit.jupiter.api.Test;

import za.ac.cput.domain.Protection;

import static org.junit.jupiter.api.Assertions.*;

class ProtectionFactoryTest {

    @Test
    public void createProtection(){

        Protection protection = ProtectionFactory.createProtection("cdm" , "rmd", "do not call", "december" , "october");
        // assertNotNull(protection);
        // assertNotNull(protection);
        System.out.println(protection);

    }

}


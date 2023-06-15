/*
Driver Service Implementation Test Class
DriverServiceImplTest.java
@Author: Siyakha Manisi (219239657)
12 June 2023
*/

package za.ac.cput.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Driver;
import za.ac.cput.factory.DriverFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class DriverServiceImplTest {
    private static DriverServiceImpl service = null;
    private static Driver driver = DriverFactory.createDriver("Siyakha", "Manisi", "siya@gmail.com", 10528, "Code 8", 71819, 546321);

    public DriverServiceImplTest()
    {
        service = DriverServiceImpl.getService();

    }

    @Test
    void a_create()
    {
        Driver created = service.create(driver);
        assertNotNull(created);
        System.out.println("Created: " + created);

    }

    @Test
    void b_read()
    {
        Driver read = service.read(driver.getDriverID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update()
    {
        Driver updated = new Driver.Builder().copy(driver)
                .setName("Siyah")
                .setSurname("M")
                .setEmail("manisi@gmail.com")
                .setIdNumber(20305)
                .setLicenseNo("Code 10")
                .setRentalID(789123)
                .build();
        assertNotNull(service.update(updated));
        System.out.println("Updated: " + updated);

    }

    @Test
    void e_delete()
    {
        boolean success = service.delete(driver.getDriverID());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void d_getAll()
    {
        System.out.println("Show All: ");
        System.out.println(service.getAll());
    }

}
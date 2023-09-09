/*
LoginDetail Service Implementation Test Class
LoginDetailServiceImplTest.java
@Author: Siyakha Manisi (219239657)
12 June 2023
*/
package za.ac.cput.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.LoginDetail;
import za.ac.cput.factory.LoginDetailFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class LoginDetailServiceImplTest {

    private static LoginDetailServiceImpl service = null;
    private static LoginDetail logind = LoginDetailFactory.createLoginDetail("Girlie there", "MeanMe?1");


    public LoginDetailServiceImplTest()
    {
        service = LoginDetailServiceImpl.getService();

    }
    @Test
    void a_create()
    {
        LoginDetail created = service.create(logind);
        assertNotNull(created);
        System.out.println("Created: " + created);

    }

    @Test
    void b_read()
    {
        LoginDetail read = service.read(logind.getUsername());
        assertNotNull(read);
        System.out.println("Read: " + read);

    }

    @Test
    void c_update()
    {
        LoginDetail updated = new LoginDetail.Builder().copy(logind)
                .setPassword("123#@Cool")
                .build();
        assertNotNull(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete()
    {
        boolean success = service.delete(logind.getUsername());
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
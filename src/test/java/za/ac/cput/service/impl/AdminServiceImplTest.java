//Admin Service Implementation Test Class
//Author: Chenique Jacobs (220388172)
//Date: 14/06/2023
package za.ac.cput.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Admin;
import za.ac.cput.factory.AdminFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class AdminServiceImplTest {
    private static AdminServiceImpl service = null;
    private static Admin admin = AdminFactory.createAdmin(1001,"Chenique","Jacobs", "cheniquejacobs@gmail.com");

    public AdminServiceImplTest(){
        service = AdminServiceImpl.getService();
    }

    @Test
    void a_create() {
        Admin created = service.create(admin);

        assertNotNull(created);
        System.out.println("create: "+created);

    }

    @Test
    void b_read() {
        Admin read = service.read(String.valueOf(admin.getAdminId()));
        assertNotNull(read);
        System.out.println("read: "+read);

    }

    @Test
    void c_update() {
        Admin updated = new Admin.Builder().copy(admin).setName("Jordy").setSurname("Meye").setEmail("meyej@gmail.com").build();
        assertNotNull(service.update(updated));
        System.out.println("updated: "+updated);

    }

    @Test
    void e_delete() {
        boolean success = service.delete(String.valueOf(admin.getAdminId()));
        assertTrue(success);
        System.out.println("deleted: "+ success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: "+ service.getAll());
    }
}
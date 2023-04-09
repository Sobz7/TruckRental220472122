package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.LoginDetail;

import static org.junit.jupiter.api.Assertions.*;

class LoginDetailFactoryTest {
    @Test
    public void test()
    {
        LoginDetail ld = LoginDetailFactory.createLoginDetail("Siya h2851M", "123#@SMani");
        System.out.println(ld.toString());
        assertNotNull(ld);
    }

}
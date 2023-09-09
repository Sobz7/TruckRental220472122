//Customer Factory class
// java class
// Author: Jordy Meye (220072841)
// Date: 24 03 2023

package za.ac.cput.factory;

import za.ac.cput.domain.Customer;
import za.ac.cput.util.Helper;

public class CustomerFactory {

    public static Customer createEmployee(String customerId, String name, String surname , String email , String address, String licenseNumber){

        if(!Helper.isValidEmail(email))

            return null;

        if(Helper.isNullorEmpty(customerId)|| Helper.isNullorEmpty(name) || Helper.isNullorEmpty(address) || Helper.isNullorEmpty(licenseNumber))
            return null;

        return new Customer.Builder().setCustomerId(licenseNumber).setName(name).setSurname(surname).setEmail(email).setAddress(address).setLicenseNumber(licenseNumber).build();

    }
}

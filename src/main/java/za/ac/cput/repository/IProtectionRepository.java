
//Interface Protection Repository
// Interface
// Author: Jordy Meye (220072841)
// Date: 24 03 2023



package za.ac.cput.repository;


import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Protection;

import java.util.Collection;
import java.util.Set;
@Repository
public interface IProtectionRepository extends IRepository<Protection, String>{
    //create, read, delete
    Protection findByInsuranceId(String insuranceId);

    boolean existsById(String insuranceId);


    Collection<Object> findAll();
}

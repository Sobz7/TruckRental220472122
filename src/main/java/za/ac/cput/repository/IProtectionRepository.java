/**
//Interface Protection Repository
// Interface
// Author: Jordy Meye (220072841)
// Date: 24 03 2023



package za.ac.cput.repository;


import za.ac.cput.domain.Protection;

import java.util.Set;

public interface IProtectionRepository extends IRepository<Protection, String>{
    //create, read, delete
    public Set<Protection> getAll();
}
*/
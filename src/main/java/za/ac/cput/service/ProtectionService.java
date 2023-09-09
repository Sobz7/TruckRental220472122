
package za.ac.cput.service;

import za.ac.cput.domain.Protection;

import java.util.Set;

public interface ProtectionService extends  IService<Protection, String>{
    //create, read, update, delete
    Set<Object> getAll();
}


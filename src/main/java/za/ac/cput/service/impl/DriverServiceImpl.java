/*
Driver Service Implementation Class
DriverServiceImpl.java
@Author: Siyakha Manisi (219239657)
12 June 2023
*/

package za.ac.cput.service.impl;

import za.ac.cput.domain.Driver;
import za.ac.cput.repository.DriverRepository;
import za.ac.cput.service.DriverService;

import java.util.Set;

public class DriverServiceImpl implements DriverService {
    private static DriverServiceImpl serv = null;
    private DriverRepository repo = null;

    private DriverServiceImpl()
    {
        repo = DriverRepository.getRepository();

    }

    static DriverServiceImpl getService()
    {
        if(serv == null)
        {
            serv = new DriverServiceImpl();
        }
        return serv;

    }

    public Driver create (Driver driver)
    {
        Driver created = repo.create(driver);
        return created;
    }

    public Driver read (String driverID)
    {
        Driver read = repo.read((driverID));
        return read;

    }

    public Driver update (Driver driver)
    {
        Driver updated = repo.update(driver);
        return updated;

    }

    public boolean delete (String id)
    {
        boolean success = repo.delete(id);
        return success;

    }

    public Set<Driver> getAll()
    {
        return repo.getAll();

    }


}

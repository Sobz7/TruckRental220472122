/*
LoginDetail Service Implementation Class
LoginDetailServiceImpl.java
@Author: Siyakha Manisi (219239657)
12 June 2023
*/

package za.ac.cput.service.impl;

import za.ac.cput.domain.LoginDetail;
import za.ac.cput.repository.LoginDetailRepository;
import za.ac.cput.service.LoginDetailService;

import java.util.Set;

public class LoginDetailServiceImpl implements LoginDetailService{

    private static LoginDetailServiceImpl service = null;
    private LoginDetailRepository repo = null;

    private LoginDetailServiceImpl()
    {
        repo = LoginDetailRepository.getRepository();

    }

    public static LoginDetailServiceImpl getService()
    {
        if(service == null)
        {
            service = new LoginDetailServiceImpl();

        }
        return service;

    }

    public LoginDetail create (LoginDetail ld)
    {
        LoginDetail created = repo.create(ld);
        return created;

    }

    public LoginDetail read (String username)
    {
        LoginDetail read = repo.read(username);
        return read;

    }

    public LoginDetail update (LoginDetail ld)
    {
        LoginDetail updated = repo.update(ld);
        return updated;

    }

    public boolean delete (String username)
    {
        boolean success = repo.delete(username);
        return success;

    }

    public Set<LoginDetail> getAll()
    {
        return repo.getAll();

    }

}

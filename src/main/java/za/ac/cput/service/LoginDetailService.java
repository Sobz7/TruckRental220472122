/*
LoginDetail Service Interface
LoginDetailService.java
@Author: Siyakha Manisi (219239657)
12 June 2023
*/
package za.ac.cput.service;

import za.ac.cput.domain.LoginDetail;

import java.util.Set;

public interface LoginDetailService extends IService<LoginDetail, String> {
    public Set<LoginDetail> getAll();

}

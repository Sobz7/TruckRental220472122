package za.ac.cput.service;

import za.ac.cput.domain.Rental;

import java.util.Set;

public interface RentalService extends IService<Rental, String>{
    Rental read(Integer rentalId);

    boolean delete(Integer rentalId);

    public Set<Rental> getAll();
}

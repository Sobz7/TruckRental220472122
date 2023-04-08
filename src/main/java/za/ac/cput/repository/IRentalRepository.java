package za.ac.cput.repository;

import za.ac.cput.domain.Rental;

import java.util.Set;

public interface IRentalRepository extends IRepository<Rental, String>{

    Rental read(int rentalId);

    boolean delete(int rentalId);

    public Set<Rental> getAll();

}


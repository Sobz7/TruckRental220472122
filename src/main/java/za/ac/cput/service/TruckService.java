package za.ac.cput.service;
import  java.util.Set;
import za.ac.cput.domain.Truck;
public interface TruckService {
    Truck create(Truck truck);

    Truck read(String truckId);

   Truck update(Truck truck);

    boolean delete (String id);
    Set<Truck>getAll();

}
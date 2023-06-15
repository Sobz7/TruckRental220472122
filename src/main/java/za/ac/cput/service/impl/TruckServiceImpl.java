package za.ac.cput.service.impl;


import za.ac.cput.domain.Truck;
import za.ac.cput.repository.impl.TruckRepository;
import za.ac.cput.repository.impl.TruckRepository;
import za.ac.cput.service.TruckService;

import java.util.Set;

public class TruckServiceImpl implements TruckService {
    private static TruckServiceImpl service = null;
    private TruckRepository repository = null;

    private TruckServiceImpl(){
        repository = TruckRepository.getRespository();
    }

    public static TruckServiceImpl getService(){
        if (service==null){
            service = new TruckServiceImpl();
        }
        return service;
    }

    @Override
    public Truck create(Truck truck) {
        Truck created = repository.create(truck);
        return created;
    }

    @Override
    public Truck read(String returnId) {
        Truck read = repository.read(returnId);
        return read;
    }

    @Override
    public Truck update(Truck truck) {
        Truck updated = repository.update(truck);
        return updated;
    }

    @Override
    public boolean delete(String returnId) {
        boolean success = repository.delete(returnId);
        return success;
    }

    @Override
    public Set<Truck> getAll() {
        return repository.getAll();
    }
}

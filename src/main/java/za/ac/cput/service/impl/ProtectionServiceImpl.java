/* package za.ac.cput.service.impl;

import za.ac.cput.domain.Protection;
import za.ac.cput.repository.impl.ProtectionRepository;
import za.ac.cput.service.ProtectionService;

import java.util.Set;

public class ProtectionServiceImpl implements ProtectionService {
    private static ProtectionService service = null;
    private ProtectionRepository repository = null ;

    private ProtectionServiceImpl(){
        repository = ProtectionRepository.getRepository();
    }

    public static ProtectionService getService(){
        if(service == null){
            service = new ProtectionServiceImpl();

        }
        return service;
    }

    public Protection create (Protection protection){
        Protection created = repository.create(protection);
        return  created;
    }


    public Protection read(String insuranceId) {
        Protection read = repository.read(insuranceId);
        return read;
    }

    @Override
    public Protection update() {
        return null;
    }

    public Protection update(Protection protection) {
        Protection updated = repository.update(protection);
        return updated;
    }

    public boolean delete ( String id){
        boolean success = repository.delete(id);
        return success ;
    }


    public Set<Protection> getAll(){return repository.getAll();}

}
*/
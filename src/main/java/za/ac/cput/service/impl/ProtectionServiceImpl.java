
package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Protection;
import za.ac.cput.repository.IProtectionRepository;

import za.ac.cput.service.ProtectionService;

import java.util.Set;
import java.util.stream.Collectors;


@Service
public class ProtectionServiceImpl implements ProtectionService {
    private static ProtectionService service = null;

    @Autowired

    private IProtectionRepository repository ;


    @Override
    public Protection create (Protection insuranceId){
        return repository.create(insuranceId);

    }

    @Override
    public Protection read(String insuranceId) {
        Protection read = repository.read(insuranceId);
        return read;
    }

    @Override
    public Protection update(Protection protection) {
        if (this.repository.existsById(protection.getInsuranceId()))
            return this.repository.create(protection);
        return  null;
    }

    @Override
    public void delete ( String insuranceId){
        this.repository.delete(insuranceId);

    }
    public Set<Object> getAll(){
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }


}

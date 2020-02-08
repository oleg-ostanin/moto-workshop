package example.olegostanin.motoworkshop.services.springdatajpa;

import example.olegostanin.motoworkshop.model.Owner;
import example.olegostanin.motoworkshop.repositories.OwnerRepository;
import example.olegostanin.motoworkshop.repositories.VehicleRepository;
import example.olegostanin.motoworkshop.repositories.VehicleTypeRepository;
import example.olegostanin.motoworkshop.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jt on 8/5/18.
 */
@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final VehicleRepository vehicleRepository;
    private final VehicleTypeRepository vehicleTypeRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, VehicleRepository vehicleRepository,
                             VehicleTypeRepository vehicleTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.vehicleRepository = vehicleRepository;
        this.vehicleTypeRepository = vehicleTypeRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}

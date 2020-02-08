package example.olegostanin.motoworkshop.services.springdatajpa;

import example.olegostanin.motoworkshop.model.VehicleType;
import example.olegostanin.motoworkshop.repositories.VehicleTypeRepository;
import example.olegostanin.motoworkshop.services.VehicleTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jt on 8/5/18.
 */
@Service
@Profile("springdatajpa")
public class VehicleTypeSDJpaService implements VehicleTypeService {

    private final VehicleTypeRepository vehicleTypeRepository;

    public VehicleTypeSDJpaService(VehicleTypeRepository vehicleTypeRepository) {
        this.vehicleTypeRepository = vehicleTypeRepository;
    }

    @Override
    public Set<VehicleType> findAll() {
        Set<VehicleType> vehicleTypes = new HashSet<>();
        vehicleTypeRepository.findAll().forEach(vehicleTypes::add);
        return vehicleTypes;
    }

    @Override
    public VehicleType findById(Long aLong) {
        return vehicleTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public VehicleType save(VehicleType object) {
        return vehicleTypeRepository.save(object);
    }

    @Override
    public void delete(VehicleType object) {
        vehicleTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vehicleTypeRepository.deleteById(aLong);
    }
}

package example.olegostanin.motoworkshop.services.springdatajpa;

import example.olegostanin.motoworkshop.model.Vehicle;
import example.olegostanin.motoworkshop.repositories.VehicleRepository;
import example.olegostanin.motoworkshop.services.VehicleService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jt on 8/5/18.
 */
@Service
@Profile("springdatajpa")
public class VehicleSDJpaService implements VehicleService {

    private final VehicleRepository vehicleRepository;

    public VehicleSDJpaService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Set<Vehicle> findAll() {
        Set<Vehicle> vehicles = new HashSet<>();
        vehicleRepository.findAll().forEach(vehicles::add);
        return vehicles;
    }

    @Override
    public Vehicle findById(Long aLong) {
        return vehicleRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vehicle save(Vehicle object) {
        return vehicleRepository.save(object);
    }

    @Override
    public void delete(Vehicle object) {
        vehicleRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vehicleRepository.deleteById(aLong);
    }
}

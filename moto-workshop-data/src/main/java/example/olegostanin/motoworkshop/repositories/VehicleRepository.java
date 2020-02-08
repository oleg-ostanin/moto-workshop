package example.olegostanin.motoworkshop.repositories;

import example.olegostanin.motoworkshop.model.Vehicle;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
}

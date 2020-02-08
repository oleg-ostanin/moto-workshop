package example.olegostanin.motoworkshop.repositories;

import example.olegostanin.motoworkshop.model.VehicleType;
import org.springframework.data.repository.CrudRepository;

public interface VehicleTypeRepository extends CrudRepository<VehicleType, Long> {
}

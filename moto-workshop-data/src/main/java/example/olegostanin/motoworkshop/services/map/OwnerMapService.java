package example.olegostanin.motoworkshop.services.map;

import example.olegostanin.motoworkshop.model.Owner;
import example.olegostanin.motoworkshop.model.Vehicle;
import example.olegostanin.motoworkshop.services.OwnerService;
import example.olegostanin.motoworkshop.services.VehicleService;
import example.olegostanin.motoworkshop.services.VehicleTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by jt on 7/21/18.
 */
@Service
@Profile({"default", "map"})
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final VehicleTypeService vehicleTypeService;
    private final VehicleService vehicleService;

    public OwnerMapService(VehicleTypeService vehicleTypeService, VehicleService vehicleService) {
        this.vehicleTypeService = vehicleTypeService;
        this.vehicleService = vehicleService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        if(object != null){
            if (object.getVehicles() != null) {
                object.getVehicles().forEach(vehicle -> {
                    if (vehicle.getVehicleType() != null){
                        if(vehicle.getVehicleType().getId() == null){
                            vehicle.setVehicleType(vehicleTypeService.save(vehicle.getVehicleType()));
                        }
                    } else {
                        throw new RuntimeException("Vehicle Type is required");
                    }

                    if(vehicle.getId() == null){
                        Vehicle savedVehicle = vehicleService.save(vehicle);
                        vehicle.setId(savedVehicle.getId());
                    }
                });
            }

            return super.save(object);

        } else {
            return null;
        }
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}

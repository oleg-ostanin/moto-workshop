package example.olegostanin.motoworkshop.services.map;

import example.olegostanin.motoworkshop.model.Vehicle;
import example.olegostanin.motoworkshop.services.CrudService;

import java.util.Set;

/**
 * Created by jt on 7/21/18.
 */
public class VehicleServiceMap extends AbstractMapService<Vehicle, Long> implements CrudService<Vehicle, Long> {
    @Override
    public Set<Vehicle> findAll() {
        return super.findAll();
    }

    @Override
    public Vehicle findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vehicle save(Vehicle object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vehicle object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
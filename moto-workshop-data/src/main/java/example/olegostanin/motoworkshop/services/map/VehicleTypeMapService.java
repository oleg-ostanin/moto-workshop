package example.olegostanin.motoworkshop.services.map;

import example.olegostanin.motoworkshop.model.VehicleType;
import example.olegostanin.motoworkshop.services.VehicleTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VehicleTypeMapService extends AbstractMapService<VehicleType, Long> implements VehicleTypeService {

    @Override
    public Set<VehicleType> findAll() {
        return super.findAll();
    }

    @Override
    public VehicleType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public VehicleType save(VehicleType object) {
        return super.save(object);
    }

    @Override
    public void delete(VehicleType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

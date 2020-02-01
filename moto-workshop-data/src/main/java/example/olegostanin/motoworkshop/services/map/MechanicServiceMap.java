package example.olegostanin.motoworkshop.services.map;

import example.olegostanin.motoworkshop.model.Mechanic;
import example.olegostanin.motoworkshop.services.CrudService;
import example.olegostanin.motoworkshop.services.MechanicService;

import java.util.Set;

/**
 * Created by jt on 7/21/18.
 */
public class MechanicServiceMap extends AbstractMapService<Mechanic, Long> implements MechanicService {

    @Override
    public Set<Mechanic> findAll() {
        return super.findAll();
    }

    @Override
    public Mechanic findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Mechanic save(Mechanic object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Mechanic object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

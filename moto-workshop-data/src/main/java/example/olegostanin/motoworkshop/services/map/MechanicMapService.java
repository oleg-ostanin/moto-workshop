package example.olegostanin.motoworkshop.services.map;

import example.olegostanin.motoworkshop.model.Mechanic;
import example.olegostanin.motoworkshop.model.Speciality;
import example.olegostanin.motoworkshop.services.CrudService;
import example.olegostanin.motoworkshop.services.MechanicService;
import example.olegostanin.motoworkshop.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by jt on 7/21/18.
 */
@Service
@Profile({"default", "map"})
public class MechanicMapService extends AbstractMapService<Mechanic, Long> implements MechanicService {
    private final SpecialtyService specialtyService;

    public MechanicMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

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

        if (object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpecialty = specialtyService.save(speciality);
                    speciality.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
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

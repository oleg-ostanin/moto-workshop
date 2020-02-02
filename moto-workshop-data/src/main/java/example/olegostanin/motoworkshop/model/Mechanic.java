package example.olegostanin.motoworkshop.model;

import java.util.Set;

/**
 * Created by jt on 7/13/18.
 */
public class Mechanic extends Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}

package example.olegostanin.motoworkshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by jt on 7/13/18.
 */
@Entity
@Table(name = "types")
public class VehicleType extends BaseEntity {

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

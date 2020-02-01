package example.olegostanin.motoworkshop.model;

import java.time.LocalDate;

/**
 * Created by jt on 7/13/18.
 */
public class Vehicle extends BaseEntity{

    private VehicleType vehicleType;
    private Owner owner;
    private LocalDate productionDate;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }
}

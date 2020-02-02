package example.olegostanin.motoworkshop.model;

import java.time.LocalDate;

public class Visit extends BaseEntity{
    private LocalDate date;
    private String description;
    private Vehicle vehicle;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}

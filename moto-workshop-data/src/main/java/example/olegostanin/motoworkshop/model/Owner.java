package example.olegostanin.motoworkshop.model;

import java.util.Set;

/**
 * Created by jt on 7/13/18.
 */
public class Owner extends Person {
    private String address;
    private String city;
    private String telephone;

    private Set<Vehicle> vehicles;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Set<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}

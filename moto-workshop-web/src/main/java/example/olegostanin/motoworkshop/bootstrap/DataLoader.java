package example.olegostanin.motoworkshop.bootstrap;

import example.olegostanin.motoworkshop.model.Mechanic;
import example.olegostanin.motoworkshop.model.Owner;
import example.olegostanin.motoworkshop.model.VehicleType;
import example.olegostanin.motoworkshop.services.MechanicService;
import example.olegostanin.motoworkshop.services.OwnerService;
import example.olegostanin.motoworkshop.services.VehicleTypeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final MechanicService mechanicService;
    private final VehicleTypeService vehicleTypeService;

    public DataLoader(OwnerService ownerService, MechanicService mechanicService, VehicleTypeService vehicleTypeService) {
        this.ownerService = ownerService;
        this.mechanicService = mechanicService;
        this.vehicleTypeService = vehicleTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        VehicleType motorcycle = new VehicleType();
        motorcycle.setName("Motorcycle");
        VehicleType savedMotorcycleType = vehicleTypeService.save(motorcycle);

        VehicleType scooter = new VehicleType();
        scooter.setName("Scooter");
        VehicleType savedScooterType = vehicleTypeService.save(scooter);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Mechanic mechanic1 = new Mechanic();
        mechanic1.setFirstName("Sam");
        mechanic1.setLastName("Axe");

        mechanicService.save(mechanic1);

        Mechanic mechanic2 = new Mechanic();
        mechanic2.setFirstName("Jessie");
        mechanic2.setLastName("Porter");

        mechanicService.save(mechanic2);

        System.out.println("Loaded Mechanics....");
    }
}

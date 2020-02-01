package example.olegostanin.motoworkshop.bootstrap;

import example.olegostanin.motoworkshop.model.Mechanic;
import example.olegostanin.motoworkshop.model.Owner;
import example.olegostanin.motoworkshop.services.MechanicService;
import example.olegostanin.motoworkshop.services.OwnerService;
import example.olegostanin.motoworkshop.services.map.MechanicServiceMap;
import example.olegostanin.motoworkshop.services.map.OwnerServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final MechanicService mechanicService;

    public DataLoader(OwnerService ownerService, MechanicService mechanicService) {
        this.ownerService = ownerService;
        this.mechanicService = mechanicService;
    }

    @Override
    public void run(String... args) throws Exception {
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

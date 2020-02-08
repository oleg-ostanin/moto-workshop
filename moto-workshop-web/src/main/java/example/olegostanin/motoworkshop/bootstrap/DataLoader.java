package example.olegostanin.motoworkshop.bootstrap;

import example.olegostanin.motoworkshop.model.*;
import example.olegostanin.motoworkshop.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final MechanicService mechanicService;
    private final VehicleTypeService vehicleTypeService;
    private final SpecialtyService specialtyService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, MechanicService mechanicService, VehicleTypeService vehicleTypeService,
                      SpecialtyService specialtyService, VisitService visitService) {
        this.ownerService = ownerService;
        this.mechanicService = mechanicService;
        this.vehicleTypeService = vehicleTypeService;
        this.specialtyService = specialtyService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = vehicleTypeService.findAll().size();

        if (count == 0 ){
            loadData();
        }

    }

    private void loadData() {
        VehicleType motorcycle = new VehicleType();
        motorcycle.setName("Motorcycle");
        VehicleType savedMotorcycleType = vehicleTypeService.save(motorcycle);

        VehicleType scooter = new VehicleType();
        scooter.setName("Scooter");
        VehicleType savedScooterType = vehicleTypeService.save(scooter);

        Speciality electricity = new Speciality();
        electricity.setDescription("Electricity");
        Speciality savedElectricity = specialtyService.save(electricity);

        Speciality fuelSystem = new Speciality();
        fuelSystem.setDescription("Fuel system");
        Speciality savedFuelSystem = specialtyService.save(fuelSystem);

        Speciality engine = new Speciality();
        engine.setDescription("Engine");
        Speciality savedDentistry = specialtyService.save(engine);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("1231231234");

        Vehicle mikesMotorcycle = new Vehicle();
        mikesMotorcycle.setVehicleType(savedMotorcycleType);
        mikesMotorcycle.setOwner(owner1);
        mikesMotorcycle.setProductionDate(LocalDate.now());
        mikesMotorcycle.setRegNumber("a000aa78");
        owner1.getVehicles().add(mikesMotorcycle);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("1231231234");

        Vehicle fionasScooter = new Vehicle();
        fionasScooter.setRegNumber("a001aa78");
        fionasScooter.setOwner(owner2);
        fionasScooter.setProductionDate(LocalDate.now());
        fionasScooter.setVehicleType(savedScooterType);
        owner2.getVehicles().add(fionasScooter);

        ownerService.save(owner2);

        Visit catVisit = new Visit();
        catVisit.setVehicle(fionasScooter);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("Engine issues");

        visitService.save(catVisit);

        System.out.println("Loaded Owners....");

        Mechanic mechanic1 = new Mechanic();
        mechanic1.setFirstName("Sam");
        mechanic1.setLastName("Axe");
        mechanic1.getSpecialities().add(savedElectricity);

        mechanicService.save(mechanic1);

        Mechanic mechanic2 = new Mechanic();
        mechanic2.setFirstName("Jessie");
        mechanic2.setLastName("Porter");
        mechanic2.getSpecialities().add(savedFuelSystem);

        mechanicService.save(mechanic2);

        System.out.println("Loaded Mechanics....");
    }
}
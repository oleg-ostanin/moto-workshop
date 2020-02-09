package example.olegostanin.motoworkshop.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "vehicles")
public class Vehicle extends BaseEntity{

    @Column(name = "reg_number")
    private String regNumber;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private VehicleType vehicleType;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @Column(name = "production_date")
    private LocalDate productionDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vehicle")
    private Set<Visit> vists = new HashSet<>();
}

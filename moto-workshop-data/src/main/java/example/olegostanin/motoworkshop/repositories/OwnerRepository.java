package example.olegostanin.motoworkshop.repositories;

import example.olegostanin.motoworkshop.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}

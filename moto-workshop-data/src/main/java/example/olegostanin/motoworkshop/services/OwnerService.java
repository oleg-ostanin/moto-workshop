package example.olegostanin.motoworkshop.services;

import example.olegostanin.motoworkshop.model.Owner;


/**
 * Created by jt on 7/18/18.
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}

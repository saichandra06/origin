package com.saichandra.services;

import com.saichandra.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {

	Owner findByLastName(String lastName);

	
}

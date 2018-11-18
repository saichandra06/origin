package com.saichandra.services;

import java.util.Set;

import com.saichandra.model.Owner;

public interface OwnerService {

	Owner findByLastName(String lastName);

	Owner findById(Long id);

	Owner save(Owner owner);

	Set<Owner> findAll();
}

package com.saichandra.services;

import java.util.Set;

import com.saichandra.model.Pet;

public interface PetService {

	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();
}

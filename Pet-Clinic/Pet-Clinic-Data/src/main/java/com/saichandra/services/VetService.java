package com.saichandra.services;

import java.util.Set;

import com.saichandra.model.Vet;

public interface VetService {

	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();

}

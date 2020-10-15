package com.souhail.personnes.services;

import java.util.List;

import com.souhail.personnes.entities.Personne;

public interface PersonneService {
	Personne savePersonne(	Personne p);
	Personne updatePersonne(	Personne p);
	void deletePersonne(Personne p);
	 void deletePersonneById(Long id);
	 Personne getPersonne(Long id);
	List<Personne> getAllPersonnes();

}

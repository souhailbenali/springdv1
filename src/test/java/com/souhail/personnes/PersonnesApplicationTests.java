package com.souhail.personnes;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.souhail.personnes.entities.Personne;
import com.souhail.personnes.repos.PersonneRepository;


@SpringBootTest
class PersonnesApplicationTests {
	@Autowired
	private PersonneRepository personneRepository;


	@Test
	public void testCreatePersonne() {
	Personne pers = new Personne("souhail ben ali ",159.500,new Date());
	personneRepository.save(pers);
	}
	@Test
	public void testFindPersonne()
	{
		Personne p = personneRepository.findById(1L).get();
	System.out.println(p);
	}
	@Test
	public void testUpdatePersonne()
	{
		Personne p = personneRepository.findById(1L).get();
	p.setTaillePersonne(156.235);
	personneRepository.save(p);
}
	@Test
	public void testDeletePersonne()
	{
		personneRepository.deleteById(1L);;
		}

		@Test
		public void testListerTousPersonnes()
		{
		List<Personne> perss = personneRepository.findAll();
		for (Personne p : perss)
		{
		System.out.println(p);
		}
		}



}

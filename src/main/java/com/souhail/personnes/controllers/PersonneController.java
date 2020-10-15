package com.souhail.personnes.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.souhail.personnes.entities.Personne;
import com.souhail.personnes.services.PersonneService;

@Controller
public class PersonneController {
@Autowired
PersonneService personneService;
@RequestMapping("/showCreate")
public String showCreate()
{
return "createPersonne";
}
@RequestMapping("/savePersonne")
public String saveProduit(@ModelAttribute("personne") Personne personne,
                          @RequestParam("date") String date,
                          ModelMap modelMap) throws ParseException

{
	//conversion de la date
	 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	 Date dateEnregistrement = dateformat.parse(String.valueOf(date));
	 personne.setDateEnregistrement(dateEnregistrement);

Personne savePersonne = personneService.savePersonne(personne);
String msg ="personne enregistré avec Id "+savePersonne.getIdPersonne();
modelMap.addAttribute("msg", msg);
return "createPersonne";
}
@RequestMapping("/listePersonnes")
public String listePersonnes(ModelMap modelMap)
{
List<Personne> press = personneService.getAllPersonnes();
modelMap.addAttribute("personnes", press);
return "listePersonnes";
}
@RequestMapping("/supprimerPersonne")
public String supprimerPersonne(@RequestParam("id") Long id,
 ModelMap modelMap)
{
personneService.deletePersonneById(id);
List<Personne> press = personneService.getAllPersonnes();
modelMap.addAttribute("personnes", press);
return "listePersonnes";
}
@RequestMapping("/modifierPersonne")
public String editerPersonne(@RequestParam("id") Long id,ModelMap modelMap)
{
Personne p= personneService.getPersonne(id);
modelMap.addAttribute("personne", p);
return "editerPersonne";
}
@RequestMapping("/updatePersonne")
public String updateProduit(@ModelAttribute("personne") Personne personne,
                            @RequestParam("date") String date,
                            ModelMap modelMap) throws ParseException 
{
	//conversion de la date
	 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	 Date dateEnregistrement = dateformat.parse(String.valueOf(date));
	 personne.setDateEnregistrement(dateEnregistrement);
	 personneService.updatePersonne(personne);
	 List<Personne> press = personneService.getAllPersonnes();
	 modelMap.addAttribute("personnes", press);
	return "listePersonnes";
	}
}
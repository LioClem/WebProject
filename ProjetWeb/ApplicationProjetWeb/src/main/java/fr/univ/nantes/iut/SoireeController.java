package fr.univ.nantes.iut;

import fr.univ.nantes.iut.Soiree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/soirees")
public class SoireeController {
	
	@Autowired
	private SoireeService service;
	
	@RequestMapping("/create")
	public String create(@RequestParam String nom,@RequestParam String heure_debut, 
			@RequestParam String heure_fin, @RequestParam String date, @RequestParam
			int num_evt, @RequestParam int num_resto) {
	    Soiree s = service.create(nom, heure_debut, date, heure_fin, num_evt, num_resto);
	    return s.toString();
	  }
	
	@RequestMapping("/get")
	public Soiree getSoiree(@RequestParam String nom) {
		return service.getByNom(nom);
	}
	
	@RequestMapping("/getAll")
	public List<Soiree> getAll(){
		return service.getAll();
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam String nom,@RequestParam String heure_debut, 
			@RequestParam String heure_fin, @RequestParam String date, @RequestParam
			int num_evt, @RequestParam int num_resto) {
	    Soiree s = service.update(nom, heure_debut, date, heure_fin, num_evt, num_resto);
	    System.out.println("***************update réalisé****************");
	    return s.toString();
	  }
	
	@RequestMapping("/delete")
	public String delete(@RequestParam String nom) {
		service.delete(nom);
		return "Deleted " + nom;
	}
	
	@RequestMapping("/deleteAll")
	public String deleteAll() {
		service.deleteAll();
		return "All deteled";
	}
	
}

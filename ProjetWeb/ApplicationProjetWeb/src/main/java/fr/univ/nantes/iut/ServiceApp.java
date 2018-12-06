package fr.univ.nantes.iut;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.univ.nantes.iut.Evenement;
import fr.univ.nantes.iut.EvenementRepository;

/**
 * @author e187417p
 *
 */
@EnableAutoConfiguration
@ComponentScan
@RestController
@RequestMapping("/evenement")
public class ServiceApp {

	@Autowired
	Service service;
	
	@Autowired
	EvenementRepository evenementRepository;
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestBody Evenement evenement) {
		evenementRepository.save(evenement);		
	}
	
	/*@RequestMapping(value="{/id}")
	public Evenement read(@PathVariable String id) {
		return evenementRepository.findOne(id);
	}*/
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update(Evenement evenement) {
		evenementRepository.save(evenement);
	}
	
	@RequestMapping(value="{/id}", method = RequestMethod.DELETE)
	public void delete(String id) {
		evenementRepository.deleteById(id);
	}
	
	
	/*public String create(@RequestParam String nom, @RequestParam String description,
			@RequestParam String adresse, @RequestParam List<Double >coord, 
			@RequestParam String ville, @RequestParam Date date, @RequestParam String heureDebut,
			@RequestParam String heureFin, @RequestParam String type, @RequestParam String lieu ) {
		Evenement e = evtService.create(nom, description, adresse, coord, ville, date, heureDebut, heureFin, type, lieu);
		return e.toString();
	}*/
	/*@RequestMapping("/create")
	public String create(@RequestParam String nom, @RequestParam String description) {
		Evenement e = service.create(nom, description);
		return e.toString();
	}
	
	@RequestMapping("/get")
	public Evenement getEvenement(@RequestParam String nom) {
		return service.getByNom(nom);
	}
	@RequestMapping("/getAll")
		public List<Evenement> getAll(){
			return service.getAll();
		}
	@RequestMapping("/update")
	public String update(@RequestParam String nom, @RequestParam String description,
			@RequestParam String adresse, @RequestParam List<Double >coord, 
			@RequestParam String ville, @RequestParam Date date, @RequestParam String heureDebut,
			@RequestParam String heureFin, @RequestParam String type, @RequestParam String lieu) {
		Evenement e = service.update(nom, description, adresse, coord, ville, date, heureDebut, heureFin, type, lieu);
		return e.toString();
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam String nom) {
		service.delete(nom);
		return nom + "a été supprimé";
	}
	
	@RequestMapping("/deleteAll")
	public String deleteAll() {
		service.deleteAll();
		return "Tous les événements sont supprimés";
	}*/
	
	/*@RequestMapping("/")
	void main() {
		service.addEvt();
		service.addResto();
	}

	@RequestMapping("/Evenements")

	List<Evenement> evenements() {
		service.addEvt();
		return service.getAllEvenement();
	}

	@RequestMapping("/Restaurants")

	List<Restaurant> restaurants() {
		return service.getAllRestaurant();
	}

	@RequestMapping("/RestProche")

	List<Restaurant> resProches() {
		return service.getRestaurantsProche(evenements().get(0));
	}*/
	
}

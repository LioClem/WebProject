package fr.univ.nantes.iut;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.univ.nantes.iut.Evenement;
import fr.univ.nantes.iut.Soiree;
import fr.univ.nantes.iut.SoireeRepository;


/**
 * @author e187417p
 *
 */
@EnableAutoConfiguration
@ComponentScan
@RestController
public class ServiceApp {

	@Autowired
	Service service;
	
	@RequestMapping("/main")
	void main() {
		service.addEvt();
		service.addResto();
		
	}
	
	@RequestMapping("/Evenements")

	List<Evenement> evenements() {
		return service.getAllEvenement();
	}

	@RequestMapping("/Restaurants")

	List<Restaurant> restaurants() {
		return service.getAllRestaurant();
	}

	@RequestMapping("/lesRestos")
	public List<Restaurant> getLesRestos(@RequestParam int unEvt){
		return service.getRestaurantsProche(unEvt);
	}
	
	@RequestMapping("evenements/get")
	public Evenement getUnEvt(@RequestParam int evt){
		return service.getUnEvt(evt);
	}
	
	@RequestMapping("restaurants/get")
	public Restaurant getUnResto(@RequestParam int resto){
		return service.getUnResto(resto);
	}
	
	@RequestMapping("/drop")
	public void drop() {
		service.dropSoiree();
	}
	
}

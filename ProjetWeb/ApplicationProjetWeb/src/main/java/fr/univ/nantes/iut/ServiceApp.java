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
	
	@RequestMapping("/test")
	void main() {
		service.addEvt();
		service.addResto();
		
	}
	
	/*@RequestMapping("/test2")
	Soiree main2() {
		return service.createSoiree();
	}*/
	

	@RequestMapping("/Evenements")

	List<Evenement> evenements() {
		service.addEvt();
		return service.getAllEvenement();
	}

	@RequestMapping("/Restaurants")

	List<Restaurant> restaurants() {
		service.addResto();
		return service.getAllRestaurant();
	}

	/*@RequestMapping("/RestProche")

	List<Restaurant> resProches() {
		return service.getRestaurantsProche(evenements().get(0));
	}*/
	
	@RequestMapping("/lesRestos")
	public List<Restaurant> getLesRestos(@RequestParam int unEvt){
		return service.getRestaurantsProche(unEvt);
	}
	
}

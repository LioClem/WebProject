package fr.univ.nantes.iut;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.univ.nantes.iut.Evenement;


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
	}
	
}

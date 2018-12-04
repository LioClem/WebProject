/**
 * 
 */
package fr.univ.nantes.iut;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author e187417p
 *
 */
public class Service {
	
	@Autowired
	Factory factory;
	
	Evenement unEvt;
	
	public List<Evenement> getAllEvenement(){
		return factory.getAllEvenement();
		
	}
	
	public List<Restaurant> getAllRestaurant(){
		return factory.getAllRestaurant();
	}
	
	public List<Restaurant> getRestaurantsProche(Evenement unEvt){
		return factory.getDistance(unEvt);
	}
	

}

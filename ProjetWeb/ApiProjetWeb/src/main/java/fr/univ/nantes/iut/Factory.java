/**
 * 
 */
package fr.univ.nantes.iut;

import java.util.List;

/**
 * @author e187417p
 *
 */
public interface Factory {
	List<Evenement> getAllEvenement();
	List<Restaurant> getAllRestaurant();
	List<Restaurant> getDistance(Evenement unEvt);

}

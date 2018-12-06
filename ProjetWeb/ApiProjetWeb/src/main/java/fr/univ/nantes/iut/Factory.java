/**
 * 
 */
package fr.univ.nantes.iut;

import java.util.List;

import fr.univ.nantes.iut.Evenement;
import fr.univ.nantes.iut.Restaurant;

/**
 * @author e187417p
 *
 */
public interface Factory {
	List<Evenement> getAllEvenement();
	List<Restaurant> getAllRestaurant();
	List<Restaurant> getDistance(Evenement unEvt);

}

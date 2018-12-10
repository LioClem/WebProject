/**
 * 
 */
package fr.univ.nantes.iut;

import java.util.List;

import org.springframework.web.client.RestTemplate;


/**
 * @author e187417p
 *
 */
public class RepoImp implements Repo<Object> {

	@Override
	public List<RecordEvt> getLesEvenements() {
		RestTemplate restTemplate = new RestTemplate();
		LesEvenements objEvt = restTemplate.getForObject("https://data.nantesmetropole.fr/api/records/1.0/search/?dataset=244400404_agenda-evenements-nantes-nantes-metropole&rows=4300&facet=emetteur&facet=rubrique&facet=lieu&facet=ville", LesEvenements.class);
		return objEvt.getRecords();
	}
	
	@Override
	public List<RecordRest> getLesRestaurants() {
		RestTemplate restTemplate = new RestTemplate();
		LesRestaurants objRestaurant = restTemplate.getForObject("https://data.nantesmetropole.fr/api/records/1.0/search/?dataset=793866443_restaurants-en-loire-atlantique&rows=1500&facet=type&facet=categorie&facet=commune&facet=modepaiement&facet=departement", LesRestaurants.class);
		return objRestaurant.getRecords();
	}
	
	
}

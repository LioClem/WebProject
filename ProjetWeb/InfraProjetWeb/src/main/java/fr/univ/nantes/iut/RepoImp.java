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
		LesEvenements resObj = restTemplate.getForObject("https://data.nantesmetropole.fr/api/records/1.0/search/?dataset=244400404_agenda-evenements-nantes-nantes-metropole&facet=emetteur&facet=rubrique&facet=lieu&facet=ville", LesEvenements.class);
		return resObj.getRecords();
	}
	
}

/**
 * 
 */
package fr.univ.nantes.iut;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;



/**
 * @author e187417p
 *
 */
public class FactoryImp implements Factory  {
	
	@Autowired
	Repo<RecordEvt> repo;
	//Repo<RecordRest> repo_rest;
	
	@Override
	public List<Evenement> getAllEvenement() {
		List<RecordEvt> res = repo.getLesEvenements();

		return buildEvt(res);
	}
	
	@Override
	public List<Restaurant> getAllRestaurant() {
		List<RecordRest> res = repo.getLesRestaurants();
		return buildRest(res);
	}
	
	private List<Restaurant> buildRest(List<RecordRest> lesRests) {
		List<Restaurant> res = new ArrayList<>();
		int id = 1;
		for (RecordRest unRest : lesRests) {
			Restaurant rst = new Restaurant();
			rst.setId(id);
			rst.setNom(unRest.getFields().getNomoffre());
			rst.setAdresse(unRest.getFields().getAdresse2());
			rst.setCoord(unRest.getFields().getLocalisation());
			rst.setType(unRest.getFields().getCategorie());
			res.add(rst);
			id++;
		}
		return res;
		
	}
	
	
	
	private List<Evenement> buildEvt(List<RecordEvt> lesEvents) {
		List<Evenement> res = new ArrayList<>();
		int id = 1;
		Date date = null;
		Double coord[] = null;
		for (RecordEvt unEvent : lesEvents) {
			Evenement evt = new Evenement();
			evt.setId(id);
			evt.setNom(unEvent.getFields().getNom());
			evt.setAdresse(unEvent.getFields().getAdresse());
			evt.setDescription(unEvent.getFields().getDescription());
			evt.setHeure_debut(unEvent.getFields().getHeureDebut());
			evt.setHeure_fin(unEvent.getFields().getHeureFin());
			evt.setType(unEvent.getFields().getType());
			evt.setVille(unEvent.getFields().getVille());
			evt.setLieu(unEvent.getFields().getLieuQuartier());
			
			SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
			String dateString = unEvent.getFields().getDate();
			try {
				date = formatDate.parse(dateString);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			evt.setDate(date);
			//String formatLocation = unEvent.getFields().getLocation();
			//formatLocation.replace(" ", "");
			/*String string[] = unEvent.getFields().getLocation().split(",");
			coord[0] = Double.parseDouble(string[0]);
			coord[0] = Double.parseDouble(string[0]);*/
			//evt.setCoord(coord);
			res.add(evt);
			id++;
		}
		return res;
	}

}

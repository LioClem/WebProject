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

	Evenement unEvenenement;

	
	@Override
	public List<Evenement> getAllEvenement() {
		List<RecordEvt> res = repo.getLesEvenements();

		return build(res);
	}
	
	
	
	private List<Evenement> build(List<RecordEvt> lesEvents) {
		List<Evenement> res = new ArrayList<>();
		int id = 0;
		Date date = null;
		List<Double> coord = null;
		
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
			String formatLocation = unEvent.getFields().getLocation();
			formatLocation.replace(" ", "");
			String string[] = formatLocation.split(",");
			coord.add(Double.parseDouble(string[0]));
			coord.add(Double.parseDouble(string[1]));
			evt.setCoord(coord);
			res.add(evt);
			id++;
		}
		return res;
	}

	@Override
	public List<Restaurant> getAllRestaurant() {
		// TODO Auto-generated method stub
		return null;
	}

}

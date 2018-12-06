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

import fr.univ.nantes.iut.Evenement;
import fr.univ.nantes.iut.Restaurant;



/**
 * @author e187417p
 *
 */
public class FactoryImp implements Factory  {
	
	@Autowired
	Repo<RecordEvt> repo;
	
	Evenement unEvt;
	
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
	
	@Override
	public List<Restaurant> getDistance(Evenement unEvent) {
		List<RecordRest> recup = repo.getLesRestaurants();
		Double coord_1_evt = unEvent.getCoord().get(0);
		Double coord_2_evt = unEvent.getCoord().get(1);
		List<Double> distances = new ArrayList<Double>();
		List<RecordRest> restaurantsProches = new ArrayList<RecordRest>();
		List<Restaurant> res = new ArrayList<Restaurant>();
		for (RecordRest unRest : recup) {
			Double coord_1_rest = unRest.getFields().getLocalisation().get(0);
			Double coord_2_rest = unRest.getFields().getLocalisation().get(1);
			Double calcul = Math.sqrt(Math.pow(coord_1_evt - coord_1_rest, 2 ) + Math.pow(coord_2_evt - coord_2_rest, 2));
			if (calcul <= 5000){
				distances.add(calcul);
				restaurantsProches.add(unRest);
				System.out.println(calcul);
			}
			res = buildRest(restaurantsProches);
			int i = 0;
				for (Restaurant rest : res) {
					rest.setDistance(distances.get(i));
					i++;
				}		
		}
		return res;
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
		//int id = 1;
		Date date = null;
		String[] string;
		for (RecordEvt unEvent : lesEvents) {
			Evenement evt = new Evenement();
			//evt.setId(id);
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
			string = formatLocation.split(",");
			string[1] = string[1].replace(" ", "");
			List<Double> coord = new ArrayList<Double>();
			coord.add(Double.parseDouble(string[0]));
			coord.add(Double.parseDouble(string[1]));
			evt.setCoord(coord);
			res.add(evt);
			//id++;
		}
		//unEvt.setLesEvts(res);
		return res;
	}

}

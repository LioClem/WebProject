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
	public Evenement getUnEvt(int evt) {
		for (Evenement e : getAllEvenement()) {
			if (e.getId() == evt) {
				return e;
			}
		}
		return null;
	}
	
	@Override
	public Restaurant getUnResto(int resto) {
		for (Restaurant r : getAllRestaurant()) {
			if (r.getId() == resto) {
				return r;
			}
		}
		return null;
	}
	
	@Override
	public List<Restaurant> getDistance(int unEvent) {
		List<Restaurant> recup = getAllRestaurant();
		Evenement evt = new Evenement();
		for (Evenement e : getAllEvenement()) {
			if (e.getId() == unEvent) {
				evt = e;
			}
		}
		Double coord_1_evt = convertRad(evt.getCoord().get(0));
		Double coord_2_evt = convertRad(evt.getCoord().get(1));
		List<Restaurant> restaurantsProches = new ArrayList<Restaurant>();
		List<Restaurant> res = new ArrayList<Restaurant>();
		for (Restaurant resto : recup) {
			int R=6378137; //Rayon de la terre en mètre
			Double coord_1_resto = convertRad(resto.getCoord().get(0));
			Double coord_2_resto = convertRad(resto.getCoord().get(1));
			Double dlong = (coord_2_resto - coord_2_evt) / 2;
			Double dlat = (coord_1_resto - coord_1_evt) / 2;
			
			Double convert1 = (Math.sin(dlat) * Math.sin(dlat)) + Math.cos(coord_1_evt) * Math.cos(coord_1_resto) * (Math.sin(dlong) * Math.sin(dlong));
			Double res2 = 2 * Math.atan2(Math.sqrt(convert1), Math.sqrt(1 - convert1));
			Double calcul = R * res2;
			if (calcul <= 1000){
				restaurantsProches.add(resto);
				System.out.println(calcul);
			}		
		}
		return restaurantsProches;
	}
	
	@Override
	public Double calculDistance(int unEvent, int unResto) {
		Evenement evt = new Evenement();
		Restaurant resto = new Restaurant();
		for (Evenement e : getAllEvenement()) {
			if (e.getId() == unEvent) {
				evt = e;
			}
		}
		for (Restaurant r : getAllRestaurant()) {
			if (r.getId() == unResto) {
				resto = r;
			}
		}
	 		
		int R=6378137; //Rayon de la terre en mètre
		Double coord_1_evt = convertRad(evt.getCoord().get(0));
		Double coord_2_evt = convertRad(evt.getCoord().get(1));
		Double coord_1_resto = convertRad(resto.getCoord().get(0));
		Double coord_2_resto = convertRad(resto.getCoord().get(1));
		Double dlong = (coord_2_resto - coord_2_evt) / 2;
		Double dlat = (coord_1_resto - coord_1_evt) / 2;
		
		Double res = (Math.sin(dlat) * Math.sin(dlat)) + Math.cos(coord_1_evt) * Math.cos(coord_1_resto) * (Math.sin(dlong) * Math.sin(dlong));
		Double res2 = 2 * Math.atan2(Math.sqrt(res), Math.sqrt(1 - res));
		Double calcul = R * res2;
		return calcul;
	}
	
	public Double convertRad(double input){
        return (Math.PI * input)/180;
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
			rst.setVille(unRest.getFields().getCommune());
			res.add(rst);
			id++;
		}
		return res;
		
	}
	
	private List<Evenement> buildEvt(List<RecordEvt> lesEvents) {
		List<Evenement> res = new ArrayList<>();
		int id = 1;
		Date date = null;
		String[] string;
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
			if (formatLocation != null) {
				string = formatLocation.split(",");
				string[1] = string[1].replace(" ", "");
				List<Double> coord = new ArrayList<Double>();
				coord.add(Double.parseDouble(string[0]));
				coord.add(Double.parseDouble(string[1]));
				evt.setCoord(coord);
			} 
			res.add(evt);
			id++;
		}
		return res;
	}
	
	
}

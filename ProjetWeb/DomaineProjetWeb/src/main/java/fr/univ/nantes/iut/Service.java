/**
 * 
 */
package fr.univ.nantes.iut;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import fr.univ.nantes.iut.Evenement;
import fr.univ.nantes.iut.Restaurant;

/**
 * @author e187417p
 *
 */
public class Service {

	@Autowired
	Factory factory;

	public List<Evenement> getAllEvenement() {
		return factory.getAllEvenement();

	}

	public List<Restaurant> getAllRestaurant() {
		return factory.getAllRestaurant();
	}

	public List<Restaurant> getRestaurantsProche(Evenement unEvt) {
		return factory.getDistance(unEvt);
	}

	// List<Evenement> lesEvts = getAllEvenement();

	public void addEvt() {

		MongoClient mongo = new MongoClient("localhost", 27017);

		MongoCredential credential;
		credential = MongoCredential.createCredential("etu", "Projet_Web", "azerty".toCharArray());
		System.out.println("Connected to the database successfully");

		// Accessing the database
		MongoDatabase database = mongo.getDatabase("Projet_Web");
		System.out.println("Credentials ::" + credential);

		MongoCollection<Document> evenement = database.getCollection("Evenement");
		evenement.drop();
		System.out.println("Collection evenement selected successfully");

		for (Evenement evt : factory.getAllEvenement()) {
			Document document = new Document().append("id", evt.getId()).append("nom", evt.getNom())
					.append("description", evt.getDescription()).append("date", evt.getDate())
					.append("heure_debut", evt.getHeure_debut()).append("adresse", evt.getAdresse())
					.append("lieu", evt.getLieu()).append("coordonnees", evt.getCoord())
					.append("type", evt.getType());
			evenement.insertOne(document);
			System.out.println("Document inserted successfully");
		}

		FindIterable<Document> iterDoc = evenement.find();
		int i = 1;

		// Getting the iterator
		Iterator it = iterDoc.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			i++;
		}
	}
		
	public void addResto() {
		MongoClient mongo = new MongoClient("localhost", 27017);

		MongoCredential credential;
		credential = MongoCredential.createCredential("etu", "Projet_Web", "azerty".toCharArray());
		System.out.println("Connected to the database successfully");

		// Accessing the database
		MongoDatabase database = mongo.getDatabase("Projet_Web");
		System.out.println("Credentials ::" + credential);

		MongoCollection<Document> restaurant = database.getCollection("Restaurant");
		restaurant.drop();
		System.out.println("Collection evenement selected successfully");

		for (Restaurant resto : factory.getAllRestaurant()) {
			Document document = new Document().append("id", resto.getId()).append("nom", resto.getNom())
					.append("adresse", resto.getAdresse()).append("type", resto.getType())
					.append("coordonnees", resto.getCoord());
			restaurant.insertOne(document);
			System.out.println("Document inserted successfully");
		}

		FindIterable<Document> iterDoc = restaurant.find();
		int i = 1;

		// Getting the iterator
		Iterator it = iterDoc.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			i++;
		}
	}

	@Autowired
	EvenementRepository evenementRepository;

	// Create
	/*
	 * public Evenement create(String nom, String description, String adresse,
	 * List<Double> coord, String ville, Date date, String heureDebut, String
	 * heureFin, String type, String lieu) { return evtRepo.save(new Evenement(nom,
	 * description, adresse, coord,ville,date, heureDebut, heureFin,type, lieu));
	 * 
	 * }
	 */
	public Evenement create(String nom, String description) {
		return evenementRepository.save(new Evenement(nom, description));

	}

	public List<Evenement> getAll() {
		return evenementRepository.findAll();
	}

	public Evenement getByNom(String nom) {
		return evenementRepository.findByNom(nom);

	}

	public Evenement update(String nom, String description, String adresse, List<Double> coord, String ville, Date date,
			String heureDebut, String heureFin, String type, String lieu) {
		Evenement e = evenementRepository.findByNom(nom);
		e.setDescription(description);
		e.setCoord(coord);
		e.setAdresse(adresse);
		e.setHeure_debut(heureDebut);
		e.setHeure_fin(heureFin);
		e.setLieu(lieu);
		e.setVille(ville);
		return evenementRepository.save(e);
	}

	public void deleteAll() {
		evenementRepository.deleteAll();
	}

	public void delete(String nom) {
		Evenement e = evenementRepository.findByNom(nom);
		evenementRepository.delete(e);
	}

}

/**
 * 
 */
package fr.univ.nantes.iut;

import java.util.Iterator;
import java.util.List;

import org.bson.Document;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
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

	public Soiree createSoiree() {
		// Soiree uneSoiree = new Soiree(2, "test", "18h15", "2018-12-25", "20h15",
		// getAllEvenement().get(0), getAllRestaurant().get(0), null);
		Soiree uneSoiree = new Soiree(new ObjectId(), "nom", "18h15", null, "20h15", null,
				null, null);
		MongoClient mongo = new MongoClient("localhost", 27017);
		MongoDatabase database = mongo.getDatabase("Projet_Web");
		// System.out.println("Credentials ::" + credential);

		MongoCollection<Document> soiree = database.getCollection("Soiree");
		//soiree.drop();
		System.out.println("Collection soiree selected successfully");

		Document document = new Document().append("nom", uneSoiree.getNom())
				.append("heure_debut", uneSoiree.getHeure_debut()).append("heure_fin", uneSoiree.getHeure_fin())
				.append("date", uneSoiree.getDate()).append("evenement", uneSoiree.getUnEvt())
				.append("restaurant", uneSoiree.getUnResto()).append("distance", uneSoiree.getDistance());

		soiree.insertOne(document);
		FindIterable<Document> iterDoc = soiree.find();
		int i = 1;

		// Getting the iterator
		Iterator it = iterDoc.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			i++;
		}
		
		return uneSoiree;

	}

	public void addEvt() {

		MongoClient mongo = new MongoClient("localhost", 27017);

		/*
		 * MongoCredential credential; credential =
		 * MongoCredential.createCredential("etu", "Projet_Web",
		 * "azerty".toCharArray());
		 */
		System.out.println("Connected to the database successfully");

		// Accessing the database
		MongoDatabase database = mongo.getDatabase("Projet_Web");
		// System.out.println("Credentials ::" + credential);

		MongoCollection<Document> evenement = database.getCollection("Evenement");
		evenement.drop();
		System.out.println("Collection evenement selected successfully");

		for (Evenement evt : factory.getAllEvenement()) {
			Document document = new Document().append("id", evt.getId()).append("nom", evt.getNom())
					.append("description", evt.getDescription()).append("date", evt.getDate())
					.append("heure_debut", evt.getHeure_debut()).append("adresse", evt.getAdresse())
					.append("lieu", evt.getLieu()).append("coordonnees", evt.getCoord()).append("type", evt.getType());
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

		/*
		 * MongoCredential credential; credential =
		 * MongoCredential.createCredential("etu", "Projet_Web",
		 * "azerty".toCharArray());
		 * System.out.println("Connected to the database successfully");
		 */

		// Accessing the database
		MongoDatabase database = mongo.getDatabase("Projet_Web");
		// System.out.println("Credentials ::" + credential);

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

}

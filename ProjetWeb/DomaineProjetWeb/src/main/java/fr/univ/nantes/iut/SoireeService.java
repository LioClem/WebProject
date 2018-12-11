package fr.univ.nantes.iut;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class SoireeService {

	@Autowired
	SoireeRepository repo;
	@Autowired
	Factory fac;

	public Soiree create(String nom, String heure_debut, String date, String heure_fin, int numero_evt,
			int numero_resto) {
		Double distance = fac.calculDistance(numero_evt, numero_resto);
		Date dat = convertDate(date);
		MongoClient mongo = new MongoClient("localhost", 27017);
		System.out.println("Connected to the database successfully");
		// Accessing the database
		MongoDatabase database = mongo.getDatabase("Projet_Web");
		MongoCollection<Document> soiree = database.getCollection("Soiree");
		System.out.println("Collection soiree selected successfully");
		System.out.println("Soiree drop succesfully");
		Document document = new Document().append("nom", nom).append("heure_debut", heure_debut)
				.append("heure_fin", heure_fin).append("date", dat).append("num_evenement", numero_evt)
				.append("num_restaurant", numero_resto);
		soiree.insertOne(document);
		System.out.println("Document inserted successfully");

		FindIterable<Document> iterDoc = soiree.find();
		int i = 1;

		// Getting the iterator
		Iterator it = iterDoc.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			i++;
		}
		return repo.save(new Soiree(nom, heure_debut, heure_fin, dat, numero_evt, numero_resto, distance));
	}

	public List<Soiree> getAll() {
		return repo.findAll();
	}

	public Soiree getByNom(String nom) {
		return repo.findByNom(nom);

	}

	public Soiree update(String nom, String heure_debut, String date, String heure_fin, int numero_evt, int numero_resto) {
		Soiree s = repo.findByNom(nom);
		s.setHeure_debut(heure_debut);
		s.setHeure_fin(heure_fin);
		s.setDate(convertDate(date));
		if ((s.getUnEvt() != numero_evt) || (s.getUnResto() != numero_resto) ) {
			s.setUnEvt(numero_evt);
			s.setUnResto(numero_resto);
			Double distance = fac.calculDistance(numero_evt, numero_resto);
			s.setDistance(distance);
		}
		return repo.save(s);
	}

	public void deleteAll() {
		repo.deleteAll();
	}

	public void delete(String nom) {
		Soiree s = repo.findByNom(nom);
		repo.delete(s);
	}

	public Date convertDate(String date) {
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
		Date dat = new Date();
		try {
			dat = formatDate.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dat;
	}

}

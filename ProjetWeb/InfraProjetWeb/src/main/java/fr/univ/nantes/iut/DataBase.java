package fr.univ.nantes.iut;

import java.util.Iterator;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class DataBase {

	public static void main(String[] args) {
		
		
		/*
		 * ************************************CONNEXION*************************
		 */
		MongoClient mongoClient;
		MongoClient mongo = new MongoClient("localhost", 27017);

		MongoCredential credential;
		credential = MongoCredential.createCredential("etu", "Projet_Web", "azerty".toCharArray());
		System.out.println("Connected to the database successfully");

		// Accessing the database
		MongoDatabase database = mongo.getDatabase("Projet_Web");
		System.out.println("Credentials ::" + credential);
		
		/*
		 * ************************************COLLECTIONS************************
		 */

		// Creating a collection
		
		 /* database.createCollection("Evenement");
		  System.out.println("Collection created successfully");*/
		 

		MongoCollection<Document> evenement = database.getCollection("Evenement");
		System.out.println("Collection evenement selected successfully");
		
		/*
		 * **********************************INSERT*****************************
		 */

		//List<Restaurant> resto = 
		Document document = new Document().append("id", 1).append("description", "database")
				.append("likes", 100).append("url", "http://www.tutorialspoint.com/mongodb/")
				.append("by", "tutorials point");
		evenement.insertOne(document);
		System.out.println("Document inserted successfully");
		
		/*
		 * *******************************UPDATE******************************
		 */
		
		
		/*collection.updateOne(Filters.eq("id", 1), Updates.set("likes", 150));       
	      System.out.println("Document update successfully...");*/
		
		/*
		 * ******************************DELETE****************************
		 */
		
		// Deleting the documents 
	      /*collection.deleteOne(Filters.eq("id", 1)); 
	      System.out.println("Document deleted successfully...");
	      
	      //Deleting collection
	      collection.drop(); */
	     // System.out.println("Collection dropped successfully");
	      
	      /*
	       * *************************SHOW*******************************
	       */
		
		// Getting the iterable object 
	      FindIterable<Document> iterDoc = evenement.find(); 
	      int i = 1; 
		
		// Getting the iterator 
	      Iterator it = iterDoc.iterator(); 
	    
	      while (it.hasNext()) {  
	         System.out.println(it.next());  
	      i++; 
	      }
	}
}

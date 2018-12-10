package fr.univ.nantes.iut;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SoireeRepository extends MongoRepository<Soiree, String> {
		  Soiree findBy_id(ObjectId _id);
	
}

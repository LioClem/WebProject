package fr.univ.nantes.iut;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface EvenementRepository extends MongoRepository<Evenement, String> {
	public Evenement findOneByName(String name);

}

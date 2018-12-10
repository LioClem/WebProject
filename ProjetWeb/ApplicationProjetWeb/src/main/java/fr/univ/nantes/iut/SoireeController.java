package fr.univ.nantes.iut;

import fr.univ.nantes.iut.Soiree;
import fr.univ.nantes.iut.SoireeRepository;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/soirees")
public class SoireeController {
	
	
	  @Autowired
	  private SoireeRepository repository;
	  
	  
	  @RequestMapping(value = "/", method = RequestMethod.GET)
	  public List<Soiree> getAllSoiree() {
	    return repository.findAll();
	  }

	  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	  public Soiree getSoireeById(@PathVariable("id") ObjectId id) {
	    return repository.findBy_id(id);
	  }
	  
	  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	  public void modifySoireeById(@PathVariable("id") ObjectId id, @Valid 
	  @RequestBody Soiree soiree) {
	    soiree.set_id(id);
	    repository.save(soiree);
	  }
	  
	  @RequestMapping(value = "/", method = RequestMethod.POST)
	  public Soiree createSoiree(@Valid @RequestBody Soiree soiree) {
	    soiree.set_id(ObjectId.get());
	    repository.save(soiree);
	    return soiree;
	  }
	  
	  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	  public void deleteSoiree(@PathVariable ObjectId id) {
	    repository.delete(repository.findBy_id(id));
	  }
	  
	  

}

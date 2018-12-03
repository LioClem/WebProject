/**
 * 
 */
package fr.univ.nantes.iut;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author e187417p
 *
 */
@EnableAutoConfiguration
@ComponentScan
@RestController
public class ServiceApp {

	@Autowired
	Service service;
	
	@RequestMapping("/Evenements")
	
    List<Evenement> evenements() {
        return service.getAllEvenement();
    }
	
	/*@RequestMapping("/Parkings")
	
	List<MesParkings> parkings(){
		return service.getAllParkings();
	}
	
	@RequestMapping("/ParkingProche")
	
	MesParkings parkingProche() {
		return service.getParkingProche(spectacles().get(2), parkings());
	}*/

}

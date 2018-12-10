/**
 * 
 */
package fr.univ.nantes.iut;

/**
 * @author e187417p
 *
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Boot {
	public static void main(String[] args) {
		//SpringApplication.run(EvenementController.class, args);
		SpringApplication.run(ServiceApp.class, args);	
		//SpringApplication.run(SoireeController.class, args);	
	}
	
}

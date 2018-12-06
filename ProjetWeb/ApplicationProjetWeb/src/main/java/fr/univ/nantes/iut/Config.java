/**
 * 
 */
package fr.univ.nantes.iut;

/**
 * @author e187417p
 *
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class Config {
 
    @Bean
    public Service getService() {
        return new Service();
    }
   
    @Bean
    public Factory getFactory() {
        return new FactoryImp();
    }
    
    @Bean
    public Repo getRepo() {
    	return new RepoImp();
    }
       
 
}
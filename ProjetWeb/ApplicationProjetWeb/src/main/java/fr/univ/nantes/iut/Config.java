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

@Configuration
public class Config {
 
    @Bean
    public Service getSertvice() {
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
package helper;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("controller,dao,dto,service,helper")
public class MyConfiguration {
   @Bean
   public  EntityManager getEntityManager()
   {
	 return Persistence.createEntityManagerFactory("dev").createEntityManager();  
   }

}

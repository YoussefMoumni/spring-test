package cours.spring.mvc.conf;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan("cours.spring.mvc")
@EntityScan("cours.spring.mvc.conf.model")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	
	}
	
	
	
	
}

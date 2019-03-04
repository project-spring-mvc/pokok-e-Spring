package payroll;
import lombok.extern.slf4j.Slf4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
@Slf4j
class LoadDatabase {
	
	private static final Logger logger = LogManager.getLogger(LoadDatabase.class);
	
	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository) {
		return args->{
			logger.info("Preloading " + repository.save(new Employee("Rizky", "CEO "  )));
			logger.info("Preloading " + repository.save(new Employee("Rizal", "SEO")));
		};
		
	}
}

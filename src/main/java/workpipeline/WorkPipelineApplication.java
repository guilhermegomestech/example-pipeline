package workpipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class WorkPipelineApplication {
	public static final Logger LOGGER = Logger.getLogger(WorkPipelineApplication.class.getName());
	public static void main(String[] args) {
		LOGGER.info("Iniciando aplicação WorkPipeline...");
		SpringApplication.run(WorkPipelineApplication.class, args);
	}

}

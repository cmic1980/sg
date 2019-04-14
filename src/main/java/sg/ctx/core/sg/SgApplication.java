package sg.ctx.core.sg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SgApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgApplication.class, args);
	}

}

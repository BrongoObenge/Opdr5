package nl.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableAsync
@EnableWebMvc
public class Application {
	public static void main(String[] args) {
		//https://accounts.google.com/o/oauth2/auth?response_type=code&client_id=916050659370-0c7epme2o3oag2grhre1dquhritlqiue.apps.googleusercontent.com&redirect_uri=http://localhost:8080/oauth2callback&scope=openid profile
		SpringApplication.run(Application.class, args);
	}
}

package co.edu.poli.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {	
		Dotenv dotenv = Dotenv.configure().load();
        System.setProperty("DB_USER_SUPABASE", dotenv.get("DB_USER_SUPABASE"));
        System.setProperty("DB_PWD_SUPABASE", dotenv.get("DB_PWD_SUPABASE"));	
		SpringApplication.run(ExampleApplication.class, args);
	}

}

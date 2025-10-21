package co.edu.poli.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {	
		System.out.println("Directorio actual: " + System.getProperty("user.dir"));

		Dotenv dotenv = Dotenv.configure()
				.directory("./")
				.load();

		String user = dotenv.get("DB_USER_SUPABASE");
		String pwd = dotenv.get("DB_PWD_SUPABASE");

		System.out.println("🧾 DB_USER_SUPABASE: " + user);
		System.out.println("🧾 DB_PWD_SUPABASE: " + pwd);

		SpringApplication.run(ExampleApplication.class, args);
	}
	
}

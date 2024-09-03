package br.com.roberto.screenmatch;

import br.com.roberto.screenmatch.model.DadosSerie;
import br.com.roberto.screenmatch.principal.Principal;
import br.com.roberto.screenmatch.service.ConsumoApi;
import br.com.roberto.screenmatch.service.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}

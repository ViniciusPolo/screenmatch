//package br.com.vinicius.screenmatch;
//
//import br.com.vinicius.screenmatch.principal.Principal;
//import br.com.vinicius.screenmatch.repository.SerieRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.PropertySource;
//
//
//@SpringBootApplication
//@ConfigurationProperties
//public class ScreenmatchApplication implements CommandLineRunner {
//
//	@Autowired
//	private SerieRepository repositorio;
//
//	public static void main(String[] args) {
//		SpringApplication.run(ScreenmatchApplication.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		Principal principal = new Principal(repositorio);
//		principal.exibeMenu();
//	}
//}

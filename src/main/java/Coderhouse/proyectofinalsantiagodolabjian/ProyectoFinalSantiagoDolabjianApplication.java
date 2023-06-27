package Coderhouse.proyectofinalsantiagodolabjian;

import Coderhouse.proyectofinalsantiagodolabjian.repository.ClientRepository;
import Coderhouse.proyectofinalsantiagodolabjian.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoFinalSantiagoDolabjianApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository productoRepository;

	@Autowired
	private ClientRepository clientRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalSantiagoDolabjianApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

			System.out.println("Server listening. Access H2 on: http://localhost:8888/h2-console");

		}
	}



package com.wanderson.devspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.wanderson.devspring.model.Clientes;
import com.wanderson.devspring.repository.ClientesRepository;

@SpringBootApplication
public class DevSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevSpringApplication.class, args);
	}

	@Bean
    CommandLineRunner initDatabase( ClientesRepository clientesRepository) {
        return args -> {
			clientesRepository.deleteAll();

			Clientes c = new Clientes();
			c.setId(0);
			c.setCode(1);
			c.setName("João");
			c.setDocument("11.111.111/0001-11");

			clientesRepository.save(c);

        };

    }

}

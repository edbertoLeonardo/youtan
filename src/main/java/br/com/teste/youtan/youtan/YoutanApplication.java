package br.com.teste.youtan.youtan;

import br.com.teste.youtan.youtan.Entity.Cliente;
import br.com.teste.youtan.youtan.repositoy.ClienteRepositotry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class YoutanApplication {

	public static void main(String[] args) {
		SpringApplication.run(YoutanApplication.class, args);

	}

}

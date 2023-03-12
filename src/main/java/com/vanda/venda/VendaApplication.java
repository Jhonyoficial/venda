package com.vanda.venda;

import com.vanda.venda.entity.Cliente;
import com.vanda.venda.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VendaApplication {

	@Bean
	public CommandLineRunner run(@Autowired ClienteRepository clienteRepository){
		return args -> {
			Cliente cliente = Cliente.builder().dsCpf("14568972896").dsNome("Fulano").build();
			clienteRepository.save(cliente);
		};
	}
	public static void main(String[] args) {
		SpringApplication.run(VendaApplication.class, args);
	}

}

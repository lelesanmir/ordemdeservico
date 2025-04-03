package com.leosanmir.ordemdeservico;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.leosanmir.ordemdeservico.domain.Chamado;
import com.leosanmir.ordemdeservico.domain.Cliente;
import com.leosanmir.ordemdeservico.domain.Tecnico;
import com.leosanmir.ordemdeservico.domain.enums.Perfil;
import com.leosanmir.ordemdeservico.domain.enums.Prioridade;
import com.leosanmir.ordemdeservico.domain.enums.Status;
import com.leosanmir.ordemdeservico.repositories.ChamadoRepository;
import com.leosanmir.ordemdeservico.repositories.ClienteRepository;
import com.leosanmir.ordemdeservico.repositories.TecnicoRepository;

@SpringBootApplication
public class OrdemdeservicoApplication implements CommandLineRunner{

	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(OrdemdeservicoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico tec1 = new Tecnico(null, "Leonardo Santos", "63653230268", "lele@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvald", "70511744013", "torvalds@mail.com", "123");
		cli1.addPerfil(Perfil.CLIENTE);
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
	
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
	}

}

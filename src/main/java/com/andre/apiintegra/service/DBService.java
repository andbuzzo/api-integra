package com.andre.apiintegra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andre.apiintegra.domain.Cliente;
import com.andre.apiintegra.repositories.ClienteRepository;

@Service
public class DBService {
	
	@Autowired
	private ClienteRepository repository;
	
	public void instanciaDB() {
		Cliente cli1 = new Cliente(null, "GUSTAVO DA SILVA","39956478214","Rua 123123","190","JD. das flores","19880800","Assis","SP","18996493591","1");
		Cliente cli2 = new Cliente(null, "JOAO DOS SANTOS","32156479851","Rua 1123","170","centro","19880550","Assis","SP","18996483591","1");
		Cliente cli3 = new Cliente(null, "MARIA APARECIDA","12441254697","Rua 112312","160","JD. das Palmeiras","19880330","Assis","SP","18986443591","1");
		Cliente cli4 = new Cliente(null, "ANA MARIA","52332125201","Rua 1123","125","JD. das flores","19880022","Assis","SP","18986443591","1");
		Cliente cli5 = new Cliente(null, "ANDRÉ LUIZ","08545812365","Rua 123","150","centro","19880550","Assis","SP","18996443541","1");
		
		repository.save(cli1);
		repository.save(cli2);
		repository.save(cli3);
		repository.save(cli4);
		repository.save(cli5);
	}

}

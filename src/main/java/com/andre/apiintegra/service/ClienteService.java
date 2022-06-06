package com.andre.apiintegra.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andre.apiintegra.domain.Cliente;
import com.andre.apiintegra.repositories.ClienteRepository;
import com.andre.apiintegra.service.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	public Cliente findById(Integer id) {
		Optional<Cliente> obj = repository.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException("Id não encontrado, tente novamente!"));
	}
	
	public List<Cliente> findAll(){
		return repository.findAll();
	}
	
	public Cliente create(Cliente obj) {
		obj.setId(null);
		return repository.save(obj);
	}
	
	public Cliente update(Integer id, Cliente obj) {
		Cliente nObj = findById(id);
		nObj.setNome(obj.getNome());
		nObj.setCpfOuCnpj(obj.getCpfOuCnpj());
		nObj.setBairro(obj.getBairro());
		nObj.setCep(obj.getCep());
		nObj.setEmail(obj.getEmail());
		nObj.setCidade(obj.getCidade());
		nObj.setUf(obj.getUf());
		nObj.setNumero(obj.getNumero());
		nObj.setTelefone(obj.getTelefone());
		return repository.save(nObj);
	}
	
	public Cliente findByCpfOuCnpj(String cpfOuCnpj) {
		try {
			Optional<Cliente> cliente = repository.findByCpfOuCnpj(cpfOuCnpj);
			return cliente.orElseThrow(() -> new ObjectNotFoundException("Id não encontrado, tente novamente!"));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
}

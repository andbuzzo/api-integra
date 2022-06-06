package com.andre.apiintegra.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.andre.apiintegra.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
	@Query("SELECT obj FROM Cliente obj WHERE obj.CpfOuCnpj = :CpfOuCnpj")
	Optional<Cliente> findByCpfOuCnpj(@Param(value ="CpfOuCnpj") String CpfOuCnpj);

}

package com.leosanmir.ordemdeservico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leosanmir.ordemdeservico.domain.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente, Integer>{

}

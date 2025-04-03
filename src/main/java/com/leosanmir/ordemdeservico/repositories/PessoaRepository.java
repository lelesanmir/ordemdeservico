package com.leosanmir.ordemdeservico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leosanmir.ordemdeservico.domain.Pessoa;

public interface PessoaRepository  extends JpaRepository<Pessoa, Integer>{

}

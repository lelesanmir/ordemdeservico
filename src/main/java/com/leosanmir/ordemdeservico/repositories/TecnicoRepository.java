package com.leosanmir.ordemdeservico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leosanmir.ordemdeservico.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}

package com.leosanmir.ordemdeservico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leosanmir.ordemdeservico.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}

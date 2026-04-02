package com.ulinka.gestao_festa.repository;

import com.ulinka.gestao_festa.model.Convidado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConvidadosRepository extends JpaRepository<Convidado, Long> {
}

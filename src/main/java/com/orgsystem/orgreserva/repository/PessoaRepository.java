package com.orgsystem.orgreserva.repository;

import com.orgsystem.orgreserva.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PessoaRepository extends JpaRepository<Pessoa,Long> {
}

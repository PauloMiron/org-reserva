package com.orgsystem.orgreserva.repository;

import com.orgsystem.orgreserva.entities.Pessoa;
import com.orgsystem.orgreserva.entities.Sala;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SalaRepository extends JpaRepository<Sala,Long> {
}

package com.eventoapp.repository;

import com.eventoapp.model.Evento;
import org.springframework.data.repository.CrudRepository;

/**
 * Criado por douglas.santos em 07/08/2018
 */
public interface EventosRepository extends CrudRepository<Evento, String> {

    Evento findByCodigo(long codigo);
}

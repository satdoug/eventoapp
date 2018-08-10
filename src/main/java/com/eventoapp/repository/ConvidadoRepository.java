package com.eventoapp.repository;

import com.eventoapp.model.Convidado;
import com.eventoapp.model.Evento;
import org.springframework.data.repository.CrudRepository;

/**
 * Criado por douglas.santos em 08/08/2018
 */
public interface ConvidadoRepository extends CrudRepository<Convidado, String> {

    Iterable<Convidado> findByEvento(Evento evento);
}

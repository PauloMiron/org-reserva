package com.orgsystem.orgreserva.service;

import com.orgsystem.orgreserva.entities.Agendamento;
import com.orgsystem.orgreserva.repository.AgendamentoRepository;
import com.orgsystem.orgreserva.repository.ObjetoRepository;
import com.orgsystem.orgreserva.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;
    @Autowired
    private ObjetoRepository objetoRepository;
    @Autowired
    private ObjetoService objetoService;



    public List<Agendamento> findAll(){
        return agendamentoRepository.findAll();
    }

    public Agendamento findById(Long id){
        Optional<Agendamento> obj = agendamentoRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Pauta não encontrado! Id: " + id + ", Tipo: " + Agendamento.class.getName()));
    }


    @Transactional
    public Agendamento insert(Agendamento obj){
       obj.setId(null);
       obj.setObjeto(objetoService.findById(obj.getObjeto().getId()));
       agendamentoRepository.save(obj);
       return obj;
    }

}

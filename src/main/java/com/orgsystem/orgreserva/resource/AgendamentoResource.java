package com.orgsystem.orgreserva.resource;

import com.orgsystem.orgreserva.entities.Agendamento;
import com.orgsystem.orgreserva.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/agendamentos")
public class AgendamentoResource {

    @Autowired
    private AgendamentoService agendamentoService;

    @GetMapping
    public ResponseEntity<List<Agendamento>> findAll() {
        List<Agendamento> list = agendamentoService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<Agendamento> insert(@RequestBody Agendamento agendamento) {
        Agendamento response = agendamentoService.insert(agendamento);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}

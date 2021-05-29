package com.orgsystem.orgreserva.config;

import com.orgsystem.orgreserva.entities.Agendamento;
import com.orgsystem.orgreserva.entities.Objeto;
import com.orgsystem.orgreserva.repository.AgendamentoRepository;
import com.orgsystem.orgreserva.repository.ObjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.SimpleDateFormat;
import java.util.Arrays;


@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {


    @Autowired
    private AgendamentoRepository agendamentoRepository;

    @Autowired
    private ObjetoRepository objetoRepository;



    @Override
    public void run(String... args) throws Exception {

        Objeto c1 = new Objeto(null,"Ford Ka");

        objetoRepository.saveAll(Arrays.asList(c1));


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        Agendamento a1 = new Agendamento(null,sdf.parse("26/05/2021 09:00"),sdf.parse("26/05/2021 09:00"),
                sdf.parse("26/05/2021 11:00"),c1);

        agendamentoRepository.saveAll(Arrays.asList(a1));


    }


}

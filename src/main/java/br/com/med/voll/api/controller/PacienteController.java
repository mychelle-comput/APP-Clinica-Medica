package br.com.med.voll.api.controller;


import br.com.med.voll.api.paciente.DadosCadastroPacientes;
import br.com.med.voll.api.paciente.Paciente;
import br.com.med.voll.api.paciente.PacienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    public void cadastroPacientes(@RequestBody @Valid DadosCadastroPacientes dados){
        repository.save(new Paciente(dados));

    }


}

package br.com.med.voll.api.controller;


import br.com.med.voll.api.paciente.DadosCadastroPacientes;
import br.com.med.voll.api.paciente.DadosListagemPacientes;
import br.com.med.voll.api.paciente.Paciente;
import br.com.med.voll.api.paciente.PacienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    public void cadastroPacientes(@RequestBody @Valid DadosCadastroPacientes dados){
        repository.save(new Paciente(dados));

    }

    @GetMapping
    public Page<DadosListagemPacientes> listar(@PageableDefault(size = 10, sort={"nome"}) Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemPacientes::new);
    }


}

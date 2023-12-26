package br.com.projeto.exemplo01.controller;

import br.com.projeto.exemplo01.model.colaborador.Colaborador;
import br.com.projeto.exemplo01.model.colaborador.ColaboradorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {
    @Autowired
    private ColaboradorRepository colaboradorRepository;

    @PostMapping("/cadastrar")
    @Transactional
    public Colaborador cadastrar(@RequestBody Colaborador obj){
        return colaboradorRepository.save(obj);
    }

    //MÉTODO PARA LISTAR TODOS OS CARGOS

    @GetMapping("/listar")
    public Iterable<Colaborador> listar(){

        return colaboradorRepository.findAll();
    }

}

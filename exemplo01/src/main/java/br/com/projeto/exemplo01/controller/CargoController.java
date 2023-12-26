package br.com.projeto.exemplo01.controller;

import br.com.projeto.exemplo01.model.cargo.Cargo;
import br.com.projeto.exemplo01.model.cargo.CargoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cargos")
public class CargoController {

    @Autowired
    private CargoRepository cargoRepository;

    //MÉTODO PARA CADASTRAR CARGOS

    @PostMapping("/cadastrar")
    @Transactional
    public Cargo cadastrar(@RequestBody Cargo obj){
        return cargoRepository.save(obj);
    }

    //MÉTODO PARA LISTAR TODOS OS CARGOS

    @GetMapping("/listar")
    public Iterable<Cargo> listar(){

    return cargoRepository.findAll();
    }

}

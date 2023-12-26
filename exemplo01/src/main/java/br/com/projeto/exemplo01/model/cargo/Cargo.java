package br.com.projeto.exemplo01.model.cargo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Cargo")
@Table(name = "cargos")
@NoArgsConstructor
@AllArgsConstructor
@Getter

public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    private String cargo;
    private double salario;



}

package br.com.projeto.exemplo01.model.colaborador;

import br.com.projeto.exemplo01.model.cargo.Cargo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "colaboradores")
@Getter
@Setter
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    private String nome;

    @OneToOne
    @JoinColumn(name = "codigo_cargo", referencedColumnName = "codigo")
    private Cargo cargo;
}

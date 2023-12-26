package br.com.projeto.exemplo01.model.colaborador;

import br.com.projeto.exemplo01.model.colaborador.Colaborador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColaboradorRepository extends CrudRepository<Colaborador, Long> {
}

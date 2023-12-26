package br.com.projeto.exemplo01.model.cargo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CargoRepository extends JpaRepository<Cargo, Long> {
}

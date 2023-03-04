package lima.felipe.selecaotd20231.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lima.felipe.selecaotd20231.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
}

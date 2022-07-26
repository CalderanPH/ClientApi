package br.paulocalderan.domain.repository;

import br.paulocalderan.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}

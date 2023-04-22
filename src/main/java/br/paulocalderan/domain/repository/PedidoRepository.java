package br.paulocalderan.domain.repository;

import br.paulocalderan.domain.entity.Cliente;
import br.paulocalderan.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;
import java.util.Set;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

    Set<Pedido> findByCliente(Cliente cliente);

    @Query("select p from Pedido p left join fetch p.itens where p.id = :id")
    Optional<Pedido> findByIdFetchItens(@PathVariable("id") Integer id);

}
package br.paulocalderan.service;

import br.paulocalderan.domain.entity.Pedido;
import br.paulocalderan.domain.enums.StatusPedido;
import br.paulocalderan.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {

    Pedido salvar(PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto(Integer id);

    void atualizaStatus(Integer id, StatusPedido statusPedido);

}
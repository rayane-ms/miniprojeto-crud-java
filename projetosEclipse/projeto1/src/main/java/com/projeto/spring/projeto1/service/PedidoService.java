package com.projeto.spring.projeto1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.spring.projeto1.entity.Pedido;
import com.projeto.spring.projeto1.repository.PedidoRepository;

@Service
public class PedidoService {
	@Autowired
	PedidoRepository pedidoRepository;
	
	public List<Pedido> getAll(){
		return pedidoRepository.findAll();
	}
	
	public Pedido getById(Integer id) {
		return pedidoRepository.findById(id).orElse(null) ;
	}
	
	public Pedido savePedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	
	public Pedido updatePedido(Integer id, Pedido pedido) {
		Pedido pedidoAtualizado = pedidoRepository.findById(id).orElse(null);
		if(pedidoAtualizado != null) {
			pedidoAtualizado.setPedidoData(pedido.getPedidoData());
			return pedidoRepository.save(pedidoAtualizado);
		}else {
			return null;
		}
	}

	public Boolean deletePedido(Integer id) {
		Pedido pedido = pedidoRepository.findById(id).orElse(null);
		if(pedido != null) {
			pedidoRepository.delete(pedido);
			return true;
		}else {
			return false;
		}
	}
}
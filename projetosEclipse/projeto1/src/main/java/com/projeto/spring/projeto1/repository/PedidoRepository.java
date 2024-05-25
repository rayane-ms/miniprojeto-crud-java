package com.projeto.spring.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.spring.projeto1.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido,Integer> {

}
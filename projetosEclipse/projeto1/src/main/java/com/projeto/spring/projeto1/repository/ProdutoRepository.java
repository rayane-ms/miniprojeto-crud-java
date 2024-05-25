package com.projeto.spring.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.spring.projeto1.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Integer> {

}
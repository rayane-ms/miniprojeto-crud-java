package com.projeto.spring.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.spring.projeto1.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {

}
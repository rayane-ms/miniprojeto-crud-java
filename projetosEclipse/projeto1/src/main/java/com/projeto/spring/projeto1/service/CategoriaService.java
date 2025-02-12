package com.projeto.spring.projeto1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.spring.projeto1.entity.Categoria;
import com.projeto.spring.projeto1.repository.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	CategoriaRepository categoriaRepository;
	
	public List<Categoria> getAll(){
		return categoriaRepository.findAll();
	}
	
	public Categoria getById(Integer id) {
		return categoriaRepository.findById(id).orElse(null) ;
	}
	
	public Categoria saveCategoria(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
	public Categoria updateCategoria(Integer id, Categoria categoria) {
		Categoria categoriaAtualizada = categoriaRepository.findById(id).orElse(null);
		if(categoriaAtualizada != null) {
			categoriaAtualizada.setCategoriaNome(categoria.getCategoriaNome());
			return categoriaRepository.save(categoriaAtualizada);
		}else {
			return null;
		}
	}

	public Boolean deleteCategoria(Integer id) {
		Categoria categoria = categoriaRepository.findById(id).orElse(null);
		if(categoria != null) {
			categoriaRepository.delete(categoria);
			return true;
		}else {
			return false;
		}
	}
}
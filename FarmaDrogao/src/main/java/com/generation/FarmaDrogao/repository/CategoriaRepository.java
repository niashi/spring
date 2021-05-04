package com.generation.FarmaDrogao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.FarmaDrogao.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
}

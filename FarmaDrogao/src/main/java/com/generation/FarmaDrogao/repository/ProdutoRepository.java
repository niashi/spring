package com.generation.FarmaDrogao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.FarmaDrogao.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}

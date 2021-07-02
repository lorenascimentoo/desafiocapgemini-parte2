package com.desafiocapgemini.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafiocapgemini.domain.Anuncio;

@Repository
public interface AnuncioRepository extends JpaRepository<Anuncio, Integer>{

}

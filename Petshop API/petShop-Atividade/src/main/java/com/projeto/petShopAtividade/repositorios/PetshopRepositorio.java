package com.projeto.petShopAtividade.repositorios;

import com.projeto.petShopAtividade.modelos.PetshopModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface PetshopRepositorio extends JpaRepository<PetshopModelo, Long> {



}

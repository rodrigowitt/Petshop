package com.projeto.petShopAtividade.servicos;

import com.projeto.petShopAtividade.modelos.PetshopModelo;
import com.projeto.petShopAtividade.repositorios.PetshopRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetshopServico {

    final PetshopRepositorio petshopRepositorio;




    public PetshopServico(PetshopRepositorio petshopRepositorio) {
        this.petshopRepositorio = petshopRepositorio;
    }


    public PetshopModelo save(PetshopModelo petshopModelo) {
        return petshopRepositorio.save(petshopModelo);
    }

    public List<PetshopModelo> findAll() {
        return petshopRepositorio.findAll();
    }

    public Optional<PetshopModelo> findById(Long id) {
        return petshopRepositorio.findById(id);
    }

    public void delete(PetshopModelo petshopModelo) {
        petshopRepositorio.delete(petshopModelo);
    }
}

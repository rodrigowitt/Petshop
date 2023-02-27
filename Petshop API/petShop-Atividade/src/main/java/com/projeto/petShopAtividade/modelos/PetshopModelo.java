package com.projeto.petShopAtividade.modelos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.projeto.petShopAtividade.enums.StatusTratamento;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="TB_PETSHOP")
public class PetshopModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column
    @JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")
    private LocalDateTime entrada;

    private String nome;

    private String especie;

    private String raca;

    private String altura;

    private String peso;

    private String pelagem;

    private String responsavel;

    private String tratamento;

    private String statusTratamento;

    private String email;

    private String telefone;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public LocalDateTime setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
        return entrada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public String getStatusTratamento() {
        return statusTratamento;
    }

    public void setStatusTratamento(String statusTratamento) {
        this.statusTratamento = statusTratamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

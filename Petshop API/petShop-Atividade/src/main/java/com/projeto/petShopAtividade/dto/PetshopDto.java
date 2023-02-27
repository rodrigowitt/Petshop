package com.projeto.petShopAtividade.dto;

import com.projeto.petShopAtividade.enums.StatusTratamento;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public class PetshopDto {
    @NotBlank
    private String nome;
    @NotBlank
    private String especie;
    @NotBlank
    private String raca;
    @NotBlank
    private String altura;
    @NotBlank
    private String peso;
    @NotBlank
    private String pelagem;
    @NotBlank
    private String responsavel;
    @Email
    @NotBlank
    private String email;
    @NotBlank
    private String telefone;
    @NotBlank
    private String tratamento;

    private String statusTratamento;



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
}

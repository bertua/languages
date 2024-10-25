/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.senhas;

import java.time.LocalDateTime;

/**
 *
 * @author 03045812082
 */
public class Senha {

    private int id_senha;
    private int id_usuario;
    private String nome_servico;
    private String url;
    private String senha;
    private LocalDateTime data_criacao;
    private LocalDateTime ultima_modificacao;
    private String categoria;
    
    public int getId_senha() {
        return id_senha;
    }

    public void setId_senha(int id_senha) {
        this.id_senha = id_senha;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome_servico() {
        return nome_servico;
    }

    public void setNome_servico(String nome_servico) {
        this.nome_servico = nome_servico;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(LocalDateTime data_criacao) {
        this.data_criacao = data_criacao;
    }

    public LocalDateTime getUltima_modificacao() {
        return ultima_modificacao;
    }

    public void setUltima_modificacao(LocalDateTime ultima_modificacao) {
        this.ultima_modificacao = ultima_modificacao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

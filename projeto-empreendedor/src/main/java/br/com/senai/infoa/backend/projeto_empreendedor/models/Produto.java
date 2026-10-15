package br.com.senai.infoa.backend.projeto_empreendedor.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "Produto")
public class Produto {
    @Id
    @GeneratedValue (strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "dataFabricacao")
    private LocalDate dataFabricacao;

    @Column(name = "preco")
    private Integer preco;

    @ManyToMany(mappedBy = "produtos")
    private List<Empreendedor> empreendedores = new ArrayList<>();

    public Produto() {
    }

    public Produto(LocalDate dataFabricacao, Integer id, String nome, Integer preco, List<Empreendedor> empreendedores) {
        this.dataFabricacao = dataFabricacao;
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.empreendedores = empreendedores;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    public List<Empreendedor> getEmpreendedores() {
        return empreendedores;
    }

    public void setEmpreendedores(List<Empreendedor> empreendedores) {
        this.empreendedores = empreendedores;
    }

}
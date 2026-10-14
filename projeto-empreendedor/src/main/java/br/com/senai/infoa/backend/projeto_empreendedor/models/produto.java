package br.com.senai.infoa.backend.projeto_empreendedor.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "data_fabricacao")
    private LocalDate dataFabricacao;

    @Column(name = "preco")
    private BigDecimal preco;

    @ManyToMany(mappedBy = "produtos")
    private List<Empreendedor> empreendedores = new ArrayList<>();

    public produto() {
    }

    public produto(Integer id, String nome, LocalDate dataFabricacao, BigDecimal preco, List<Empreendedor> empreendedores) {
        this.id = id;
        this.nome = nome;
        this.dataFabricacao = dataFabricacao;
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

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public List<Empreendedor> getEmpreendedores() {
        return empreendedores;
    }

    public void setEmpreendedores(List<Empreendedor> empreendedores) {
        this.empreendedores = empreendedores;
    }
}

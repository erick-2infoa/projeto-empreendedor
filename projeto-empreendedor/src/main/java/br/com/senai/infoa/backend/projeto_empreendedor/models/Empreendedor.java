package br.com.senai.infoa.backend.projeto_empreendedor.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "Empreendedor")
public class Empreendedor {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;

    @Column (name = "cpf")
    private String cpf;

    @Column (name = "dataNascimento")
    private LocalDate dataNascimento;

    @OneToMany(mappedBy = "empreendedor", cascade = CascadeType.ALL)
    private List<Endereco> Endereco = new ArrayList<>();

    @ManyToMany
    @JoinTable (
        name = "empreendedorProduto",
        joinColumns = @JoinColumn(name = "empreendedorId"),
        inverseJoinColumns = @JoinColumn(name = "produtoId")
    )
    private List<Produto> produtos;

    public Empreendedor() {
    }

    public Empreendedor(String cpf, LocalDate dataNascimento, Integer id, List<Produto> produtos, List<Endereco> Endereco) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.id = id;
        this.produtos = produtos;
        this.Endereco = Endereco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Endereco> getEndereco() {
        return Endereco;
    }

    public void setEndereco(List<Endereco> Endereco) {
        this.Endereco = Endereco;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
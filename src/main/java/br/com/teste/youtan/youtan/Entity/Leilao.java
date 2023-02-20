package br.com.teste.youtan.youtan.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;
@Entity
public class Leilao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Instant data;
    private String estado;
    private String cidade;
    private String endereco;
    private double lance;
//    private Produto produtos;
//
//    public Produto getProdutos() {
//        return produtos;
//    }
//
//    public void setProdutos(Produto produtos) {
//        this.produtos = produtos;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getData() {
        return data;
    }

    public void setData(Instant data) {
        this.data = data;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getLance() {
        return lance;
    }

    public void setLance(double lance) {
        this.lance = lance;
    }
}

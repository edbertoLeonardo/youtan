package br.com.teste.youtan.youtan.Entity;

import br.com.teste.youtan.youtan.enums.VeiculosEnum;

import javax.persistence.*;

@Entity
public class Veiculos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;

    private VeiculosEnum tipoVeiculo;

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

    public VeiculosEnum getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(VeiculosEnum tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
}

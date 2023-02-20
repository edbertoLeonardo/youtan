package br.com.teste.youtan.youtan.Entity;

import br.com.teste.youtan.youtan.enums.ImoveisEnum;

import javax.persistence.Id;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Imoveis {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;

    private ImoveisEnum tipoImovel;

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

    public ImoveisEnum getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(ImoveisEnum tipoImovel) {
        this.tipoImovel = tipoImovel;
    }
}

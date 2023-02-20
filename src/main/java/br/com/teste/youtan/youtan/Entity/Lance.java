package br.com.teste.youtan.youtan.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;
@Entity
public class Lance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Cliente cliente;
    private Instant dataHoraLance;
    private double valor;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Instant getDataHoraLance() {
        return dataHoraLance;
    }

    public void setDataHoraLance(Instant dataHoraLance) {
        this.dataHoraLance = dataHoraLance;
    }
}

package br.com.teste.youtan.youtan.service;

import br.com.teste.youtan.youtan.Entity.Veiculos;
import br.com.teste.youtan.youtan.repositoy.VeiculosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VeiculosServices {

    @Autowired
    VeiculosRepository veiculosRepository;

    public List<Veiculos> pegaTodosVEiculos(){
        List<Veiculos> veiculos = new ArrayList<Veiculos>();
        veiculosRepository.findAll().forEach(v -> veiculos.add(v));
        return veiculos;
    }

    public Veiculos pegaVeiculoId(int id) {
        return veiculosRepository.findById(id).get();
    }

    public Veiculos gravarVeiculo(Veiculos veiculos) {
        return veiculosRepository.save(veiculos);
    }
    //
    public void delete(int id)
    {
        veiculosRepository.deleteById(id);
    }

    public void atualizaVeiculo(Veiculos veiculos) {
        veiculosRepository.save(veiculos);
    }
}


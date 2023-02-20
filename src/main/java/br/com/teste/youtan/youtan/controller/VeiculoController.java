package br.com.teste.youtan.youtan.controller;

import br.com.teste.youtan.youtan.Entity.Veiculos;
import br.com.teste.youtan.youtan.service.VeiculosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VeiculoController {

    @Autowired
    VeiculosServices veiculosServices;

    @GetMapping("/veiculos")
    private List<Veiculos> pegaTodosVeiculos(){
        return veiculosServices.pegaTodosVEiculos();
    }

    @GetMapping("/veiculos/{id}")
    private Veiculos pegaVeiculoId(@PathVariable("id") Integer id){
        return veiculosServices.pegaVeiculoId(id);
    }

    @DeleteMapping("/veiculos{id}")
    private void deleteVeiculo(@PathVariable("id") Integer id) {
        veiculosServices.delete(id);
    }

    @PostMapping("/veiculos")
    private List<Veiculos> gravarVeiculo(@RequestBody List<Veiculos> veiculos) {
        List<Veiculos> veiculosSaved = new ArrayList<>();
        veiculos.forEach(v -> veiculosSaved.add(veiculosServices.gravarVeiculo(v)));
        return veiculosSaved;
    }

    @PutMapping("/veiculos")
    private Veiculos atualizaVeiculo(@RequestBody Veiculos veiculo)
    {
        veiculosServices.gravarVeiculo(veiculo);
        return veiculo;
    }
}

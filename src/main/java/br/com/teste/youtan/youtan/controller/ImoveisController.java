package br.com.teste.youtan.youtan.controller;

import br.com.teste.youtan.youtan.Entity.Imoveis;
import br.com.teste.youtan.youtan.service.ImoveisServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ImoveisController {

    @Autowired
    ImoveisServices imoveisServices;

    @GetMapping("/imoveis")
    private List<Imoveis> pegaTodosImoveis(){
        return imoveisServices.pegaTodosImoveis();
    }

    @GetMapping("/imoveis/{id}")
    private Imoveis pegaImovelId(@PathVariable("id") Integer id){
        return imoveisServices.pegaImovelId(id);
    }

    @DeleteMapping("/imoveis/{id}")
    private void deleteImovel(@PathVariable("id") Integer id) {
        imoveisServices.delete(id);
    }

    @PostMapping("/imoveis")
    private int gravarImovel(@RequestBody Imoveis imoveis) {
        imoveisServices.atualizaImovel(imoveis);
        return imoveis.getId();
    }

    @PutMapping("/imoveis")
    private Imoveis atualizaImovel(@RequestBody Imoveis imoveis)
    {
        imoveisServices.gravarImovel(imoveis);
        return imoveis;
    }
}

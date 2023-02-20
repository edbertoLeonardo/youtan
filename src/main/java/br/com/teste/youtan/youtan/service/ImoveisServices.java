package br.com.teste.youtan.youtan.service;

import br.com.teste.youtan.youtan.Entity.Imoveis;
import br.com.teste.youtan.youtan.repositoy.ImoveisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImoveisServices {

    @Autowired
    ImoveisRepository imoveisRepository;

    public List<Imoveis> pegaTodosImoveis(){
        List<Imoveis> imoveis = new ArrayList<>();
        imoveisRepository.findAll().forEach(imovel -> imoveis.add(imovel));
        return imoveis;
    }

    public Imoveis pegaImovelId(int id) {
        return imoveisRepository.findById(id).get();
    }

    public void gravarImovel(Imoveis imoveis) {
        imoveisRepository.save(imoveis);
    }
    //
    public void delete(int id)
    {
        imoveisRepository.deleteById(id);
    }

    public void atualizaImovel(Imoveis imoveis) {
        imoveisRepository.save(imoveis);
    }
}


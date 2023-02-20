package br.com.teste.youtan.youtan.repositoy;

import br.com.teste.youtan.youtan.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ClienteRepositotry extends JpaRepository<Cliente, Integer> {


    List<Cliente> findByNomeLike(String nome);
}
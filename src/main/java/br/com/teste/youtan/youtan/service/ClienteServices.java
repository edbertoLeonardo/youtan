package br.com.teste.youtan.youtan.service;

import br.com.teste.youtan.youtan.Entity.Cliente;
import br.com.teste.youtan.youtan.Entity.Veiculos;
import br.com.teste.youtan.youtan.repositoy.ClienteRepositotry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteServices {

    @Autowired
    ClienteRepositotry clienteRepositotry;

    public List<Cliente> pegaTodosClientes(){
        List<Cliente> clientes = new ArrayList<>();
        clienteRepositotry.findAll().forEach(c -> clientes.add(c));
        return clientes;
    }

   /* Nao fiz teste pra ver se funciona
    public List<Cliente> pegaTodosClientes(){
        List<Cliente> clientes = clienteRepositotry.findAll();
        return clientes;
    }*/

    public Cliente pegaClientesId(int id) {
        return clienteRepositotry.findById(id).get();
    }

    public Cliente gravarCliente(Cliente cliente) {
        return clienteRepositotry.save(cliente);
    }
    //
    public void delete(int id)
    {
        clienteRepositotry.deleteById(id);
    }

    public void atualizaCliente(Cliente clinte) {
        clienteRepositotry.save(clinte);
    }
}


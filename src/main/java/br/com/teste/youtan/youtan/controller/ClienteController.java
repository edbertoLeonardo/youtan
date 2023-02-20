package br.com.teste.youtan.youtan.controller;

import br.com.teste.youtan.youtan.Entity.Cliente;
import br.com.teste.youtan.youtan.Entity.Imoveis;
import br.com.teste.youtan.youtan.service.ClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    ClienteServices clienteServices;

    @GetMapping("/clientes")
    private List<Cliente> pegaTodosClientes(){
        return clienteServices.pegaTodosClientes();
    }

    @GetMapping("/clientes/{id}")
    private Cliente pegaCienteId(@PathVariable("id") Integer id){
        return clienteServices.pegaClientesId(id);
    }

    @DeleteMapping("/clientes/{id}")
    private void deleteCliente(@PathVariable("id") Integer id) {
        clienteServices.delete(id);
    }

    @PostMapping("/cliente")
    private int gravarCliente(@RequestBody Cliente cliente) {
        clienteServices.gravarCliente(cliente);
        return cliente.getId();
    }

    @PutMapping("/clientes")
    private Cliente atualizaCliente(@RequestBody Cliente cliente)
    {
        clienteServices.atualizaCliente(cliente);
        return cliente;
    }
}

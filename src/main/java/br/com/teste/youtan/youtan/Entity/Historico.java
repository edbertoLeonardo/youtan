package br.com.teste.youtan.youtan.Entity;


 import javax.persistence.Entity;
 import javax.persistence.GeneratedValue;
 import javax.persistence.GenerationType;
 import javax.persistence.Id;
 import java.util.List;
public class Historico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private List<Lance> lances;
    private Cliente cliente;

}

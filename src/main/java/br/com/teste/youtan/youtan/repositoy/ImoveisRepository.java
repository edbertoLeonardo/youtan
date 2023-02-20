package br.com.teste.youtan.youtan.repositoy;

import br.com.teste.youtan.youtan.Entity.Imoveis;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface ImoveisRepository extends JpaRepository<Imoveis, Integer> {


}

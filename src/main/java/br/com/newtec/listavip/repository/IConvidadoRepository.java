package br.com.newtec.listavip.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.newtec.listavip.model.Convidado;


public interface IConvidadoRepository extends CrudRepository<Convidado, Long>{
	
	List<Convidado> findByNome(String nome);

}

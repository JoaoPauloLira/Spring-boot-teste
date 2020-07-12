package br.com.newtec.listavip.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.newtec.listavip.model.Convidado;
import br.com.newtec.listavip.repository.IConvidadoRepository;

@Service
public class ConvidadoService {

	@Autowired
	private IConvidadoRepository repository;
	
	public Iterable<Convidado> todosConvidados() {
		return repository.findAll();
	}
	
	public boolean salvaConvidado(Convidado convidado) {
		return repository.save(convidado)!= null ? true : false;
	}
	
}

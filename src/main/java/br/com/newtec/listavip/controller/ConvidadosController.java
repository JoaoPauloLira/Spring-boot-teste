package br.com.newtec.listavip.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.newtec.listavip.Service.ConvidadoService;
import br.com.newtec.listavip.model.Convidado;
import br.com.newtec.listavip.util.SendEmail;
import lombok.val;

@Controller
public class ConvidadosController {

	@Autowired
	private ConvidadoService convidadoService;
	@Autowired
	private SendEmail send;

	@RequestMapping("/listaconvidados")
	public String listaContatos(Model view) {

		val listaConvidados = convidadoService.todosConvidados();

		listaConvidados.forEach(x -> System.out.println(x.getEmail()));

		view.addAttribute("convidados", listaConvidados);

		return "listaconvidados";

	}

	@RequestMapping("/salvarConvidados")
	public String salvarConvidado(@Valid Convidado convidado, BindingResult result, Model view) {

		if (result.hasErrors())
			return "listaconvidados";

		convidadoService.salvaConvidado(convidado);

		val listaConvidados = convidadoService.todosConvidados();
		view.addAttribute("convidados", listaConvidados);
		
		send.enviar("Você acaba de ser convidado para a lista vip", "joao.p.lira@gmail.com", "Olá "+convidado.getNome()+ " Você acaba de ser convidado, parabéns!");

		return "listaconvidados";
	}

}

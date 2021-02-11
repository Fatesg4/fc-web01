package com.francisco.edivan;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // faz a classe se comportar como webservice
@RequestMapping("/produto") //configura a url do webservice
public class ProdutoRest {

	@Autowired //injeta uma instancia de produtoDao aqui
	private ProdutoDao produtoDao;
	
	@GetMapping //expoe o metodo GET
	public List<Produto> get(){
		return produtoDao.findAll();
	}
	
	@PostMapping //expoe o metodo POST
	public void post(@RequestBody Produto produto) { //@RequestBody - marca o objeto como corpo da mensagem POST
		produtoDao.save(produto);
	}

	
//	@PostMapping("/{nome}/{valor}") //expoe o metodo POST
//	public void post(@PathVariable("nome") String nome, @PathVariable("valor") BigDecimal valor) { //@RequestBody - marca o objeto como corpo da mensagem POST
//		Produto produto = new Produto();
//		produto.setNome(nome);
//		produto.setValor(valor);
//		produtoDao.save(produto);
//	}
	

}


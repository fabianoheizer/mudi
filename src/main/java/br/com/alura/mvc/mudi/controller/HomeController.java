package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Kindle 10a. geração");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/61Y4XiBXzFL._AC_SL1000_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/dp/B07FQK1TS9/ref=s9_acsd_al_bw_c2_x_2_i?pf_rd_m=A3RN7G7QC5MWSZ&pf_rd_s=merchandised-search-3&pf_rd_r=KQEVZFF0ANW1VY445TNP&pf_rd_t=101&pf_rd_p=b2c349eb-8f2f-43b1-8bdf-88ecd299fbe8&pf_rd_i=17387223011");
		pedido.setDescricao("Kindle 10a. geração com iluminação embutida – Cor Preta");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}

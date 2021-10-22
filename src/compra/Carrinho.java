package compra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import estoque.Produto;
import financeiro.NotaFiscal;

public class Carrinho {

	private Map<Produto, Integer> listaCarrinho = new HashMap<Produto, Integer>();
	
	public Carrinho() {}
	
	public void adicionItem(Produto produto, int quantidade) {
		listaCarrinho.put(produto, quantidade);			
		System.out.println("você adicionou " + quantidade + " " + produto.getNome_produto() +"(s)");
	}
	
	public void removeItem(Produto produto, int quantidade) {
		for(int i = 0; i<quantidade; i++) {
			listaCarrinho.remove(produto);			
		}
		System.out.println("você removeu " + quantidade + " " + produto.getNome_produto() +"(s)");
	}

	public void fechaCompra() {
		NotaFiscal.gerarNota(listaCarrinho);
		System.out.println("sua compra foi fechada e sua nota será gerada");
	}
	
	public void cancelaCompra() {
		listaCarrinho.clear();
		System.out.println("sua compra foi cancelada, que pena :(");
	}

}

package compra;

import java.util.ArrayList;
import java.util.List;

import estoque.Produto;
import financeiro.NotaFiscal;

public class Carrinho {

	private List<Produto> listaCarrinho = new ArrayList<Produto>();
	
	public Carrinho() {}
	
	public void adicionItem(Produto produto, int quantidade) {
		for(int i = 0; i<quantidade; i++) {
			listaCarrinho.add(produto);			
		}
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

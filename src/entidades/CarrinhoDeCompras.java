package entidades;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	Double valorTotal = 0.0;
	
	private List<Produto> produtos = new ArrayList<>();;

	
	public void inserir(Produto produto) {
			this.produtos.add(produto);
	}
	
	public void somaCarrinho(Produto produto, int qtd) {
			this.valorTotal += produto.getPreço() * qtd;
		}
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public Double getValorTotal() {
		return valorTotal;
	}


}

package entidades;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	double valorTotal = 0.0;
	
	private List<Item> itens = new ArrayList<>();

	

	public void inserir(Item item) {
		this.itens.add(item);
	}
	
	public void removeAll() {
		for(int i = 0; i < itens.size(); i++) {
			this.itens.remove(i);
			System.out.println(this.itens.remove(i));
		}
	}
	
	public void somaCarrinho(Produto produto, int qtd) {
		this.valorTotal += produto.getPreço() * qtd;
		}
	
	public List<Item> getItens() {
		return this.itens;
	}

	public double getValorTotal() {
		return valorTotal;
	}


}

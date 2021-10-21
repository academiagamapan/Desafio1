package estoque;

import java.util.ArrayList;

public class Estoque {
	
	private ArrayList<Produto> produtos;
	
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	public void addProduto(Produto p) {
		produtos.add(p);
	}
	public void removerProduto(int id) {
		produtos.remove(id);
	}
	public ArrayList<Produto> listarProduto(){
		return produtos;
	}

	public Estoque() {
		// TODO Auto-generated constructor stub
	}

}

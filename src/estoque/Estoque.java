package estoque;

import java.util.ArrayList;

public class Estoque {

	private ArrayList<Produto> produtos;
	
	public Estoque() {
		this.produtos = new ArrayList<Produto>();
	}
	
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public void addProduto(Produto p) {
		for (Produto itemlista : produtos) {
			if(itemlista.getId_produto() == p.getId_produto()) {
				itemlista.setQtda_produto(itemlista.getQtda_produto() + p.getQtda_produto());
			}else {
				produtos.add(p);
			}
		}
		
	}

	public void removerProduto(int id) {
		for (Produto p : produtos) {
			if (p.getId_produto() == id) {
				System.out.print("Produto:" + p.getNome_produto() +" Removido com sucesso.");
				produtos.remove(p.getId_produto());
			} else {
				System.out.print("Produto não encontrado.");
			}
		}
	}

	public ArrayList<Produto> listarProduto() {
		return produtos;
	}

	public void procurarProduto(int id) {
		for (Produto p : produtos) {
			if (p.getId_produto() == id) {
				System.out.print(p.toString());
			} else {
				System.out.print("Produto não encontrado.");
			}
		}
	}

	

}

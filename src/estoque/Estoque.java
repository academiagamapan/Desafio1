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

	

	// Verificar se a lista está vazia primeiro e só depois percorrer.
	public void addProduto(Produto p) {
		if (produtos.isEmpty()) {
			produtos.add(p);
		} else {
			for (int i = 0; i < produtos.size(); i++) {
				if (produtos.get(i).getId_produto() == p.getId_produto()) {
					produtos.get(i).setQtda_produto(produtos.get(i).getQtda_produto() + p.getQtda_produto());
					System.out.println(p.toString());
				} else {
					this.produtos.add(p);
					System.out.println("Item adicionado no estoque");
				}
			}
		}
	}

	public void removerProduto(Produto produto) {
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getId_produto() == produto.getId_produto()) {
				System.out.println("Remoção: ");
				System.out.println("Produto:" + produto.getNome_produto() + " Removido com sucesso.");
				produtos.remove(produtos.get(i));
			} else if (produtos.get(i).getId_produto() == produto.getId_produto()) {
				System.out.println("Produto não encontrado.");
			}
		}
	}

	public void listarProduto() {
		System.out.println("\nLista de Produtos em Estoque: ");
		for (Produto p : produtos) {
			System.out.println(p.toString());
		}
	}

	/*
	 * public ArrayList<Produto> listarProduto(){ return produtos; }
	 */
	public void procurarProduto(int id) {
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getId_produto() == id) {
				System.out.println("Retorno da Pesquisa: ");
				System.out.println(produtos.get(i).toString());
			} else if (produtos.get(i).getId_produto() == id) {
				System.out.println("Produto não encontrado.");
			}
		}
	}

	public void zerarLista() {
		produtos.clear();
	}

}

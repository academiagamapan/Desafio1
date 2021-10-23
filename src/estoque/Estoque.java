package estoque;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estoque {

	private Map<Produto, Integer> produtos;

	public Estoque() {
		this.produtos = new HashMap<Produto, Integer>();
	}

	public Map<Produto, Integer> getProdutos() {
		return produtos;
	}

	public void setProdutos(Map<Produto, Integer> produtos) {
		this.produtos = produtos;
	}

	// Verificar se a lista est� vazia primeiro e s� depois percorrer.
	public void addProduto(Produto p, int quantidade) {
//		if (produtos.isEmpty()) {
			produtos.put(p, quantidade);
//		} else {
//			for (int i = 0; i < produtos.size(); i++) {
//				if (produtos.get(i).getId_produto() == p.getId_produto()) {
//					produtos.get(i).setQtda_produto(produtos.get(i).getQtda_produto() + p.getQtda_produto());
//					System.out.println(p.toString());
//				} else {
//					this.produtos.add(p);
//					System.out.println("Item adicionado no estoque");
//				}
//			}
//		}
	}

	public void removerProduto(Produto produto, int quantidade) {
//		for (int i = 0; i < produtos.size(); i++) {
//			if (produtos.get(i).getId_produto() == produto.getId_produto()) {
//				System.out.println("Remo��o: ");
//				System.out.println("Produto:" + produto.getNome_produto() + " Removido com sucesso.");
//				produtos.remove(produtos.get(i));
//			} else if (produtos.get(i).getId_produto() == produto.getId_produto()) {
//				System.out.println("Produto n�o encontrado.");
//			}
//		}
		produtos.replace(produto, produtos.get(produto) - quantidade);
	}

	public void listarProduto() {
		System.out.println("\nLista de Produtos em Estoque: ");
		for (Produto p : produtos.keySet()) {
			System.out.println(p.getId_produto() + " " + p.getNome_produto() + " " + produtos.get(p));
		}
	}

	/*
	 * public ArrayList<Produto> listarProduto(){ return produtos; }
	 */
//	public void procurarProduto(int id) {
//		for (int i = 0; i < produtos.size(); i++) {
//			if (produtos.get(i).getId_produto() == id) {
//				System.out.println("Retorno da Pesquisa: ");
//				System.out.println(produtos.get(i).toString());
//			} else if (produtos.get(i).getId_produto() == id) {
//				System.out.println("Produto n�o encontrado.");
//			}
//		}
//	}

	public void zerarLista() {
		produtos.clear();
	}

}

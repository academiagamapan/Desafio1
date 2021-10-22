package main;

import estoque.Estoque;
import estoque.Produto;
import estoque.String;

public class PantsAcademy {

	public static void main(String[] args) {
		
//		private int id_produto;
//		private double preco_produto;
//		private String nome_produto;
//		private int qtda_produto;

		Produto produto1 = new Produto();
		produto1.setId_produto(1);
		produto1.setNome_produto("Camiseta");
		produto1.setPreco_produto(49.00);
		produto1.setQtda_produto(10);
		
		Estoque estoque1 = new Estoque();
		estoque1.addProduto(produto1);
		
		
	}

}

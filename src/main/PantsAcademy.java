package main;

import estoque.Estoque;
import estoque.Produto;



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
		
		Produto produto2 = new Produto();
		produto1.setId_produto(2);
		produto1.setNome_produto("Camiseta Regata");
		produto1.setPreco_produto(39.00);
		produto1.setQtda_produto(10);
		estoque1.addProduto(produto2);
		
		Produto produto3 = new Produto();
		produto1.setId_produto(3);
		produto1.setNome_produto("Camiseta Manga Longa");
		produto1.setPreco_produto(69.00);
		produto1.setQtda_produto(10);
		estoque1.addProduto(produto3);
		
		Produto produto4 = new Produto();
		produto1.setId_produto(4);
		produto1.setNome_produto("Camiseta Polo");
		produto1.setPreco_produto(59.00);
		produto1.setQtda_produto(10);
		estoque1.addProduto(produto4);
		
		Produto produto5 = new Produto();
		produto1.setId_produto(5);
		produto1.setNome_produto("Bermuda");
		produto1.setPreco_produto(49.00);
		produto1.setQtda_produto(10);
		estoque1.addProduto(produto5);
		
		Produto produto6 = new Produto();
		produto1.setId_produto(6);
		produto1.setNome_produto("Bermuda Jeans");
		produto1.setPreco_produto(50.00);
		produto1.setQtda_produto(10);
		estoque1.addProduto(produto6);
		
		Produto produto7 = new Produto();
		produto1.setId_produto(7);
		produto1.setNome_produto("Calca Jeans");
		produto1.setPreco_produto(80.00);
		produto1.setQtda_produto(10);
		estoque1.addProduto(produto7);
		
		Produto produto8 = new Produto();
		produto1.setId_produto(8);
		produto1.setNome_produto("Moleton");
		produto1.setPreco_produto(75.00);
		produto1.setQtda_produto(10);
		estoque1.addProduto(produto8);
		
		Produto produto9 = new Produto();
		produto1.setId_produto(9);
		produto1.setNome_produto("Chinelo");
		produto1.setPreco_produto(29.00);
		produto1.setQtda_produto(10);
		estoque1.addProduto(produto9);
		
		Produto produto10 = new Produto();
		produto1.setId_produto(10);
		produto1.setNome_produto("Tenis");
		produto1.setPreco_produto(200.00);
		produto1.setQtda_produto(10);
		estoque1.addProduto(produto10);
		
	}

}

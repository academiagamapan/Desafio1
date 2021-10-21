package MarketPlace;

import java.util.ArrayList;
import java.util.List;

public class TesteCarrinho {

	public static void main(String[] args) {
		
		List<Produto> listaProdutos = new ArrayList<>();
		
		listaProdutos.add(new Produto(1, "Arroz - 5kg", 100, 15.90));
		listaProdutos.add(new Produto(2, "Feij�o - 1kg", 100, 7.30));
		listaProdutos.add(new Produto(3, "Caf� - 500g", 100, 9.99));
		listaProdutos.add(new Produto(4, "Macarr�o - 500g", 100, 3.29));
		listaProdutos.add(new Produto(5, "Farinha - 1kg", 100, 3.15));
		listaProdutos.add(new Produto(6, "Ovos - 1d�zia", 100, 8.50));
		listaProdutos.add(new Produto(7, "Leite - 1l", 100, 3.55));
		listaProdutos.add(new Produto(8, "A��car - 1kg", 100, 4.29));
		listaProdutos.add(new Produto(9, "�leo - 1l", 100, 8.79));
		listaProdutos.add(new Produto(10, "Sal - 1kg", 100, 2.59));
		
		CarrinhoCompras carrinho = new CarrinhoCompras();
		
		carrinho.LogoMercado();
		carrinho.ExibirProdutos(listaProdutos);
		
		
		
		
	}

}

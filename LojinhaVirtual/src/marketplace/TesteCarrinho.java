package marketplace;

import java.util.ArrayList;
import java.util.List;

public class TesteCarrinho {

	public static void main(String[] args) {
		
		List<Produto> listaProdutos = new ArrayList<>();
		
		Produto p1 = new Produto(1L, "Arroz - 5kg", 100L, 15.90);
		Produto p2 = new Produto(2L, "Feijão - 1kg", 100L, 7.30);
		Produto p3 = new Produto(3L, "Café - 500g", 100L, 9.99);
		Produto p4 = new Produto(4L, "Macarrão - 500g", 100L, 3.29);
		Produto p5 = new Produto(5L, "Farinha - 1kg", 100L, 3.15);
		Produto p6 = new Produto(6L, "Ovos - 1dúzia", 100L, 8.50);
		Produto p7 = new Produto(7L, "Leite - 1l", 100L, 3.55);
		Produto p8 = new Produto(8L, "Açúcar - 1kg", 100L, 4.29);
		Produto p9 = new Produto(9L, "Óleo - 1l", 100L, 8.79);
		Produto p10 = new Produto(10L, "Sal - 1kg", 100L, 2.59);
		
		listaProdutos.add(p1);
		listaProdutos.add(p2);
		listaProdutos.add(p3);
		listaProdutos.add(p4);
		listaProdutos.add(p5);
		listaProdutos.add(p6);
		listaProdutos.add(p7);
		listaProdutos.add(p8);
		listaProdutos.add(p9);
		listaProdutos.add(p10);
		
		System.out.println("*************************************************************");
		System.out.println("  ╔═╗╔═╗╔═══╗╔═══╗╔═══╗╔═══╗╔═══╗╔═══╗     ╔═══╗╔═══╗╔═╗─╔╗\r\n"
				+ "  ║║╚╝║║║╔══╝║╔═╗║║╔═╗║║╔═╗║╚╗╔╗║║╔═╗║     ║╔═╗║║╔═╗║║║╚╗║║\r\n"
				+ "  ║╔╗╔╗║║╚══╗║╚═╝║║║─╚╝║║─║║─║║║║║║─║║     ║╚═╝║║║─║║║╔╗╚╝║\r\n"
				+ "  ║║║║║║║╔══╝║╔╗╔╝║║─╔╗║╚═╝║─║║║║║║─║║     ║╔══╝║╚═╝║║║╚╗║║\r\n"
				+ "  ║║║║║║║╚══╗║║║╚╗║╚═╝║║╔═╗║╔╝╚╝║║╚═╝║     ║║───║╔═╗║║║─║║║\r\n"
				+ "  ╚╝╚╝╚╝╚═══╝╚╝╚═╝╚═══╝╚╝─╚╝╚═══╝╚═══╝     ╚╝───╚╝─╚╝╚╝─╚═╝");
		System.out.println("*************************************************************");
		
		Produto p = new Produto(null, null, null, null);
		p.MenuProdutos(listaProdutos);
		
		
		

	}

}

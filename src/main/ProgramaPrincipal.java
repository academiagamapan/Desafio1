package main;

import java.util.List;
import java.util.Scanner;

import entidades.CarrinhoDeCompras;
import entidades.Loja;
import entidades.Produto;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Produto p0 = new Produto(0, "Feijão", 6.99, 10);
		Produto p1 = new Produto(1, "Arroz", 5.99, 10);
		Produto p2 = new Produto(2, "Macarrão", 2.99, 10);
		Produto p3 = new Produto(3, "Açúcar", 3.50, 10);

		Loja loja = new Loja();

		List<Produto> produtos = loja.getProdutos();
		produtos.add(p0);
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

		Scanner sc = new Scanner(System.in);
		int qtd;

		String entrada2 = "s";

		while (entrada2.equals("s")) {
			System.out.println("           	 ~ Tabela de produtos ~");
			System.out.println();
			System.out.println("Código      Produto 	    Preço unit.(R$)         Qtd em Estoque");
			System.out.println();
			for (int i = 0; i < produtos.size(); i++) {
				System.out.println(produtos.get(i));
			}

			System.out.println();
			System.out.println("Digite o código do produto que deseja para adicioná-lo ao carrinho: ");
			System.out.println();

			int entrada = sc.nextInt();
			while (entrada < 0 || entrada > produtos.size() - 1) {
				System.out.println("Entrada inválida, digite o código do produto que deseja para adicioná-lo ao carrinho: ");
				entrada = sc.nextInt();
			}
			
			for(int i = 0; i < loja.getProdutos().size(); i++) {
				if (entrada == i) {
					Produto produto = loja.getProdutos().get(i);
					if (produtos.get(i).getEstoque() > 0) {
						System.out.println("Digite a quantidade de "+ produto.getNome() +" que você deseja: ");
						qtd = sc.nextInt();
						while (qtd > produtos.get(i).getEstoque() || qtd < 0  ) {
							System.out.println("Entrada inválida ou estoque insuficiente de "+  produto.getNome()
									+ ", digite uma quantidade até " + produtos.get(i).getEstoque() + ": ");
							qtd = sc.nextInt();
						}
						carrinho.inserir(produto);
						System.out.println("Você adcionou "+ qtd + " pacotes de "+ produto.getNome() + " no seu carrinho!");
						carrinho.somaCarrinho(produto, qtd);
						produtos.get(i).setEstoque(produtos.get(i).getEstoque() - qtd);
					} else {
						System.out.println("Desculpe, estoque insuficiente de " + produto.getNome() + " no momento.");
					}
				}
			}

			System.out.println();
			System.out.printf("Total do Carrinho = R$%.2f %n", carrinho.getValorTotal());
			System.out.println("Deseja adicionar mais itens no carrinho? (s/n)");
			entrada2 = sc.next();
			while (!entrada2.equals("n") && !entrada2.equals("s")) {
				System.out.println("Entrada inválida, digite 's' para continuar comprando ou 'n' para ir à sessão de pagamento: ");
				entrada2 = sc.next();
			}

		}

//		
//		System.out.println("~ Seu carrinho ~");
//		System.out.println();
//		System.out.println("Produto 	Preço unit.  	Qtd      Preço Total");
//		for(int i = 0; i < produtos.length; i++ ) {
//			if (estoque[i] < 10) {
//				System.out.println(produtos[i] + "         	" 
//							+ precos[i] + "  	        " 
//							+ (10 - estoque[i]) + "           " 
//							+ ((10 - estoque[i]) * precos[i] ));
//				
//		}
//		}
//		System.out.println();
//		System.out.printf("Total do Carrinho = R$%.2f %n", total);
//		sc.close();
//	}
//	}
	}
//	}
}

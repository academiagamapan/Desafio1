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
			System.out.println("Digite o número do produto que deseja: ");
			System.out.println();

			int entrada = sc.nextInt();
			while (entrada < 0 || entrada > produtos.size() - 1) {
				System.out.println("Entrada inválida, digite o número do produto que deseja: ");
				entrada = sc.nextInt();
			}

			if (entrada == 0) {
				if (produtos.get(0).getEstoque() > 0) {
					System.out.println("Digite a quantidade de "+ p0.getNome() +" que você deseja: ");
					qtd = sc.nextInt();
					while (qtd > produtos.get(0).getEstoque() || qtd < 0  ) {
						System.out.println("Entrada inválida ou estoque insuficiente de "+ p0.getNome()
								+ ", digite uma quantidade até " + produtos.get(0).getEstoque() + ": ");
						qtd = sc.nextInt();
					}
					carrinho.inserir(p0);
					carrinho.somaCarrinho(p0, qtd);
					produtos.get(0).setEstoque(produtos.get(0).getEstoque() - qtd);
				} else {
					System.out.println("Estoque insuficiente de " + p0.getNome());
				}
			} else if (entrada == 1) {
				if (produtos.get(1).getEstoque() > 0) {
					System.out.println("Digite a quantidade de "+ p1.getNome() +" que você deseja: ");
					qtd = sc.nextInt();
					while (qtd > produtos.get(1).getEstoque() || qtd < 0  ) {
						System.out.println("Entrada inválida ou estoque insuficiente de "+ p1.getNome()
								+ ", digite uma quantidade até " + produtos.get(1).getEstoque() + ": ");
						qtd = sc.nextInt();
					}
					carrinho.inserir(p1);
					carrinho.somaCarrinho(p1, qtd);
					produtos.get(1).setEstoque(produtos.get(1).getEstoque() - qtd);
				} else {
					System.out.println("Estoque insuficiente de " + p1.getNome());
				}
			} else if (entrada == 2) {
				if (produtos.get(2).getEstoque() > 0) {
					System.out.println("Digite a quantidade de "+ p2.getNome() +" que você deseja: ");
					qtd = sc.nextInt();
					while (qtd > produtos.get(2).getEstoque() || qtd < 0  ) {
						System.out.println("Entrada inválida ou estoque insuficiente de "+ p2.getNome()
								+ ", digite uma quantidade até " + produtos.get(2).getEstoque() + ": ");
						qtd = sc.nextInt();
					}
					carrinho.inserir(p2);
					carrinho.somaCarrinho(p2, qtd);
					produtos.get(1).setEstoque(produtos.get(2).getEstoque() - qtd);
				} else {
					System.out.println("Estoque insuficiente de " + p2.getNome());
				}
			} else {
				if (produtos.get(3).getEstoque() > 0) {
					System.out.println("Digite a quantidade de "+ p3.getNome() +" que você deseja: ");
					qtd = sc.nextInt();
					while (qtd > produtos.get(3).getEstoque() || qtd < 0  ) {
						System.out.println("Entrada inválida ou estoque insuficiente de "+ p3.getNome()
								+ ", digite uma quantidade até " + produtos.get(3).getEstoque() + ": ");
						qtd = sc.nextInt();
					}
					carrinho.inserir(p3);
					carrinho.somaCarrinho(p3, qtd);
					produtos.get(1).setEstoque(produtos.get(3).getEstoque() - qtd);
				} else {
					System.out.println("Estoque insuficiente de " + p3.getNome());
				}
			}
			
			// IMPLEMENTAR PROXIMAS ENTRADAS AQUI

			System.out.println();
			System.out.printf("Total do Carrinho = R$%.2f %n", carrinho.getValorTotal());
			System.out.println("Deseja adicionar mais itens no carrinho? (s/n)");
			entrada2 = sc.next();
			while (!entrada2.equals("n") && !entrada2.equals("s")) {
				System.out.println("Entrada inválida, digite 's' para continuar ou 'n' para ir à sessão de pagamento: ");
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

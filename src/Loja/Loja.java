package Loja;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Locale;


public class Loja {
	
	static LinkedList<Produto> estoque = new LinkedList<>();
	static LinkedList<Produto> carrinhoCompras = new LinkedList<>();
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Loja.div("Lojo grupo 6");			
		criarEstoque(estoque);
		verMenuPrincipal(in);
		
		
	}
	
	
	public static void verMenuPrincipal(Scanner in) {
		
		div("Nome da Loja");
		System.out.println("1 - Ver Produtos");
		System.out.println("2 - Ver Carrinho");
		System.out.println("0 - Sair");
		System.out.println("Digite a opção desejada");
		int opcao = in.nextInt();
		div("");
		
		System.out.println("\n" + opcao);
		if (opcao == 1) {
			verProduto(in);
		}else if (opcao == 2) {
			verCarrinho(in);
		}else if(opcao == 0){
			System.out.println("Volte sempre");
		}else {
			System.out.println("Opção inválida");
			verMenuPrincipal(in);
		}
		

	}
	
	
	public static void criarEstoque(LinkedList<Produto>estoque) {
		estoque.add(new Produto("Iogurte", 3.60, 12));
		estoque.add(new Produto("Chocolate", 7.45, 10));
		estoque.add(new Produto("Farinha", 7.50, 10));
		estoque.add(new Produto("Feijão", 11.30, 8));
		estoque.add(new Produto("Macarrão", 3.50, 12));
		estoque.add(new Produto("Manteiga", 7.30, 8));
		estoque.add(new Produto("Biscoito", 4.60, 5));
		estoque.add(new Produto("Chá Mate", 3.80, 12));

		
		
	}
	
	
	public static void verProduto(Scanner in) {
		div("Produtos disponíveis");
		System.out.printf("ID \t\t\t Nome \t\t\t Preço Unid. \t\t\t  Quantidade%n");
		
		for (Produto x : estoque) {
			System.out.printf("%d \t\t\t %s \t\t\t %.2f \t\t\t  %d%n", x.getIdProduto(), x.getNome(), x.getPreco(), x.getQuantidade());
		}
		
		div("");
		System.out.println("Digite o ID do produto que deseja adicionar, ou -1 para retornar ao menu principal.");
		int prod = in.nextInt();
		
		if(prod > 0 && prod <= estoque.size()) {
			System.out.println("Qual quantidade deseja adicionar?");
			int quantidadeRemover = in.nextInt();
			
			if( estoque.get(prod-1).getQuantidade() >= quantidadeRemover) {
				Produto produto = new Produto(estoque.get(prod-1).getIdProduto(), estoque.get(prod-1).getNome(), estoque.get(prod-1).getPreco(), estoque.get(prod-1).getQuantidade());
				produto.setQuantidade(quantidadeRemover);
				produto.setIdProduto(carrinhoCompras.size()+1);
				carrinhoCompras.add(produto);
				estoque.get(prod-1).decrementarQuantidade(quantidadeRemover);
				System.out.println("Produto adicionado com sucesso!Precione a tecla Enter para continuar.");
				verProduto(in);
				}else {
					System.out.println("Quantidade indisponível!Precione a tecla Enter para continuar.");					
					verProduto(in);				
				}
			
		}else if(prod == -1) {
			verMenuPrincipal(in);			
			
		}else {
			System.out.println("Valor incorreto! Por Favor digite um valor entre 1 e " + estoque.size());
			verProduto(in);
		}		
	}
	
	
	public static void verCarrinho(Scanner in) {
		
		div("Carrinho de compras");
		System.out.printf("ID \t\t\t Nome \t\t\t Preço Unid. \t\t\t  Quantidade%n");
		
		for (Produto x : carrinhoCompras) {
			System.out.printf("%d \t\t\t %s \t\t\t %.2f \t\t\t  %d%n", x.getIdProduto(), x.getNome(), x.getPreco(), x.getQuantidade());
		}
		
		System.out.println("Digite\n[1] para pagamento.\n[2] para remover algum produto de seu carrinho.\nOu qualquer outra tecla para retornar ao menu principal.");
		int opcao = in.nextInt();
		
		if(opcao == 1) {
			pagamento(in);
		}else if(opcao == 2) {
			removerProduto(in);
		}else {
			verMenuPrincipal(in);
		}

	}
	
	
	private static void removerProduto(Scanner in) {
		
		System.out.println("Digite o ID do produto que deseja remover.");
		int prod = in.nextInt();
		
		if(prod > 0 && prod <= carrinhoCompras.size()) {
			System.out.println("Qual quantidade deseja remover?");
			int quantidadeRemover = in.nextInt();
			
			if( carrinhoCompras.get(prod-1).getQuantidade() >= quantidadeRemover) {
				Produto produto = new Produto(carrinhoCompras.get(prod-1).getIdProduto(), carrinhoCompras.get(prod-1).getNome(), carrinhoCompras.get(prod-1).getPreco(), carrinhoCompras.get(prod-1).getQuantidade());
				produto.setQuantidade(quantidadeRemover);
				estoque.add(produto);
				carrinhoCompras.get(prod-1).decrementarQuantidade(quantidadeRemover);
				System.out.println("Produto removido com sucesso!");
				verCarrinho(in);
				}else {
					System.out.println("Quantidade inválida!");
					verCarrinho(in);				
				}
			
		}else {
			System.out.println("Valor incorreto! Por Favor digite um valor entre 1 e " + carrinhoCompras.size());
			verCarrinho(in);
		}		
	}

	
	private static void pagamento(Scanner in) {
		
		double total = 0;
		int parcelas = 1;
		
		for (Produto x : carrinhoCompras){
			total += x.getPreco() * x.getQuantidade();
		}
		
		div("Pagamento");
		System.out.printf("O valor total da compra foi de R$%.2f%n", total);
		System.out.println("[1]Cartão Banco PAN \n[2] PIX ou Dinheiro\n");
		
		int opcao = in.nextInt();
		
		if(opcao==1) {
			System.out.println("[1] À vista - 15% de desconto\n[2] 3x sem juros\n[3] Parcelado em até 6x(1.5% a.m)");
			int parcelamento = in.nextInt();
			
			if(parcelamento == 1) {
				total *= 0.85;
				notaFiscal(total, parcelas);			
			}else if(parcelamento == 2) {
				total /= 3;
				parcelas = 3;
				notaFiscal(total, parcelas);
			}else if(parcelamento == 3) {
				total *= 1.015;
				total /= 6;
				parcelas = 6;
				notaFiscal(total, parcelas);
			}else {
				System.out.println("Opção inválida!");
				pagamento(in);
			}
			
		}else if(opcao == 2 ) {
			notaFiscal(total, parcelas);
			
		}
	}
			

	private static void notaFiscal(double total, int parcelas) {
		// TODO Auto-generated method stub
		System.out.println("Imprimindo sua nota fiscal...");
	}


	static public void  div(String title) {
		
		System.out.println("\t\t\t\t\t" + title);
		System.out.println("=================================================================================================");
		
	}
		

}

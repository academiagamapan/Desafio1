package Loja;

import java.util.LinkedList;
import java.util.Scanner;

public class Loja {
	
	public static void main(String[] args) {
		
		Loja.div("Lojo grupo 6");
		Scanner in = new Scanner(System.in);
		LinkedList<Produto> estoque = new LinkedList<Produto>();
		LinkedList<Produto> carrinhoCompras = new LinkedList<Produto>();
		verMenuPrincipal(in);
		
	}
	
	public static void verMenuPrincipal(Scanner in) {
		div("Nome da Loja");
		System.out.println("1 - Ver Produtos");
		System.out.println("2 - Ver Carrinho");
		System.out.println("0 - Sair");
		System.out.println("Digite a opção desejada");
		div("");
		int opcao = in.nextInt();
		System.out.println("\n" + opcao);
		if (opcao == 1) {
			verProduto();
		}else if (opcao == 2) {
			verCarrinho();
		}else if(opcao == 0){
			System.out.println("Volte sempre");
		}else {
			System.out.println("Opção inválida");
			verMenuPrincipal(in);
		}
		

	}
	
	private static void verCarrinho() {
		// TODO Auto-generated method stub
		
	}

	private static void verProduto() {
		// TODO Auto-generated method stub
		
	}

	static public void  div(String title) {
		
		System.out.println("\t\t\t\t\t" + title);
		System.out.println("=================================================================================================");
		
	}
		

	
	


}

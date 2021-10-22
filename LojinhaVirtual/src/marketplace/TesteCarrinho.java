package marketplace;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCarrinho {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");	
		
		List<Produto> listaProdutos = new ArrayList<>();		
		listaProdutos.add(new Produto(1L, "Arroz - 5kg", 60L, 15.50));
		listaProdutos.add(new Produto(2L, "Feijão - 1kg", 100L, 7.30));
		listaProdutos.add(new Produto(3L, "Café - 500g", 58L, 10.00));
		listaProdutos.add(new Produto(4L, "Macarrão - 500g", 120L, 3.25));
		listaProdutos.add(new Produto(5L, "Farinha - 1kg", 150L, 3.15));
		listaProdutos.add(new Produto(6L, "Ovos - 1dúzia", 50L, 8.50));
		listaProdutos.add(new Produto(7L, "Leite - 1l", 200L, 3.50));
		listaProdutos.add(new Produto(8L, "Açúcar - 1kg", 140L, 4.25));
		listaProdutos.add(new Produto(9L, "Óleo - 1l", 98L, 8.70));
		listaProdutos.add(new Produto(10L, "Sal - 1kg", 115L, 2.60));
		
		Menu menu = new Menu();
		menu.LogoMercado();	
		
		Produto p = new Produto(null, null, null, null);			
		Carrinho carrinho = new Carrinho();	
		PagamentoAVista pagvista = new PagamentoAVista();
		PagamentoAVistaCredito pagvistacred = new PagamentoAVistaCredito();
		PagamentoParcelado pagparc = new PagamentoParcelado();
		
		Integer opcao, codProdCliente, finalizar, opcaoPag;
		Long qntdProdCliente;
		Double precoItemProd;
		
		do {
			p.MenuProdutos(listaProdutos);
			menu.MenuPrincipal();
			opcao = scan.nextInt();		
			
			switch(opcao) {
				case 1:
					System.out.print("\nDigite o código do produto: ");
					codProdCliente = scan.nextInt() - 1;
					System.out.print("Digite a quantidade desejada: ");
					qntdProdCliente = scan.nextLong();
					//adiciona o item ao carrinho
					precoItemProd = listaProdutos.get(codProdCliente).getPrecoProd();
					carrinho.AddItem(new ItemCarrinho(qntdProdCliente, (qntdProdCliente * precoItemProd) , codProdCliente));				
					//diminui da quantidade de estoque de produtos
					listaProdutos.get(codProdCliente).setQntdEstoque(listaProdutos.get(codProdCliente).getQntdEstoque() - qntdProdCliente);				
					break;
				case 2:
					carrinho.MenuProdutos(listaProdutos);
					System.out.print("Digite o código do produto que deseja remover: ");
					//remover item da lista do carrinho
					codProdCliente = scan.nextInt() - 1;
					carrinho.RemoverItemLista(listaProdutos, codProdCliente); 
					//retorna a quantidade de produtos do estoque
					//p.RetornarEstoque();
					break;
				case 3:
					p.MenuProdutos(listaProdutos);
					break;
				case 4:
					carrinho.MenuProdutos(listaProdutos);
					break;				
				case 5:
					System.out.print("\nTem certeza que deseja finalizar compra? (1-Sim / 2-Não)");
					finalizar = scan.nextInt();
					if(finalizar == 1) {						
						menu.MenuFinalizarCompra();
						opcaoPag = scan.nextInt();
						
						double valor = carrinho.FinalizarCarrinho();
						System.out.println("\nValor Total: " + deci.format(valor));
						carrinho.MenuProdutos(listaProdutos);
						
						switch(opcaoPag) {
							case 1: 
								System.out.println("Valor à vista com 20% de desconto: R$" + 
													deci.format(pagvista.PagamentoFinalizarPedido(valor)));
								opcao = 6;
								break;
							case 2: 
								System.out.println("Valor à vista no crédito com 10% de desconto: R$" + 
												   deci.format(pagvistacred.PagamentoFinalizarPedido(valor)));							
								opcao = 6;
								break;
							case 3: 
								System.out.println("Valor das parcelas: R$" + 
												    deci.format(pagparc.PagamentoFinalizarPedido(valor)));
								opcao = 6;
								break;
							default:
								System.out.println("Número informado inválido! Digite um número válido!");
								break;							
						}
												
						System.out.println("\n***********************************************\n");
						System.out.println("Valor dos tributos - 9%: R$" + deci.format(valor * 9 / 100));
					}
					else break;
				case 6:	
					System.out.println("****************************************************\n");
					System.out.println("Mercado Pan agradece pela preferência. Volte sempre!\n");
					System.out.println("****************************************************");
					break;
				default:
					System.out.println("Número informado incorreto! Tente novamente\n");
					break;
			}
			
		}while(opcao != 6);
		
		scan.close();

	}

}

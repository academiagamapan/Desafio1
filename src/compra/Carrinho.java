package compra;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import estoque.Produto;
import financeiro.NotaFiscal;

public class Carrinho {

	private Map<Produto, Integer> listaCarrinho = new HashMap<Produto, Integer>();
	
	public Carrinho() {}
	
	public void adicionItem(Produto produto, int quantidade) {
		listaCarrinho.put(produto, quantidade);			
		System.out.println("você adicionou " + quantidade + " " + produto.getNome_produto() +"(s)");
	}
	
	public void removeItem(Produto produto, int quantidade) {
		for(int i = 0; i<quantidade; i++) {
			listaCarrinho.remove(produto);			
		}
		System.out.println("você removeu " + quantidade + " " + produto.getNome_produto() +"(s)");
	}

	public void fechaCompra() {
		System.out.println("escolha a forma de pagamento:"); // todo- anotar vantagens dos metodos
		System.out.println("1 - pagamento à vista (20% de desconto)");
		System.out.println("2 - crédito à vista (10% de desconto)");
		System.out.println("3 - crédito parcelado (sem desconto, com juros acima de 3 parcelas)");
		System.out.println("4 - crédito cartão pan (25% de desconto à vista e parcelado em até 12x sem juros)");
		
		Scanner pagamento = new Scanner(System.in);
		String formaPagamento;
		int nparcelas;
		
		switch (pagamento.nextInt()) {
			case 1:
				formaPagamento = "pvista";
				System.out.println("pix ou dinheiro ?");
				System.out.println("1 - pix");
				System.out.println("2 - dinheiro ?");
				Scanner escolhaDePagamento = new Scanner(System.in);
				int escolha = escolhaDePagamento.nextInt();
				if (escolha == 1) NotaFiscal.gerarNota(listaCarrinho, formaPagamento, 0, "pix");
				if (escolha == 2) NotaFiscal.gerarNota(listaCarrinho, formaPagamento, 0, "dinheiro");
				
				break;
			case 2:
				formaPagamento = "cvista";
				NotaFiscal.gerarNota(listaCarrinho, formaPagamento, 0, "");
				break;
			case 3:
				formaPagamento = "cparcelado";
				System.out.println("quantas parcelas ?");
				Scanner parcelas = new Scanner(System.in);
				nparcelas = parcelas.nextInt();
				NotaFiscal.gerarNota(listaCarrinho, formaPagamento, nparcelas, "");
				break;
			case 4:
				formaPagamento = "cpan";
				System.out.println("quantas parcelas ?");
				Scanner panParcelas = new Scanner(System.in);
				nparcelas = panParcelas.nextInt();
				NotaFiscal.gerarNota(listaCarrinho, formaPagamento, nparcelas, "");
				break;
		}
		
		pagamento.close();
		
		System.out.println("sua compra foi fechada e sua nota será gerada");
	}
	
	public void cancelaCompra() {
		listaCarrinho.clear();
		System.out.println("sua compra foi cancelada, que pena :(");
	}

}

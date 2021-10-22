package financeiro;

import java.util.ArrayList;
import java.util.List;

import estoque.Produto;

public class NotaFiscal {
	
	private static double imposto = 9.00;
	
//	Deve retornar a nota fiscal com o valor pago de tributos de 9% sobre a compra(Esse
//			valor não deve ser somado ao total do carrinho, somente ser exibido na nota fiscal);
	
	public static void main(String[] args) {
		
		System.out.println(calcularImposto(50.00));
		List<Produto> produtos = new ArrayList<>();
		Produto produto = new Produto();
		produto.setNome_produto("teste");
		produto.setId_produto(1);
		produto.setPreco_produto(5.00);
		produto.setQtda_produto(5);
		
		
		produtos.add(produto);
		
		gerarNota(produtos);
		
	}

	public static double calcularImposto(double valorTotalNota) {
		
		double valorImposto = (valorTotalNota * imposto / 100);
		
		return valorImposto;
	}
		
		
	public static void gerarNota(List<Produto> produtos) {
		
		double valorTotalNota = 0.0;
		
		
		System.out.println("------------ PantsAcademy ------------");
		System.out.println(" ");
		System.out.println(" ");
		
		for(Produto produto: produtos) {
			
			double valorTotalItem = produto.getPreco_produto() * produto.getQtda_produto();
						
			System.out.printf(" %s - %f - %d - %f \n", produto.getNome_produto()
					, produto.getPreco_produto(), produto.getQtda_produto() ,valorTotalItem);
						
			valorTotalNota += valorTotalItem;
		}
		
		double valorTotalTributo = calcularImposto(valorTotalNota);
		
		System.out.println("------------------------");
		
		System.out.printf("Total: 	R$ %f \n", valorTotalNota );
		System.out.printf("Tributo: R$ %f", valorTotalTributo );
		
	}

}

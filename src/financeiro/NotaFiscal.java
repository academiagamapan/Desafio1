package financeiro;

import java.util.ArrayList;
import java.util.List;

import estoque.Produto;

public class NotaFiscal {
	
	private static double imposto = 9.00;
	
	public static double calcularImposto(double valorTotalNota) {
		
		double valorImposto = (valorTotalNota * imposto / 100);
		
		return valorImposto;
	}
		
		
	public static void gerarNota(List<Produto> produtos) { //em vez de lista será um map <produto, int> (que será de produto e quantidade)
		
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

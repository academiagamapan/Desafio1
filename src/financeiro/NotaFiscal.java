package financeiro;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import estoque.Produto;

public class NotaFiscal {
		
	// * Met�do criado apenas para teste	
	public static void main(String[] args) {
				
		Produto produto = new Produto();
		produto.setNome_produto("teste");
		produto.setId_produto(1);
		produto.setPreco_produto(5.00);	
		
		Produto produto2 = new Produto();
		produto2.setNome_produto("teste 2");
		produto2.setId_produto(3);
		produto2.setPreco_produto(25.00);	
		
		HashMap<Produto, Integer> produtos = new HashMap<Produto, Integer>(); 
		produtos.put(produto, 5);
		produtos.put(produto2, 2);
		
		gerarNota(produtos);
			
	}
	// 
	
	private static final double IMPOSTO = 9.00;
	
	private static double calcularImposto(double valorTotalNota) {
		
		double valorImposto = (valorTotalNota * IMPOSTO / 100);
		
		return valorImposto;
	}
		
		
	public static void gerarNota(HashMap<Produto, Integer> produtos) {

		
		DecimalFormat numberFormat = new DecimalFormat("0.00");
		double valorTotalNota = 0.0;
				
		System.out.println("************************************************");
		System.out.println("**                PantsAcademy                **");
		System.out.println("**                                            **");
		System.out.println("**                                            **");
		System.out.println("**                                            **");
		System.out.println("**                                            **");
		System.out.println("************************************************");
		System.out.printf("\n");				
		
		System.out.println("Cod.   Descri��o     Val. Uni   qt    Val. Total");
		System.out.println("------------------------------------------------");
		
		for (Map.Entry<Produto, Integer> produto : produtos.entrySet()) {
			
			double valorTotalItem = produto.getKey().getPreco_produto() * (double) produto.getValue();
			
			System.out.printf("%d - %s  R$ %s x %d = R$ %s \n", produto.getKey().getId_produto()
												, produto.getKey().getNome_produto()
										 		, numberFormat.format(produto.getKey().getPreco_produto())
										 		, produto.getValue() 
										 		, numberFormat.format(valorTotalItem));
			
			valorTotalNota += valorTotalItem;
		     
		}
				
		System.out.printf("\n");
		
		double valorTotalTributo = calcularImposto(valorTotalNota);
		double desconto			 = 0;
		double valorFinalNota 	 = valorTotalNota - desconto;
		
		System.out.println("================================================");
		
		System.out.printf("Quantidade Itens: 		%d  \n", produtos.size() );
		System.out.printf("Sub Total: 			R$ %s \n",  numberFormat.format(valorTotalNota)  );
		System.out.printf("Desconto: 			R$ %s \n", numberFormat.format(desconto) );
		System.out.printf("Total � Pagar: 			R$ %s \n", numberFormat.format(valorFinalNota) );
		System.out.printf("Tributo: 			R$ %s \n",    numberFormat.format(valorTotalTributo) );
		
		System.out.printf(" \n");
		
		System.out.printf("Forma de Pagamento: %s \n", "Cart�o");
		
		if(true) {
			System.out.printf("N�mero de Parcelas: %d \n", 3);
			System.out.printf("Valor das Parcelas: R$ %s \n", numberFormat.format(3));
		}
				
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("\n");				

	}

}

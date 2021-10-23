package financeiro;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import estoque.Produto;

public class NotaFiscal {
		
// <<<<<<< carmo
// =======
// 	// * Met�do criado apenas para teste	
// 	public static void main(String[] args) {	
		
// //		Map<Produto, Integer> produtos = new HashMap<Produto, Integer>(); 
// //		produtos.put(new Produto(1, 5.00, "teste", 1), 5);
// //		produtos.put(new Produto(2, 15.00, "teste 2", 1), 2);
		
		
		
// //		gerarNota(produtos, "cvista", 0, "");
// //			
// 	}
// 	// 
	
// >>>>>>> main
	private static final double IMPOSTO = 9.00;
	
	private static double calcularImposto(double valorTotalNota) {
		
		double valorImposto = (valorTotalNota * IMPOSTO / 100);
		
		return valorImposto;
	}
		
		
	public static void gerarNota(Map<Produto, Integer> produtos, String codigoFormaPagamento
									, int numeroParcelas, String tipoPagamento) {
		
		DecimalFormat numberFormat = new DecimalFormat("0.00");
		double valorTotalNota = 0.0;
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
				
		System.out.println("************************************************");
		System.out.println("**                PantsAcademy                **");
		System.out.println("**                                            **");
		System.out.println("**                                            **");
		System.out.println("**                                            **");
		System.out.println("**                                            **");
		System.out.println("************************************************");		
		System.out.println("Data/Hora/" +  dateFormat.format(new Date()) );
		System.out.println("================================================");
		System.out.printf(" \n");
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
		double valorFinalNota 	 = obterValorDesconto(codigoFormaPagamento, valorTotalNota, numeroParcelas);
		double desconto			 = valorTotalNota - valorFinalNota;
		
		if(desconto <0) {
			desconto = 0;
		}
		
		System.out.println("================================================");
		
		System.out.printf("Quantidade Itens: 		%d  \n", produtos.size() );
		System.out.printf("Sub Total: 			R$ %s \n",  numberFormat.format(valorTotalNota)  );
		System.out.printf("Desconto: 			R$ %s \n", numberFormat.format(desconto) );
		System.out.printf("Total � Pagar: 			R$ %s \n", numberFormat.format(valorFinalNota) );
		System.out.printf("Tributo: 			R$ %s \n",    numberFormat.format(valorTotalTributo) );
		
		System.out.printf(" \n");
		
		System.out.printf("Forma de Pagamento: %s \n", getDescricaoPagamento(codigoFormaPagamento, tipoPagamento));
		
		if(numeroParcelas > 0 ) {
			
			double valorParcelas = valorFinalNota / numeroParcelas;
			
			System.out.printf("N�mero de Parcelas: %d \n", numeroParcelas);
			System.out.printf("Valor das Parcelas: R$ %s \n", numberFormat.format(valorParcelas));
		}
				
		System.out.printf("\n");
		System.out.printf("\n");
		System.out.printf("\n");				

	}
	
	private static String getDescricaoPagamento(String codigoFormaPagamento, String tipo) {
		
		switch (codigoFormaPagamento){
        	case "cvista":
	            return "Cart�o Avista";
        	case "cparcelado":
        		return "Cart�o Avista";
        	case "cpan":
        		return "Cart�o Pan";
            case "pvista":            	
            	return tipo.equals("dinheiro")? "Dinheiro" : "Pix";
            default:
            	return "";
		}
		
	}	
	
	private static double obterValorDesconto(String codigoFormaPagamento, double valor, int numeroParcelas) {
				
		switch (codigoFormaPagamento){
	    	case "cvista":
	            return Pagamento.creditoAVista(valor);
	    	case "cparcelado":
	    		return Pagamento.pagamentoParcelado(valor, numeroParcelas);
	    	case "cpan":
	    		return Pagamento.cartaoPan(valor, numeroParcelas);
	        case "pvista":            	
	        	return Pagamento.pagamentoAVista(valor);
	        default:
	        	return 0.0;
		}
		
	}

}

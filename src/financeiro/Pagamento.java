package financeiro;

public class Pagamento {
	


	public static double pagamentoAVista(double valor) { // dinheiro ou pix, 20% desconto
		double desconto;
		desconto = valor * 0.2;
		return valor - desconto;
		
	}
	
	public static double creditoAVista(double valor) { // 10% de desconto
		double desconto;
		desconto = valor * 0.1;
		return valor - desconto;		
	}
	
}

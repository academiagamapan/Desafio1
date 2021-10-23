package financeiro;

public class Pagamento {
	
	private static double descontoDinheiroAVista = 0.2;
	private static double descontoCreditoAVista = 0.1;
	private static double descontoPan = 0.25;
	private static double jurosParcelado = 0.05;

	public static double pagamentoAVista(double valor) { // dinheiro ou pix, 20% desconto
		double desconto = descontoDinheiroAVista * valor;
		return valor - desconto;
		
	}
	
	public static double creditoAVista(double valor) { // 10% de desconto
		double desconto = descontoCreditoAVista * valor;
		return valor - desconto;		
	}
	
	public static double pagamentoParcelado(double valor, int parcelas) { // acrescimo de 5% acima de 3 parcelas
		if(parcelas >= 1 && parcelas <= 3) {
			return valor;
		}else if(parcelas > 3 && parcelas <= 10){
			double acrescimo = jurosParcelado * valor;
			return valor + acrescimo;
		}else {
			System.out.println("Numero de parcelas inválido!");
			return (Double) null;
		}
	}
	
	public static double cartaoPan(double valor, int parcelas) { // com cartão Pan desconto de 25% ou parcelado sem juros
		if(parcelas == 1) {
			double desconto = descontoPan * valor;
			return valor - desconto;
		}else if(parcelas > 1 && parcelas <= 12) {
			return valor;
		}else {
			System.out.println("Numero de parcelas inválido!");
			return (Double) null;
		}
	}
	
}

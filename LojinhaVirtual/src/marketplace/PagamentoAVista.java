package marketplace;

public class PagamentoAVista implements Pagamento {

	@Override
	public double PagamentoFinalizarPedido(double valor) {				
		return valor -= ((valor * 20) / 100) ;  //desconto de 20%	
	}

}

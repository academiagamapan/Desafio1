package marketplace;

public class PagamentoAVistaCredito implements Pagamento {

	@Override
	public double PagamentoFinalizarPedido(double valor) {		
		return valor -= ((valor * 10) / 100) ;  //desconto de 10%
	}

}

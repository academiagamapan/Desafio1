package marketplace;

import java.util.Scanner;

public class PagamentoParcelado implements Pagamento {

	Scanner scan = new Scanner(System.in);
	
	@Override
	public double PagamentoFinalizarPedido(double valor) {
		int opcao;
		do {
			System.out.print("\nSelecione em quantas vezes: " +
				             "\n2- 2x" +
		                     "\n3- 3x" +
				             "\nDigite a op��o: ");
			opcao = scan.nextInt();
			
			if(opcao == 2) valor /= 2;
			else if(opcao == 3) valor /= 3;
			else System.out.println("\nEssa quantidade � inv�lida.");
			
		}while(opcao < 2 || opcao > 3);
		
		return valor;		
	}

}

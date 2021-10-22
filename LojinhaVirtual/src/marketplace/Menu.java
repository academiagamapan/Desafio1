package marketplace;

public class Menu {
	
	public void LogoMercado() {
		System.out.println("*************************************************************");
		System.out.println("  ╔═╗╔═╗╔═══╗╔═══╗╔═══╗╔═══╗╔═══╗╔═══╗     ╔═══╗╔═══╗╔═╗─╔╗\r\n"
				+ "  ║║╚╝║║║╔══╝║╔═╗║║╔═╗║║╔═╗║╚╗╔╗║║╔═╗║     ║╔═╗║║╔═╗║║║╚╗║║\r\n"
				+ "  ║╔╗╔╗║║╚══╗║╚═╝║║║─╚╝║║─║║─║║║║║║─║║     ║╚═╝║║║─║║║╔╗╚╝║\r\n"
				+ "  ║║║║║║║╔══╝║╔╗╔╝║║─╔╗║╚═╝║─║║║║║║─║║     ║╔══╝║╚═╝║║║╚╗║║\r\n"
				+ "  ║║║║║║║╚══╗║║║╚╗║╚═╝║║╔═╗║╔╝╚╝║║╚═╝║     ║║───║╔═╗║║║─║║║\r\n"
				+ "  ╚╝╚╝╚╝╚═══╝╚╝╚═╝╚═══╝╚╝─╚╝╚═══╝╚═══╝     ╚╝───╚╝─╚╝╚╝─╚═╝");
		System.out.println("*************************************************************");
	}
	
	public void MenuPrincipal() {
		System.out.print("\n1- Adicionar produto ao carrinho." +
	             		 "\n2- Remover produto do carrinho." +
		                 "\n3- Visualizar tabela produtos" +
		                 "\n4- Visualizar Carrinho." +
		                 "\n5- Finalizar compra." +
	                     "\n6- Sair." +
		                 "\nDigite a sua opção: ");
	}
	
	public void MenuFinalizarCompra() {
		System.out.println("\n***********************************************\n");
		System.out.println("            Finalizando compra\n");
		System.out.print("Qual a forma de pagamento:\n " +
		                 "\n1- À vista dinheiro ou pix - 20% de desconto" +
		                 "\n2- À vista no crédito - 10% de desconto" +
		                 "\n3- Parcelar em até 3x"+
		                 "\nDigite a opão: ");
	}
	
}

package MarketPlace;

import java.util.List;

public class CarrinhoCompras {

	public void LogoMercado() {
		System.out.println("----- Mercado Pan -----");
	}
	
	public void ExibirProdutos(List<Produto> produtos) {
		
		System.out.println("----- Produtos -----\n");
		System.out.format("%8s%18s%20s\n", "Código", "Produto", "Estoque"); 
		System.out.println("---------------------------------------------------------");
		for(int i=0; i<produtos.size(); i++) {
			 //Integer tamCod = produtos.get(i).getCodigoProd().toString().length();
			 Integer tamProd = produtos.get(i).getNomeProd().length();
			 
			 System.out.printf("%5d%s|%s%s%s|%s%d%s|\n", produtos.get(i).getCodigoProd(), Espaco(0, 5),
					                                          Espaco(0, 3), produtos.get(i).getNomeProd(), 
					                                          Espaco(tamProd, 17), Espaco(0, 5), produtos.get(i).getQntdProd(),
					                                          Espaco(0, 5));

		}
	}
		
	public String Espaco(Integer tamI, Integer tamF) {
		String espaco = "";
		
		for(int i=tamI; i<=tamF; i++) {
			espaco += " ";
		}
		
		return espaco;
	}
		
	
	
	

}

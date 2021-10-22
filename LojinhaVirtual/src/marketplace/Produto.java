package marketplace;

import java.util.List;

public class Produto {
	
	private Long codigoProd;
	private String nomeProd;
	private Long qntdEstoque;
	private Double precoProd;
	
	public Produto(Long codigoProd, String nomeProd, Long qntdEstoque, Double precoProd) {
		this.codigoProd = codigoProd;
		this.nomeProd = nomeProd;
		this.qntdEstoque = qntdEstoque;
		this.precoProd = precoProd;
	}

	public Long getCodigoProd() { return codigoProd; }
	public void setCodigoProd(Long codigoProd) { this.codigoProd = codigoProd; }

	public String getNomeProd() { return nomeProd; }
	public void setNomeProd(String nomeProd) { this.nomeProd = nomeProd; }

	public Long getQntdEstoque() { return qntdEstoque; }
	public void setQntdEstoque(Long qntdEstoque) { this.qntdEstoque = qntdEstoque; }

	public Double getPrecoProd() { return precoProd; }
	public void setPrecoProd(Double precoProd) { this.precoProd = precoProd; }
	
	public void MenuProdutos(List<Produto> prod) {
		System.out.printf("\n%6s%18s%16s%11s\n", "Cod.", "Produtos", "Qntd.", "Preço");
		System.out.print("------------------------------------------------------\n");
		for(int i=0; i<prod.size(); i++) {
			System.out.println(LinhaProdutos(prod, i));		
		}
		System.out.print("------------------------------------------------------\n");
	}
	
	public String LinhaProdutos(List<Produto> prod, int i) {		
		String linha = "";
		linha += "   " + EspacoEntreColunas(Long.toString(prod.get(i).getCodigoProd()),Long.toString(prod.get(i).getCodigoProd()).length(), 5);
		linha += "    " + EspacoEntreColunas(prod.get(i).getNomeProd(),prod.get(i).getNomeProd().length(), 18);
		linha += "   " + EspacoEntreColunas(Long.toString(prod.get(i).getQntdEstoque()), Long.toString(prod.get(i).getQntdEstoque()).length() , 7);
		linha += "   " + EspacoEntreColunas(prod.get(i).getPrecoProd().toString(), prod.get(i).getPrecoProd().toString().length() , 7);		
		return linha; 
	}
	
	public String EspacoEntreColunas(String texto, int tamI, int tamF) {
		for(int i=tamI; i<tamF; i++) {
			texto += " ";
		}
		texto += "|";
		return texto;
	}
	
	
}

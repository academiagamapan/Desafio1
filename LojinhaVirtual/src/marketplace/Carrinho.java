package marketplace;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrinho {
	
	Scanner scan = new Scanner(System.in);
	
	private Double precoTotalCarrinho;
	private List<ItemCarrinho> item = new ArrayList<>();
	
	public Carrinho() {
		this.precoTotalCarrinho = 0.0;
	}
	
	public Double getPrecoTotalCarrinho() { return precoTotalCarrinho; }
	
	public void setPrecoTotalCarrinho(Double precoTotalCarrinho) { this.precoTotalCarrinho = precoTotalCarrinho; }
	
	public List<ItemCarrinho> getItem() { return item; }
	
	public void AddItem(ItemCarrinho itens) {
		this.item.add(itens);
	}
	
	public void MenuProdutos(List<Produto> prod) {
		System.out.printf("\n%6s%18s%16s%11s\n", "Cod.", "Produtos", "Qntd.", "Preço");
		System.out.print("------------------------------------------------------\n");
		for(int i=0; i<item.size(); i++) {
			System.out.println(LinhaProdutos(prod, i));	
		}
		System.out.print("------------------------------------------------------\n");
	}
	
	public String LinhaProdutos(List<Produto> prod, int i) {	
		String linha = "";
		linha += "   " + EspacoEntreColunas(Integer.toString(i+1), Integer.toString(i+1).length(), 5);
		linha += "    " + EspacoEntreColunas(prod.get(item.get(i).getCodProd()).getNomeProd(), prod.get(item.get(i).getCodProd()).getNomeProd().length(), 18);
		linha += "   " + EspacoEntreColunas(Long.toString(item.get(i).getQntd()), Long.toString(item.get(i).getQntd()).length() , 7);
		linha += "   " + EspacoEntreColunas(item.get(i).getPrecoTotalItem().toString(), item.get(i).getPrecoTotalItem().toString().toString().length() , 7);		
		return linha; 
	}
	
	public String EspacoEntreColunas(String texto, int tamI, int tamF) {
		for(int i=tamI; i<tamF; i++) {
			texto += " ";
		}
		texto += "|";
		return texto;
	}
	
	public void RemoverItemLista(List<Produto> prod, int cod) {
		//retorna a quantidade de estoque
		prod.get(item.get(cod).getCodProd()).setQntdEstoque(prod.get(item.get(cod).getCodProd()).getQntdEstoque() + item.get(cod).getQntd());;
		//remove o item do carrinho
		item.remove(cod);	
	}

	public double FinalizarCarrinho() {
		for(int i=0; i<item.size(); i++) {
			precoTotalCarrinho += item.get(i).getPrecoTotalItem();
		}
		return precoTotalCarrinho;
	}

}

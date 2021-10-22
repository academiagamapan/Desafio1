package marketplace;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	
	private Double precoTotalCarrinho;
	private List<ItemCarrinho> item = new ArrayList<>();
	
	public Double getPrecoTotalCarrinho() { return precoTotalCarrinho; }
	
	public void setPrecoTotalCarrinho(Double precoTotalCarrinho) { this.precoTotalCarrinho = precoTotalCarrinho; }
	
	public List<ItemCarrinho> getItem() { return item; }
	
	public void AddItem(ItemCarrinho itens) {
		this.item.add(itens);
	}
	




}

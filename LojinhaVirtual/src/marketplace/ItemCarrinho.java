package marketplace;

public class ItemCarrinho {
	
	private Integer  qntd;
	private Double precoTotalItem;
	private Integer codProd;
	
	public ItemCarrinho(Integer qntd, Double precoTotalItem, Integer codProd) {
		this.qntd = qntd;
		this.precoTotalItem = precoTotalItem;
		this.codProd = codProd;
	}

	public Integer getQntd() { return qntd; }
	public void setQntd(Integer qntd) { this.qntd = qntd; }

	public Double getPrecoTotalItem() { return precoTotalItem; }
	public void setPrecoTotal(Double precoTotalItem) { this.precoTotalItem = precoTotalItem; }

	public Integer getCodProd() { return codProd; }
	public void setCodProd(Integer codProd) { this.codProd = codProd; }
	
	
}

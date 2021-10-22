package marketplace;

public class ItemCarrinho {
	
	private Long  qntd;
	private Double precoTotalItem;
	private Integer codProd;
	
	public ItemCarrinho(Long qntd, Double precoTotalItem, Integer codProd) {
		this.qntd = qntd;
		this.precoTotalItem = precoTotalItem;
		this.codProd = codProd;
	}

	public Long getQntd() { return qntd; }

	public void setQntd(Long qntd) { this.qntd = qntd; }

	public Double getPrecoTotalItem() { return precoTotalItem; }

	public void setPrecoTotal(Double precoTotalItem) { this.precoTotalItem = precoTotalItem; }

	public Integer getCodProd() { return codProd; }

	public void setCodProd(Integer codProd) { this.codProd = codProd; }
	
	
}

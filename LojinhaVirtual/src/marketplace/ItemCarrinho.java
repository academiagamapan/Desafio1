package marketplace;

public class ItemCarrinho {
	
	private Double precoProd;
	private Long  qntd;
	private Double precoTotalItem;
	private Produto produtos;
	
	public ItemCarrinho(Double precoProd, Long qntd, Double precoTotalItem, Produto produtos) {
		this.precoProd = precoProd;
		this.qntd = qntd;
		this.precoTotalItem = 0.0;
		this.setProdutos(produtos);
	}

	public Double getPrecoProd() { return precoProd; }

	public void setPrecoProd(Double precoProd) { this.precoProd = precoProd; }

	public Long getQntd() { return qntd; }

	public void setQntd(Long qntd) { this.qntd = qntd; }

	public Double getPrecoTotalItem() { return precoTotalItem; }

	public void setPrecoTotal(Double precoTotalItem) { this.precoTotalItem = precoTotalItem; }

	public Produto getProdutos() { return produtos; }

	public void setProdutos(Produto produtos) { this.produtos = produtos; }
	
	
	
	
}

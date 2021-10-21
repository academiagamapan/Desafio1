package MarketPlace;

public class Produto {
	
	private Integer codigoProd;
	private String nomeProd;
	private Integer qntdProd;
	private Double precoProd;
	
	public Produto(Integer codigoProd, String nomeProd, Integer qntdProd, Double precoProd) {
		super();
		this.codigoProd = codigoProd;
		this.nomeProd = nomeProd;
		this.qntdProd = qntdProd;
		this.precoProd = precoProd;
	}
	
	public Integer getCodigoProd() { return codigoProd; }

	public void setCodigoProd(Integer codigoProd) { this.codigoProd = codigoProd; }

	public String getNomeProd() { return nomeProd; }

	public void setNomeProd(String nomeProd) { this.nomeProd = nomeProd; }

	public Integer getQntdProd() { return qntdProd; }

	public void setQntdProd(Integer qntdProd) { this.qntdProd = qntdProd; }

	public Double getPrecoProd() { return precoProd; }

	public void setPrecoProd(Double precoProd) { this.precoProd = precoProd; }

	@Override
	public String toString() {
		return getCodigoProd() + " - " + getNomeProd() + " - " + getQntdProd()
				+ " - " + getPrecoProd() + "\n";
	}
	
	
	
	
	
	
	
}

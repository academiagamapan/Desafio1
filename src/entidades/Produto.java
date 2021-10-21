package entidades;

public class Produto {
	
	Integer codigo;
	String nome;
	Double preço;
	Integer estoque;
	
	public Produto() {
		
	}
	
	public Produto(Integer codigo, String nome, Double preço, Integer estoque) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preço = preço;
		this.estoque = estoque;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreço() {
		return preço;
	}
	public void setPreço(Double preço) {
		this.preço = preço;
	}
	public Integer getEstoque() {
		return estoque;
	}
	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	@Override
	public String toString() {
		return "["+codigo+"]" +"	    " + nome + "	       	  " + preço + "	       		" +  estoque;
	}
	
	
}

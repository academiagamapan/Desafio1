package entidades;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	
	private String nome = "PAN Store";
	private Double tributo = 0.09;
	private List<Produto> produtos = new ArrayList<>();
	
	
	
	
	
	public String getNome() {
		return nome;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public Double getTributo() {
		return tributo;
	}
	

	public void pagDinPix(double valorTotal) {
		valorTotal -= valorTotal * 0.2;
		
	}
	
	public void pagAVistaCred(double valorTotal) {
		valorTotal -= valorTotal * 0.1;
	}
	
	public double pagParcelado(double valorTotal, int parcela) {
		double valorParcelado = valorTotal / parcela;
		return valorParcelado;
	}

	
}

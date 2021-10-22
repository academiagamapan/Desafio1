package estoque;

public class Produto {

		private int id_produto;
		private String nome_produto;
		private double preco_produto;
		private int qtda_produto;
		
		public int getId_produto() {
			return id_produto;
		}
		public void setId_produto(int id_produto) {
			this.id_produto = id_produto;
		}
		public double getPreco_produto() {
			return preco_produto;
		}
		public void setPreco_produto(double preco_produto) {
			this.preco_produto = preco_produto;
		}
		public String getNome_produto() {
			return nome_produto;
		}
		public void setNome_produto(String nome_produto) {
			this.nome_produto = nome_produto;
		}
		public int getQtda_produto() {
			return qtda_produto;
		}
		public void setQtda_produto(int qtda_produto) {
			this.qtda_produto = qtda_produto;
		}	
}

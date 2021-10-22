package br.com.equipe7.Modelos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Compra {
    private double valorTotalDaCompra;
    private ArrayList<Produto> produtos = new ArrayList<>();
    private LocalDate data = LocalDate.now();
    private boolean compraFinalizada;

    public double getValorTotalDaCompra() {
        return valorTotalDaCompra;
    }

    public void setValorTotalDaCompra(double valorTotalDaCompra) {
        this.valorTotalDaCompra = valorTotalDaCompra;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean isCompraFinalizada() {
        return compraFinalizada;
    }

    public void setCompraFinalizada(boolean compraFinalizada) {
        this.compraFinalizada = compraFinalizada;
    }
}

package br.com.equipe7;

import br.com.equipe7.Modelos.Cliente;
import br.com.equipe7.Modelos.Compra;
import br.com.equipe7.Modelos.Produto;
import br.com.equipe7.Utilittarios.Utils;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

     static ArrayList<Cliente> clientes = new ArrayList<>();
     static LinkedHashSet<Produto> estoque = Utils.getProdutos();
     static ArrayList<Compra> carrinho = new ArrayList<>();

     static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       int opcao = 0;
       String esp = "";


       //Menu Principal
        do {
            System.out.printf("%10s************************************************************\n",esp);
            System.out.printf("%10s*------------------------!! MENU !!------------------------*\n",esp);
            System.out.printf("%10s************************************************************\n",esp);
            System.out.printf("%10s*%10s1.%5sMostrar Estoque%26s*\n",esp,esp,esp,esp);
            System.out.printf("%10s*%10s2.%5sComprar%34s*\n",esp,esp,esp,esp);
            System.out.printf("%10s*%10s3.%5sCarrinho%33s*\n",esp,esp,esp,esp);
            System.out.printf("%10s************************************************************\n",esp);
            System.out.printf("%10s Digite uma opção 1-3, Digite 0 para sair: ",esp);
            opcao = sc.nextInt();

            switch (opcao){
                case 0:
                    System.out.printf("%10s Volte Sempre!!",esp);
                    break;
                case 1:
                    Utils.limparTela();
                    mostrarEstoque();
                    Utils.limparTela();
                    break;
                case 2:
                    Utils.limparTela();
                    comprar();
                    break;
            }

        }while (opcao != 0);

    }

    private static void comprar() {
        int opcao = 0;
        String esp = "";
        Compra compra = new Compra();

        do{
            System.out.printf("%10s************************************************************\n",esp);
            System.out.printf("%10s*-----------------------!! ESTOQUE !!----------------------*\n",esp);
            System.out.printf("%10s************************************************************\n",esp);
            System.out.printf("%15s%5sCÓD%5sDescrição%5sQTD%5sPREÇO\n\n",esp,esp,esp,esp,esp);
            for(Produto p : estoque){
                System.out.printf("%15s%5s%d%8s%"+Utils.tamanhoMaiorString(estoque)+"s%9d%6sR$%.2f\n",esp,esp,
                        p.getCodigoDoProduto(),esp,p.getNomeDoProduto(),p.getQtdEmEstoque(),esp,p.getPrecoDoProduto());
            }
            System.out.printf("%10s************************************************************\n",esp);
            System.out.printf("%10s Digite o código do produto que deseja comprar: ",esp);
            opcao = sc.nextInt();

            if(opcao != 0){

                Produto x = pesquisaProduto(opcao);
                if(x != null){

                    int qtdCompra = 0;

                    do{
                        System.out.printf("%10s Digite a quantidade do produto ou 0 para cancelar: ",esp);
                        qtdCompra = sc.nextInt();
                        if(qtdCompra > x.getQtdEmEstoque()){
                            System.out.printf("%10s Quantidade do produto insuficiente!! ",esp);
                        }
                        if(qtdCompra == 0){
                            break;
                        }
                    }while(qtdCompra > x.getQtdEmEstoque() || qtdCompra != 0);

                    if(carrinho.isEmpty()){

                        compra.getProdutos().add(x);
                        compra.setValorTotalDaCompra(x.getPrecoDoProduto()*qtdCompra);
                        carrinho.add(compra);

                        //Atualizar Estoque
                        estoque.remove(x);
                        x.setQtdEmEstoque(x.getQtdEmEstoque()-qtdCompra);
                        estoque.add(x);

                    }
                }
            }

        }while(opcao != 0);
    }

    private static Produto pesquisaProduto(int opcao) {
        for (Produto p : estoque){
            if(p.getCodigoDoProduto() == opcao){
                return p;
            }
        }
        return null;
    }

    private static void mostrarEstoque() {
        int opcao = 0;
        String esp = "";

        do{
            System.out.printf("%10s************************************************************\n",esp);
            System.out.printf("%10s*-----------------------!! ESTOQUE !!----------------------*\n",esp);
            System.out.printf("%10s************************************************************\n",esp);
            System.out.printf("%15s%5sCÓD%5sDescrição%5sQTD%5sPREÇO\n\n",esp,esp,esp,esp,esp);
            for(Produto p : estoque){
                System.out.printf("%15s%5s%d%8s%"+Utils.tamanhoMaiorString(estoque)+"s%9d%6sR$%.2f\n",esp,esp,
                        p.getCodigoDoProduto(),esp,p.getNomeDoProduto(),p.getQtdEmEstoque(),esp,p.getPrecoDoProduto());
            }
            System.out.printf("%10s************************************************************\n",esp);
            System.out.printf("%10s Digite 0 para voltar ao menu principal: ",esp);
            opcao = sc.nextInt();
        }while(opcao != 0);
    }
}

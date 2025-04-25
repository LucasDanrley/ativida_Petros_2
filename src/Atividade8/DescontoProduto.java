package Atividade8;

public class DescontoProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("carne",72);

        produto.exibirPreco();
        produto.aplicarDesconto(10);
        produto.exibirPreco();
    }
}
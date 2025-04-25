package Atividade7;

public class VerificacaoPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("lucas",19);

        pessoa.visualizarIdade();
        pessoa.fazerAniversario();
        pessoa.visualizarIdade();
    }
}
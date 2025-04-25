package Atividade3;

public class TestarAConta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("123456-7");

        conta.depositar(1850);
        conta.sacar(680);

        conta.verificarSaldo();
    }
}
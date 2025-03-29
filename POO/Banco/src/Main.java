public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.depositar(40000);
        conta.sacar(15000);
        conta.exibirDados();

    }
}
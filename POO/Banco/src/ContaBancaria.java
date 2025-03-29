public class ContaBancaria {

    private String titular = "Fernando";
    private int numeroConta = 53462;
    private double saldo = 7536.56;
    private double taxa = 1.50;

    public void depositar(double add){

        if(add <= -1){
            System.out.println("O valor não é compatível");
        }

        else{
            saldo += add;
        }

    }

    public void sacar(double saque){

        if(saldo < taxa + saque){
            System.out.println("Saldo insuficiente para concluir a transação");
        }
        else{
           saldo = saldo - taxa - saque;
        }
    }

    public String getTitular(){
        return titular;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void exibirDados(){
        System.out.println("Nome do titular: " + titular);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
    }


    }


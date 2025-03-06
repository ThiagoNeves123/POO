import java.util.Scanner;

public class Ex8{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quanto foi consumido na casa? ");
        int consumo = teclado.nextInt();
        int kwh = 1;
        int conta = consumo * kwh;
        if(consumo > 150){
            double desconto = conta * 0.10;
            conta -= (int) desconto;
            System.out.printf("O valor da conta eh: %d", conta);
        }

        else System.out.printf("O valor da conta eh: %d", conta);



    }
}
import java.util.Scanner;

public class Ex6{
    public static void  main(String [] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual foi a distancia percorrida em km? ");
        int dist = teclado.nextInt();
        System.out.println("Quantas horas foram gastas? ");
        int t = teclado.nextInt();
        System.out.println("Quanta gasolina foi consumida? ");
        int gas = teclado.nextInt();

        int VM;
        VM = dist/t;
        System.out.printf("A velocidade media é de: %d Km/h \n", VM);

        int consume;
        consume = dist/gas;
        System.out.printf("O consumo foi de: %d Km/l", consume);
    }
}
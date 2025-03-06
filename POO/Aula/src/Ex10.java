import java.util.Scanner;

public class Ex10 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int a = teclado.nextInt();
        System.out.println("Digite outro numero: ");
        int b = teclado.nextInt();
        System.out.println("Digite outro numero");
        int c = teclado.nextInt();

        if(a < b && a < c){
            System.out.print("Seu primeiro numero esta antes dos outros dois");

        }
        else if (a > b && a > c){
            System.out.print("Seu primeiro numero esta depois dos outros dois");
        }
        else if (a > b && a < c){
            System.out.print("Seu primeiro numero esta entre os outros dois");
        }
        else if (a < b && a > c){
            System.out.print("Seu numero esta entre os dois");
        }
    }

}

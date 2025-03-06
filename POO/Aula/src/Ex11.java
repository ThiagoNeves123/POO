import java.util.Scanner;

public class Ex11 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual eh a operacao aritimetica? ");
        char op = teclado.nextLine().charAt(0);
        System.out.println("Digite um numero: ");
        int a = teclado.nextInt();
        System.out.println("Digite outro numero: ");
        int b = teclado.nextInt();


        switch (op){
            case '+': System.out.println(a + b);
            case '-': System.out.println(a - b);
            case '*': System.out.println(a * b);
            case '/': System.out.println(a / b);

        }

    }

}

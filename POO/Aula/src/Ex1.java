import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva o primeiro numero");
        int a = teclado.nextInt();
        System.out.println("Escreva o segundo numero");
        int b = teclado.nextInt();

        int soma = a + b;
        System.out.printf("A soma de %d e %d eh %d \n", a, b, soma);

        int sub = a - b;
        System.out.printf("A subtracao de %d e %d eh %d \n", a, b, sub);

        int mult = a * b;
        System.out.printf("A multiplicacao de %d e %d eh %d \n", a, b, mult);

        int div = a / b;
        System.out.printf("A divisao de %d e %d eh %d \n", a, b, div);



}
}
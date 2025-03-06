import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva seu salario:");
        float salario = teclado.nextFloat();
        System.out.println("Digite seu aumento: \n");
        float aumento = teclado.nextFloat();

        float salarioFinal = salario + salario*(aumento/100);
        System.out.printf("O salario final eh de: %f", salarioFinal );



}
}
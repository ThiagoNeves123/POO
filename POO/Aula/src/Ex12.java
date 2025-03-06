import java.util.Scanner;

public class Ex12 {
    public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    int a = teclado.nextInt();
    System.out.println("Digite outro numero: ");
    int b = teclado.nextInt();
    int soma = 0;
    int qtd = 0;

    if (a > b){
        int aux = a;
        a = b;
        b = aux;
    }

    for (int i = a; i <= b; i++){
        if (i % 2 == 0){
        System.out.println(i);
        soma += i;
        qtd++;
    }
    }
    float media = (float) soma / qtd;
    System.out.println("A soma eh: " + soma);
    System.out.println("A media eh: " + media);
}

}
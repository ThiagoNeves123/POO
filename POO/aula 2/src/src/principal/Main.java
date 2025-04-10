package principal;
import formas.retangulo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    retangulo r;

    Scanner teclado = new Scanner(System.in);

    System.out.println("X: ");
    int x = teclado.nextInt();

    System.out.println("Y: ");
    int y = teclado.nextInt();

    System.out.println("Altura: ");
    int altura = teclado.nextInt();

    System.out.println("Largura: ");
    int largura = teclado.nextInt();


    r = new retangulo(5, 6, 9 );
    retangulo r2 = new retangulo(5, 9, 8, 7);

        System.out.printf("Retangulo(%d, %d, %d, %d)\n",
                x, y, largura, altura);
        }
    }


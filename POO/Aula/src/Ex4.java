import java.util.Scanner;

public class Ex4 {
    public static void  main(String [] args){

        final float pi = 3.14159f;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o raio de circulo: ");
        float raio = teclado.nextFloat();

        float perimetro = 2 * pi * raio;;
        System.out.printf("O perimetro eh: %f \n", perimetro);

        float area = (float) (pi * Math.pow(raio, 2));
        System.out.printf("A area eh: %f",area);
    }

}

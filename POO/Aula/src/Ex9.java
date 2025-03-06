import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero");
        float x = teclado.nextFloat();
        int b = (int)x;
        if ((double)(x- (float)b) > (double)0.5F)
        {
            int valor = b + 1;
            System.out.println(valor);
        }
        else {
            System.out.println(b);
        }

    }
}

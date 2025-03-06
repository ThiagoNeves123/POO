import java.util.Scanner;

public class Ex5 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um horario em segundos: ");
        float t = teclado.nextFloat();
        float horas;
        horas = t/3600;
        t = t % 3600;
        float minutos;
        minutos = t/60;
        float segundos;
        segundos = t % 60;

        System.out.printf("Horas: %f\nMinutos: %f\nSegundos: %f", horas, minutos, segundos);

    }
}

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número de alunos: ");
        int alunos = teclado.nextInt();
        double soma = 0;
        int i = 0;
        while (i < alunos) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            double nota = teclado.nextDouble();
            soma += nota;
            i++;

        }

        double media = soma / alunos;

        System.out.println("A media da turma eh: " + media);
    }
}
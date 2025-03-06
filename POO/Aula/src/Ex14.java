import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (ou -1 para sair): ");
        double nota = teclado.nextDouble();

        int alunos = 0;
        double soma = 0;
        double MenorNota = Double.MAX_VALUE;
        double MaiorNota = Double.MIN_VALUE;

        while (nota != -1) {
            soma += nota;
            alunos++;


            if (nota < MenorNota) {
                MenorNota = nota;
            }
            if (nota > MaiorNota) {
                MaiorNota = nota;
            }


            System.out.print("Digite a nota do aluno (ou -1 para sair): ");
            nota = teclado.nextDouble();
        }


        if (alunos > 0) {
            double media = soma / alunos;  // Calcula a média
            System.out.printf("A média das notas dos alunos é: %.1f\n", media);
            System.out.printf("A maior nota é: %.1f\n", MaiorNota);
            System.out.printf("A menor nota é: %.1f\n", MenorNota);
        } else {
            System.out.println("Nenhuma nota foi inserida.");
        }

        System.out.println("A quantidade de alunos é: " + alunos);

        teclado.close();
    }
}

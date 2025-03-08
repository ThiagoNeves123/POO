import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int quantidadeVogais = 0;
        int quantidadeDigitos = 0;
        int quantidadeOutros = 0;

        System.out.println("Digite caracteres. Digite '.' para sair.");

        while (true) {
            char c = teclado.next().charAt(0);

            if (c == '.') {
                break;
            }

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                quantidadeVogais++;
            }
            else if (Character.isDigit(c)) {
                quantidadeDigitos++;
            }
            else {
                quantidadeOutros++;
            }
        }

        System.out.println("Quantidade de vogais: " + quantidadeVogais);
        System.out.println("Quantidade de digitos: " + quantidadeDigitos);
        System.out.println("Quantidade de outros caracteres: " + quantidadeOutros);

        teclado.close();
    }
}

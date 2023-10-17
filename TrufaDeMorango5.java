    package VetoresModulos;
    import java.util.Scanner;
    public class TrufaDeMorango5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma palavra: ");
            String palavra = scanner.nextLine();
            if (ehPalindromo(palavra)) {
                System.out.println("A palavra é um palíndromo.");
            } else {
                System.out.println("A palavra não é um palíndromo.");
            }
        }
    }

    public static boolean ehPalindromo(String palavra) {
        palavra = palavra.toLowerCase(); // Converter a palavra para letras minúsculas
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();
        return palavra.equals(palavraInvertida);
    }
}


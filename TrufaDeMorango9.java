    package VetoresModulos;
    import java.util.Scanner;
    public class TrufaDeMorango9 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            
            // Chama a função 'ehPrimo' para verificar se o número é primo
            if (ehPrimo(numero)) {
                System.out.println("O número é primo.");
            } else {
                System.out.println("O número não é primo.");
            }
        }
    }

    // Função para verificar se um número é primo
    public static boolean ehPrimo(int num) {
        // Um número primo é maior que 1 e só é divisível por 1 e por ele mesmo.
        if (num <= 1) {
            return false;
        }
        
        // Percorre todos os números de 2 até a raiz quadrada do número para verificar divisibilidade.
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        
        return true; 
    }
}
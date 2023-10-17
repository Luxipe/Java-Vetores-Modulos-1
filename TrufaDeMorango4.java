    package VetoresModulos;
    import java.util.Scanner;

    public class TrufaDeMorango4 {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt(); // Lê um número inteiro da entrada padrão
            int resultado = somaDigitos(numero); 
            System.out.println("Soma dos dígitos: " + resultado); 
        }
    }

    // Função para calcular a soma dos dígitos de um número
    public static int somaDigitos(int numero) {
        int soma = 0;
        
        while (numero > 0) {
            int digito = numero % 10; // último dígito do número
            soma += digito; // poe o dígito à soma
            numero /= 10; // remove o último dígito do número
        }
        return soma; 
    }
}

        package VetoresModulos;  

        import java.util.Scanner;   

        public class TrufaDeMorango1 {
        public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {  // Cria um objeto Scanner para leitura de entrada do teclado.
            System.out.println("Digite o primeiro número: ");  
            int numero1 = scanner.nextInt();  // Vai ler o primeiro número da entrada padrão e armazena em 'numero1'.

            System.out.println("Digite o segundo número: ");  
            int numero2 = scanner.nextInt();  // Vai ler o segundo número da entrada padrão e armazena em 'numero2'.

            int resultado = numero1 * numero2;  

            System.out.println("Resultado: " + resultado);  
        }
    }
}
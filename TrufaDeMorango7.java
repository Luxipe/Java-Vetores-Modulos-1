   package VetoresModulos;
   import java.util.Scanner;

   public class TrufaDeMorango7 {
   public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma frase: ");
            String frase = scanner.nextLine(); // Lê a frase fornecida pelo usuário.
            int numVogais = contaVogais(frase); 
            System.out.println("Número de vogais: " + numVogais); 
        }
    }


    public static int contaVogais(String frase) {
        String vogais = "aeiouAEIOU"; // Define a lista de vogais.
        int contador = 0; 
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i); // Obtém o caractere na posição 'i'.
            if (vogais.contains(String.valueOf(letra))) {
                contador++; // Se a letra for uma vogal, incrementa o contador.
            }
        }
        return contador; 
    }
}

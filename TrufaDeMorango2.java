    package VetoresModulos;
    public class TrufaDeMorango2 {
    public static void main(String[] args) {
        int[] array = {2, 3, 6, 8, 10, 11};
        int somaPares = 0;  // Inicializa a variável para armazenar a soma dos números pares

        for (int num : array) {
            // Verifica se o número é par (resto da divisão por 2 é 0)
            if (num % 2 == 0) {
                // Se for par, adiciona o número à soma
                somaPares += num;
            }
        }

        // Vai Imprimir o array fornecido
        System.out.print("Array fornecido: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Vai Imprimir a soma dos números pares
        System.out.println("Soma dos números pares: " + somaPares);
    }
}

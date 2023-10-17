        package VetoresModulos;
        public class TrufaDeMorango8 {
        public static void main(String[] args) {
            int[] listaOriginal = {5, 2, 8, 1, 9, 3};
            ordenaLista(listaOriginal); // Chama a função para ordenar a lista.
            System.out.print("Lista original: ");
            for (int num : listaOriginal) {
                System.out.print(num + " "); // Exibe a lista ordenada.
            }
            System.out.println();
        }
    
        // Função para ordenar a lista de inteiros usando o algoritmo Bubble Sort.
        public static void ordenaLista(int[] lista) {
            int n = lista.length; // Obtém o tamanho da lista.
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (lista[j] > lista[j + 1]) {
                        int temp = lista[j];
                        lista[j] = lista[j + 1]; // Troca os elementos se estiverem fora de ordem.
                        lista[j + 1] = temp;
                    }
                }
            }
        }
    }
    
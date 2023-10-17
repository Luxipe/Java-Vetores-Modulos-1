   package VetoresModulos;

   import java.util.ArrayList;
   import java.util.HashSet;
   import java.util.List;

   public class TrufaDeMorango6 {
   public static void main(String[] args) {
        // Cria uma lista de números inteiros.
        List<Integer> listaOriginal = new ArrayList<>();
        listaOriginal.add(1);
        listaOriginal.add(2);
        listaOriginal.add(3);
        listaOriginal.add(2);
        listaOriginal.add(1);
        listaOriginal.add(4);
        listaOriginal.add(5);
        listaOriginal.add(3);

        // Chama a função removeRepetidos para remover elementos duplicados da lista.
        List<Integer> listaSemRepeticao = removeRepetidos(listaOriginal);

        // Imprime a lista original e a lista sem elementos repetidos.
        System.out.println("Lista original: " + listaOriginal);
        System.out.println("Lista sem elementos repetidos: " + listaSemRepeticao);
    }

    // Função para remover elementos duplicados de uma lista.
    public static List<Integer> removeRepetidos(List<Integer> lista) {
        
        return new ArrayList<>(new HashSet<>(lista));
    }
}

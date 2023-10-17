        package VetoresModulos;

        import java.util.Scanner;

        public class TrufaDeMorango10 {
        public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite as notas separadas por espaços: ");
            String notasStr = scanner.nextLine();

            // Dividir as notas em uma matriz de strings
            String[] notasArray = notasStr.split(" ");
            double[] notas = new double[notasArray.length];

            // Converter as strings em números de ponto flutuante e armazená-los em um array
            for (int i = 0; i < notasArray.length; i++) {
                notas[i] = Double.parseDouble(notasArray[i]);
            }

            // Calcular a média das notas
            double media = calcularMedia(notas);
            System.out.println("Média das notas: " + media);
        }   catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

            public static double calcularMedia(double[] notas) {
            if (notas.length == 0) {
            return 0.0;
        }

            // Calcular a soma das notas
            double soma = 0;
            for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

           return soma / notas.length;
    }
}

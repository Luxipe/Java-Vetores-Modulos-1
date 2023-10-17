    package VetoresModulos;
    import java.util.Arrays;

    public class TrufaDeMorango3 {
    public static void main(String[] args) {
        int[] array = {4, 7, 2, 1};
        trocaPosicoes(array, 1, 2);

        System.out.println("Array após troca: " + Arrays.toString(array));
    }

    public static void trocaPosicoes(int[] array, int pos1, int pos2) {
        int temp = array[1]; //7
        array[1] = array[2]; //2
        array[2] = temp; // 7
    }
}

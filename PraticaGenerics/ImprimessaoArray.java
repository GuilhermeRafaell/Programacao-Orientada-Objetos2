public class impressaoArray {
    public static void imprimeArray(Integer[] inputArray) {
        for (Integer element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void imprimeArray(Double[] inputArray) {
        for (Double element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void imprimeArray(Character[] inputArray) {
        for (Character element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    // Forma utilizando generics, reutiliza codigo e simplifica
    public static <T> void imprimeArrayGenerico(T[] inputArray) {
        for (T element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    // Implementando um método para calcular o maior valor dentre 3 números do mesmo
    // tipo (Integer ou Float ou Double)
    public static <T> T maiorValor(T a, T b, T c) {
        T maior = a;

        if (b.compareTo(maior) > 0) {
            maior = b;
        }

        if (c.compareTo(maior) > 0) {
            maior = c;
        }

        return maior;
    }

}
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5, 6 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array integerArray contains:");
        imprimeArrayGenerico(intArray);

        System.out.println("Array doubleArray contains:");
        imprimeArrayGenerico(doubleArray);

        System.out.println("Array characterArray contains:");
        imprimeArrayGenerico(charArray);

        System.out.printf("Maior valor entre 3: %d", maiorValor(3, 4.0, 5.0f));
    }
}

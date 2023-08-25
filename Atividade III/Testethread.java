public class Testethread {
    // Implementando um programa que imprima os números primos existentes entre 0 e
    // 9999 e calcula o tempo de execução.
    // Para cada faixa de 100 números, cria uma thread e dispara o processo para
    // cada uma delas.
    // Ao final, imprime o tempo total de execução.
    public static void main(String[] args) {
        long tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100; i++) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }
                    }
                }
            });
            thread.start();
        }
        long tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + " ms");
    }
}

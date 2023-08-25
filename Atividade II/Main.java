package TestesPOO2;

public class Main {
    public static void main(String args[]) {
        // 1.Instanciar 1 conta corrente (CC) com R$ 1000,00
        ContaCorrente cc = new ContaCorrente(123, 123, "Joao", 1000);

        // 2.Instanciar 1 conta poupança (CP) com R$ 500,00
        ContaPoupanca cp = new ContaPoupanca(456, 456, "Maria", 500);

        // 3.Depositar R$ 390,00 na CC
        cc.depositar(390);

        // 4.Imprimir saldo da CC
        cc.imprimirSaldo();

        // 5.Depositar R$ 900,00 na CP
        cp.depositar(900);

        // 6.Imprimir saldo da CP
        cp.imprimirSaldo();

        // 7.Sacar R$ 40,00 da CC
        cc.sacar(40, 123);

        // 8.Imprimir saldo da CC
        cc.imprimirSaldo();

        // 9.Sacar R$ 50,00 da CP
        cp.sacar(50, 456);

        // 10.Imprimir saldo da CP
        cp.imprimirSaldo();
    }
}

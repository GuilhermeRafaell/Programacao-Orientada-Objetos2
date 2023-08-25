public class Main {
    
    public static void main(String[] args) {
        // TODO code application logic here
        // conta 1
        Conta conta1 = new Conta();
        conta1.setSaldo(1000.0);
        conta1.setValor(100.0);
        conta1.mudancaEstado(new EstadoOuro(conta1.getSaldo()));
        conta1.getEstado().depositar(conta1.getValor());
        conta1.getEstado().sacar(conta1.getValor());

        // conta 2
        Conta conta2 = new Conta();
        conta2.setSaldo(500.0);
        conta2.setValor(100.0);
        conta2.mudancaEstado(new EstadoPrata(conta2.getSaldo()));
        conta2.getEstado().depositar(conta2.getValor());
        conta2.getEstado().sacar(conta2.getValor());

        // conta 3
        Conta conta3 = new Conta();
        conta3.setSaldo(100.0);
        conta3.setValor(100.0);
        conta3.mudancaEstado(new EstadoPrata(conta3.getSaldo()));
        conta3.getEstado().depositar(conta3.getValor());

    }

    
}

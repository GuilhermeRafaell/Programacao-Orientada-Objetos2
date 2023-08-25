public class EstadoPrata extends Estado{
    
    public EstadoPrata(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Conta valor){
        saldo += valor;
        System.out.println("Deposito realizado com sucesso");
        System.out.println("Saldo atual: " + saldo);
        estabelecerEstado();
    }

    public void sacar(Conta valor){
        if(valor > saldo){
            System.out.println("Saldo insuficiente");
        }else{
            valor += 1.0; //taxa de R$ 1 por cada saque que realizar
            saldo -= valor;
            System.out.println("Saque realizado com sucesso");
            System.out.println("Saldo atual: " + saldo);
            estabelecerEstado();
        }
    }
    
    public void estabelecerEstado(Estado estado){
        if(saldo >= 0.0 && saldo <= 1000.0){
            this.estado  = EstadoPrata(saldo);
        }
    }

}

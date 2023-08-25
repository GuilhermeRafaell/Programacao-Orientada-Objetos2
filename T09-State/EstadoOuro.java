public class EstadoOuro extends Estado{
    //implementacao associacao com o estado

    public EstadoOuro(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Conta valor){
        valor *= 1.001; //rendimento de 0.1% em cada deposito que realizar
        saldo += valor;
        System.out.println("Deposito realizado com sucesso");
        System.out.println("Saldo atual: " + saldo);
        estabelecerEstado();
    }

    public void sacar(Conta valor){
        if(valor > saldo){
            System.out.println("Saldo insuficiente");
        }else{
            saldo -= valor;
            System.out.println("Saque realizado com sucesso");
            System.out.println("Saldo atual: " + saldo);
            estabelecerEstado();
        }
    }
    
    public void estabelecerEstado(Estado estado){
        if(saldo >= 1000.0){
            this.estado  = EstadoOuro(saldo);
        }
    }



    public String toString(){
        return ("("+ this.estado +")");
    }
}
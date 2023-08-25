public class EstadoVermelho extends Estado {
    
    public EstadoVermelho(Double saldo) {
        this.saldo = saldo;
    }
    public void depositar(Conta valor){
        saldo += valor;
        System.out.println("Deposito realizado com sucesso");
        System.out.println("Saldo atual: " + saldo);
        estabelecerEstado();
    }
    //Se  a  conta  estiver  com  saldo  negativo  =  estado vermelho. 
    //Neste  caso,  não  é  permitido  a  realização  de  saques.  Apenas depósitos
    public void sacar(Conta valor){
        System.out.println("Não é permitido realizar saques com saldo negativo");
    }

    public void estabelecerEstado(Estado estado){
        if(saldo <= 0.0){
            this.estado  = EstadoVermelho(saldo);
        }
    }
}

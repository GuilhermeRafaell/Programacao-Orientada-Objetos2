public abstract class  Estado {
    private Double saldo;
    private Estado estado;
    
    public abstract void estabelecerEstado(Estado estado){
        this.estado = estado;
    }
    public abstract String toString();
    public abstract void sacar(Conta valor);
    public abstract void depositar(Conta valor);
    public abstract void taxa(Conta valor);
}

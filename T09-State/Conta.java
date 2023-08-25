public class Conta {
    private Estado estado;
    private double saldo;
    public double valor;

    public void mudancaEstado(Estado estado){
        this.estado = estado;
    }

    public Estado getEstado(){
        return estado;
    }
    
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
}

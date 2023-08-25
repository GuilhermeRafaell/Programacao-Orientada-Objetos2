
public class ContaPoupanca extends ContaBancaria{
    private double taxarendimento;
    
    public ContaPoupanca(int numero ,int senha ,String nometitular ,double taxarendimento){
        super(numero,senha,nometitular);
        this.taxarendimento = taxarendimento;
    }
    
    public double getTaxarendimento(){
        return taxarendimento;
    }
    
    public void setTaxarendimento(double valor){
        this.taxarendimento = valor;
    }
    
    
}

package TestesPOO2;

public class ContaPoupanca extends ContaBancaria {
    private double taxarendimento;

    public ContaPoupanca(int numero, int senha, String nome, double taxarendimento) {
        super(numero, senha, nome);
        this.taxarendimento = taxarendimento;
    }

    public double getTaxarendimento() {
        return taxarendimento;
    }

    public void setTaxarendimento(double valor) {
        this.taxarendimento = valor;
    }

}

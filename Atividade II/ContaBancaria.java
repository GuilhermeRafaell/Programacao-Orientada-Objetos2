package TestesPOO2;

public class ContaBancaria {
    public int numero;
    private int senha;
    protected double saldo;
    public String nome;
    public Cliente titular;

    // Inteface Tributavel
    public interface Tributavel {
        public double getValorImposto();
    }

    // Classe Cliente
    public class Cliente {
        public String nome;
        public String cpf;
        public String endereco;
        public String telefone;
    }

    // ClientePF (herda da classe Cliente)
    public class ClientePF extends Cliente {
        public String rg;
        public String datanascimento;
    }

    // ClientePJ (herda da classe Cliente)
    public class ClientePJ extends Cliente {
        public String cnpj;
        public String inscricaoestadual;
    }

    public ContaBancaria(int numero, int senha, String nome) {
        this.numero = numero;
        this.senha = senha;
        this.nome = nome;
        this.setSaldo(0.0);
    }

    public double getValorImposto() {
        return this.saldo * 0.01;
    }

    public void setValorImposto(double valor) {
        this.saldo = valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSenha() {
        return this.senha;
    }

    public void setSenha(int password) {
        this.senha = password;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean sacar(double valor, int senha) {
        if (this.getSaldo() <= 0 || senha != this.getSenha())
            return false;
        else {
            saldo -= valor;
            this.setSaldo(saldo);
            return true;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        this.setSaldo(saldo);
    }

    // método imprimirSaldo() estático
    public void imprimirSaldo() {
        System.out.println("Saldo: " + this.getSaldo());
    }

}
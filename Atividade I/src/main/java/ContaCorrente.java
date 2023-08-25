public class ContaCorrente extends ContaBancaria{
	public double limiteespecial;
	
	public ContaCorrente(int numero, int senha, String nomeTitular, double limiteespecial){
            super(numero, senha, nomeTitular);
            this.limiteespecial = limiteespecial;
	}
	
	public double getLimiteEspecil(){
		return limiteespecial;
	}
	
	public void setLimiteEspecial(double valor){
		this.limiteespecial = valor;
	}
	
	public boolean sacar(double valor, int senha){
		if(this.getSaldo() <= 0 || senha != this.getSenha())
			return false;
		else{
			saldo -= valor;
			this.setSaldo(saldo);
			return true;
		}
	}
        
        public void imprimirSaldo(){
            super.imprimirSaldo();
        }
}
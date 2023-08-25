public class ContaBancaria{
		public int numero;
		private int senha;
		protected double saldo;
		public String nometitular;
		//public Cliente titular; Pratica 2
	
		public ContaBancaria(int numero, int senha, String nometitular){
			this.numero = numero;
			this.senha = senha;
			this.nometitular = nometitular;
			this.setSaldo(0.0);
		}
		
		
		public int getNumero(){
			return numero;
		}
		
		public void setNumero(int numero){
			this.numero = numero;
		}
		
		public int getSenha(){
			return this.senha;
		}
		
		public void setSenha(int password){
			this.senha = password;
		}
		
		public double getSaldo(){
			return saldo;
		}	
		
		public void setSaldo(double saldo){
			this.saldo = saldo;
		}
		
		public String getNometitular(){
			return nometitular;
		}
		
		public void setNometitular(String nometitular){
			this.nometitular = nometitular;
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
		
		public void depositar(double valor){
			saldo += valor;
			this.setSaldo(saldo);
		}
		
		
		
		public void imprimirSaldo(){
			System.out.printf("Saldo disponivel %d",this.getSaldo());
		}
		
	
}
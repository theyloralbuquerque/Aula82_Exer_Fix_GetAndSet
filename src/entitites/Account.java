package entitites;

public class Account {
	
	private int num;
	private String nome;
	private double saldo;
	
	
	public Account(int num, String nome) { // Construtor com 2 argumentos, caso o cliente não queira fazer seu primeiro depósito.
		this.num = num;
		this.nome = nome;
	}


	public Account(int num, String nome, double depositoInicial) { // Construtor com 3 argumentos, caso o cliente queira fazer seu primeiro depósito.
		this.num = num;
		this.nome = nome;
		deposit(depositoInicial); // deposit vai chamar o método de deposit passando como parâmetro (depositoInicial), para assim modificar o saldo da conta de forma segura.
	}
	
	
	public int getNum() {
		return num;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	public void deposit(double valorDoDep) {   // Método que faz o depósito na conta. (É void por que não retorna nada, apenas altera "saldo")
		this.saldo += valorDoDep;
	}
	
	public void saque(double valorDoSaq) {   // Método que faz o saque na conta. (É void por que não retorna nada, apenas altera "saldo")
		this.saldo -= (valorDoSaq + 5.0);
	}

	
	public String toString() {   // toString
		return "Conta: " + num + ", Titular: " + nome + ", Saldo: " + String.format("%.2f", saldo) + ".";
		
	}
	
	
	
}

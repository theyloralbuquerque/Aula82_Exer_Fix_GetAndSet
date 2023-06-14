package application;

import java.util.Locale;

import java.util.Scanner;

import entitites.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account conta;   // Declaração da variável "conta" do tipo "Account", para que eu possa usar a variável em toda classe.
		
		System.out.print("Digite o número da conta: ");
		int num = sc.nextInt();
		
		System.out.print("Digite o nome do titular: ");
		sc.nextLine();   // Para consumir a quebra de linha anterior pendente.
		String nome = sc.nextLine();
		
		System.out.println();
		System.out.print("Deseja fazer seu primeiro depósito? [S/N] ");
		char resp = sc.next().charAt(0);
		
		if (resp == 'S') {    // Caractere é só com uma aspas e não aspas duplas.
			System.out.print("Digite o valor do depósito: ");
			double depositoInicial = sc.nextDouble();
			conta =  new Account(num, nome, depositoInicial);   // Instanciação da classe conta, passando 3 argumentos como parâmetro.
			
		} else {
			conta = new Account(num, nome);
		}
		
		System.out.println(conta);    // Imprime o toString.
		
		System.out.println();
		System.out.print("Digite o valor que deseja depositar na conta: ");
		double valorDoDep = sc.nextDouble();
		conta.deposit(valorDoDep);   // Chamada do método de depósito.
		
		System.out.println(conta);   // Imprime o toString.
		
		System.out.println();
		System.out.print("Digite o valor que deseja sacar: ");
		double valorDoSaq = sc.nextDouble();
		conta.saque(valorDoSaq);   // Chamada do método de saque.
		
		System.out.println(conta);    // Imprime o toString.
		 
	
		sc.close();
		
		
	}

}

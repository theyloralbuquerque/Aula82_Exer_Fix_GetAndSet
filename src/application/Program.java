package application;

import java.util.Locale;

import java.util.Scanner;

import entitites.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account conta;   // Declara��o da vari�vel "conta" do tipo "Account", para que eu possa usar a vari�vel em toda classe.
		
		System.out.print("Digite o n�mero da conta: ");
		int num = sc.nextInt();
		
		System.out.print("Digite o nome do titular: ");
		sc.nextLine();   // Para consumir a quebra de linha anterior pendente.
		String nome = sc.nextLine();
		
		System.out.println();
		System.out.print("Deseja fazer seu primeiro dep�sito? [S/N] ");
		char resp = sc.next().charAt(0);
		
		if (resp == 'S') {    // Caractere � s� com uma aspas e n�o aspas duplas.
			System.out.print("Digite o valor do dep�sito: ");
			double depositoInicial = sc.nextDouble();
			conta =  new Account(num, nome, depositoInicial);   // Instancia��o da classe conta, passando 3 argumentos como par�metro.
			
		} else {
			conta = new Account(num, nome);
		}
		
		System.out.println(conta);    // Imprime o toString.
		
		System.out.println();
		System.out.print("Digite o valor que deseja depositar na conta: ");
		double valorDoDep = sc.nextDouble();
		conta.deposit(valorDoDep);   // Chamada do m�todo de dep�sito.
		
		System.out.println(conta);   // Imprime o toString.
		
		System.out.println();
		System.out.print("Digite o valor que deseja sacar: ");
		double valorDoSaq = sc.nextDouble();
		conta.saque(valorDoSaq);   // Chamada do m�todo de saque.
		
		System.out.println(conta);    // Imprime o toString.
		 
	
		sc.close();
		
		
	}

}

package mz.co.pensao.principal;

import java.util.Scanner;

import mz.co.pensao.entidade.Pensao;

public class ExecutaPensao {

	public static void main(String[] args) {
		
		Scanner entradaPorTeclado = new Scanner (System.in);
		
		
		Pensao[]quarto = new Pensao[10];
		
		int ocupacao;
		System.out.println("Quantos quartos tem a sua pensao?");
		ocupacao = entradaPorTeclado.nextInt();
		
		
		for (int i = 0; i < ocupacao; i++) {
			System.out.println(" Digite o numero do quarto ");
			 int numeroDoQuartoOcupado = entradaPorTeclado.nextInt();
			 
			 entradaPorTeclado.nextLine();
			 
			 System.out.println(" Digite o nome do estudade {" + (i+1)+ "} ");
			 String nome = entradaPorTeclado.nextLine();
			 
			 System.out.println(" Digite o numero de celular ");
			 int celular = entradaPorTeclado.nextInt();
			 
			 entradaPorTeclado.nextLine();
			 
			  System.out.println(" Digite o email ");
			  String email = entradaPorTeclado.nextLine();
			 
			 quarto[i] = new Pensao(nome, numeroDoQuartoOcupado, celular, email);
			
		}
		//int ocupacao = 2;
		for (int i = 0; i < ocupacao; i++) {
	     System.out.println(quarto[i]);
	}
	}

}

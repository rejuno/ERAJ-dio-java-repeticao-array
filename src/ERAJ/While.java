package ERAJ;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EXERCICIO NOME E IDADE
		Scanner r = new Scanner(System.in);
		
		while(true) {
		System.out.println("Insira um Nome: ");
		String name = r.next();
		
		if(name.equals("0")) {
			break;
		}
		
		System.out.println("Insira uma Idade: ");
		int age = r.nextInt();
		
		}
		
		System.out.println("O programa parou...");
	
		
		//EXERCICIO NOTAS
		double nota;
			System.out.println("Digite uma nota entre 0 e 10: ");
			nota = r.nextDouble();
			
			while(nota < 0 || nota > 10) {
				System.out.println("Nota Inválida! Digite Novamente: ");
				nota = r.nextDouble();
			}
			}
		
		
	
	}

		


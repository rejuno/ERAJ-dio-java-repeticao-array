package ERAJ;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner r = new Scanner(System.in); 
		
		//MAIOR E MEDIA
		int num;
		int i = 0;
		int maior = 0;
		int soma=0;
		
		do {
			System.out.println("Digite um n�mero: ");
			num = r.nextInt();
			i++;
			
			soma = soma + num;
			
			if(num > maior) {
				maior = num;
				
			}
		
		} while(i < 5);
		
		System.out.println("O Maior n�mero �: "+ maior);
		System.out.println("A m�dia �: "+ (soma/5));
	
	
	//PAR E IMPAR
		//Outra resolucao neste link: https://github.com/cami-la/loops-e-arrays/blob/master/src/br/com/dio/exercicios/loops/Ex4_ParEImpar.java
		int count=0;
		int numero;
		 {
		System.out.println("Digite um n�mero: ");
		numero = r.nextInt();
			
		
		
		if(numero%2==0) {
			System.out.println("O n�mero � Par");
		}else {
			System.out.println("O n�mero � Impar");
		}
		count++;
	
	}while(count<5);
	
	
	
	
	
}
	}

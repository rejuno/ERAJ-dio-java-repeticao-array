package ERAJ;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TABUADA
		Scanner r= new Scanner(System.in);
		/*
		System.out.println("Digite um número que queira saber a tabuada: ");
		int number = r.nextInt();
		for(int conta = 0; conta < 11; conta++) {
			System.out.println(number+" * "+ conta +" = " + (number*conta));
		}
		*/
		//FATORIAL
		
		System.out.println("Digite o número que queira saber o fatorial: ");
		int num=r.nextInt();
		
		int multi = 1;
		
		for(int i=num; i>=1;i--) {
			multi = multi * i;
			
		}
		
		System.out.println(num+ "! = " + multi);
	}
		
}



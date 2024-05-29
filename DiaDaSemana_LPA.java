package Somativa_LPA;

import java.util.Scanner;

public class DiaDaSemana_LPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner ler = new Scanner (System.in);
			
			int numero;
			
			System.out.print("informe o numero que deseja, para descobrir o dia da semana:  ");
			numero = ler.nextInt();
			
			
			if (numero == 1) {
			System.out.println (" o dia da semana é Domingo ");
			}
			
			else if (numero == 2) {
				System.out.println("O dia da semana é Segunda");
			}
				
			else if (numero == 3) {
					System.out.println("O dia da semana é Terça");
			}
			
			else if (numero == 4) {
				System.out.println("O dia da semana é Quarta");
			}
			
			else if (numero == 5) {
				System.out.println("O dia da semana é Quinta");
			}
			
			else if (numero == 6) {
					System.out.println("O dia da semana é Sexta");
			}
			
			else if (numero == 7) {
				System.out.println("O dia da semana é Sabado");
			}
			
			else {
				System.out.println (" Esse dia é invalido");
			}
			ler.close();	
			



	}

}

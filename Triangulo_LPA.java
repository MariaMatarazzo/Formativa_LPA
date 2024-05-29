package Somativa_LPA;

import java.util.Scanner;

public class Triangulo_LPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double b,h,area;
		Scanner ler = new Scanner (System.in);

		System.out.print (">>> informe o tamanho da base do triangulo: ");
		b = ler.nextInt();

		System.out.print (">>>informe o tamanho da altura do tringulo: ");
		h = ler.nextInt();
		
		
		area= (b*h)/2;
		
		
		System.out.println("  ");
		System.out.print (" A area do triangulo é de: "+ area);
		
		


	}

}

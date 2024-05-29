package Somativa_LPA;

import java.util.Scanner;

public class Fluxograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a,b,soma,sub,mult,div;
		Scanner ler = new Scanner (System.in);

        System.out.print (">>> informe um numero: ");
		a = ler.nextInt();
		
		System.out.print (">>>informe um numero: ");
		b = ler.nextInt();
		
		
		soma= a + b;
		sub= a-b;
		mult= a*b;
		div=a/b;
		
		
		System.out.println ("  ");
		System.out.println ("O resultado da soma é:  "+ soma);
		System.out.println ("O resultado da subtração é:  "+ sub);
		System.out.println ("O resultado da multiplicação é:  "+ mult);
		System.out.println ("O resultado da divisão é:  "+ div);
		
		

	}

}

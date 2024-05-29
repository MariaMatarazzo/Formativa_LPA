package Somativa_LPA;

import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		
		Scanner ler = new Scanner(System.in);
		
		int a[] = new int [15];
		double soma = 0;


		for(int i=0; i <= 14; i++) {
			System.out.print("informe um valor: " );
			a [i]= ler.nextInt ();
			soma= soma+a[i];
		}

			System.out.println("As somas das notas são:  " + soma);
		}



	}



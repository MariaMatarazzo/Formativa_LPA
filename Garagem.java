package Somativa_LPA;

import java.util.Scanner;

public class Garagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a[] = new String [5];

		Scanner ler = new Scanner(System.in);

		for (int i =0; i<5; i++) {
			System.out.println("informe o nome do carro: " );
			a [i]= ler.next ();
		

			System.out.print("|" + a[i]+ "|");
			System.out.print(" ");
		}



	}
}



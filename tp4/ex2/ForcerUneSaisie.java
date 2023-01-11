/*
* Ce programme force une saisie précise.
*/

import java.util.Scanner;

public class ForcerUneSaisie{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in).useDelimiter("\n");

		// Question a
		System.out.print("Insérez un entier pair compris entre 0 et 100 inclus : ");
		int a = scanner.nextInt();

		while ((a % 2 != 0) || (a < 0) || (a > 100)){
			System.out.println("Erreur veuillez insérez une valeur correcte : ");
			a = scanner.nextInt();
		}

		// Question b
		System.out.print("Insérez un entier non nul, positif pair ou négatif impair : ");
		int b = scanner.nextInt();

		while ((b > 0 && b % 2 == 1) || (b < 0 && b % 2 == 0)){
			System.out.println("Erreur veuillez insérez une valeur correcte : ");
			b = scanner.nextInt();
		}
		// Valeurs à tester : 0 : Faux, 4 : Vrai, 5 : Faux, -4 : Faux, -5 : Vrai

		// Question c
		System.out.println("Insérez trois entiers supérieurs ou égaux à 0 avec c1 < c2 < c3");
		
		System.out.print("c1 : ");
		int c1 = scanner.nextInt();
		System.out.print("c2 : ");
		int c2 = scanner.nextInt();
		System.out.print("c3 : ");
		int c3 = scanner.nextInt();

		while (c3 < c1 || c2 < c1 || c3 < c2){
			System.out.println("Erreur veuillez insérez une valeur correcte : ");

			System.out.print("c1 : ");
			c1 = scanner.nextInt();
			System.out.print("c2 : ");
			c2 = scanner.nextInt();
			System.out.print("c3 : ");
			c3 = scanner.nextInt();

		}

		// Question d
		System.out.println("Insérez trois entiers supérieurs ou égaux à 0 avec x1 < x2 < x3 ou x1 > x2 > x3");
		System.out.print("x1 : ");
		int x1 = scanner.nextInt();
		System.out.print("x2 : ");
		int x2 = scanner.nextInt();
		System.out.print("x3 : ");
		int x3 = scanner.nextInt();

		while ((x3 < x1 && x3 > x2) || (x2 > x1 && x2 > x3)){
			System.out.println("Erreur veuillez insérez une valeur correcte : ");

			System.out.print("x1 : ");
			x1 = scanner.nextInt();
			System.out.print("x2 : ");
			x2 = scanner.nextInt();
			System.out.print("x3 : ");
			x3 = scanner.nextInt();
		}
		scanner.close();
	}
}
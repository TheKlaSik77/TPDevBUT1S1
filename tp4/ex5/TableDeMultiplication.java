/*
* Ce programme saisit un nombre entre 0 et 9 et renvoie sa table de multiplication
*/

import java.util.Scanner;

public class TableDeMultiplication{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in).useDelimiter("\n");

		System.out.print("Saisisez un entier entre 0 et 9 : ");
		int valeur = scanner.nextInt();

		while (valeur < 0 || valeur > 10){
			System.out.print("Erreur! Saisisez un entier entre 0 et 9 : ");
			valeur = scanner.nextInt();
		}

		int i;
		int mult = 0;

		for (i = 0 ; i <= 10 ; i++){
			mult = valeur * i;
			System.out.println(i + " fois " + valeur + " = " + mult);
		}
	}
}
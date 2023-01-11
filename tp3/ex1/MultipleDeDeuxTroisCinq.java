/*
 * Saisit un entier, dit si il est pair ou impair, puis indique si il est multiple de 3 et/ou de 5.
*/

import java.util.Scanner;

public class MultipleDeDeuxTroisCinq{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in).useDelimiter("\n");

		System.out.print("Saisissez un nombre entier : ");
		int nombre = scanner.nextInt();

		if (nombre % 2 == 0){
			System.out.println(nombre + " est pair.");
		} else {
			System.out.println(nombre + " est impair.");
		}
		if (nombre % 3 == 0){
			System.out.println(nombre + " est un multiple de 3.");
		} else {
			System.out.println(nombre + " n'est pas un multiple de 3");
		}
		if (nombre % 5 == 0){
			System.out.println(nombre + " est un multiple de 5.");
		} else {
			System.out.println(nombre + " n'est pas un multiple de 5");
		}
	}
}
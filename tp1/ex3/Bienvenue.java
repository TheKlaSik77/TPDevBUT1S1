/*
Ce programme demande à l'utilisateur son nom et son age,
l'accueille poliment,
puis affiche si il est majeur ou mineur.
 */

import java.util.Scanner;

public class Bienvenue {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useDelimiter("\n");
		
		String nom;
		int age;
		
		System.out.print("Votre nom : ");
		nom = scanner.nextLine();
		
		System.out.print("Votre âge : ");
		age = scanner.nextInt();
		
		System.out.println(); // affiche un ligne vide (cela permet de sauter une ligne)
		
		System.out.println("Bienvenue " + nom + " !");
		
		if (age < 18 && age >= 0){
			System.out.println("Vous êtes mineur.\n");
		} 
		else if (age >= 18) {
			System.out.println("Vous êtes majeur.");
			if (age == 18){
				System.out.println("Et félicitations vous avez 18 ans!\n");
			}
		} 
		else {
			System.out.println("Vous n'êtes pas encore né!\n");
		}
		
		scanner.close();
	}

}
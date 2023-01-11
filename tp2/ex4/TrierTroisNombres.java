import java.util.Scanner;

public class TrierTroisNombres{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserez le nombre A : ");
		double a = scanner.nextDouble();
		System.out.println("Inserez le nombre B : ");
		double b = scanner.nextDouble();
		System.out.println("Inserez le nombre C : ");
		double c = scanner.nextDouble();

		if (a <= b && b <= c){
			System.out.println("L'ordre croissant de ces nombres est A -> B -> C ! (" + a + ", " + b + ", " + c + ").");
		} else if (b <= a && a <= c){
			System.out.println("L'ordre croissant de ces nombres est B -> A -> C ! (" + b + ", " + a + ", " + c + ").");
		} else if (c <= b && b <= a){
			System.out.println("L'ordre croissant de ces nombres est C -> B -> A ! (" + c + ", " + b + ", " + a + ").");
		} else if (b <= c && c <= a){
			System.out.println("L'ordre croissant de ces nombres est B -> C -> A ! (" + b + ", " + c + ", " + a + ").");
		} else if (a <= c && c <= b){
			System.out.println("L'ordre croissant de ces nombres est A -> C -> B ! (" + a + ", " + c + ", " + b + ").");
		} else if (c <= a && c <= b){
			System.out.println("L'ordre croissant de ces nombres est C -> A -> B ! (" + c + ", " + a + ", " + b + ").");
		}


	}

}
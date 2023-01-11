import java.util.Scanner;

public class LePlusGrand{

	public static void main(String[] args){

		System.out.println("Ce programme vous demandera 3 nombre (a,b,c) et vous retournera le plus grand.");
		System.out.println();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Insérez la valeur A : ");
		double a = scanner.nextDouble();
		System.out.println("Insérez la valeur B : ");
		double b = scanner.nextDouble();
		System.out.println("Insérez la valeur C : ");
		double c = scanner.nextDouble();
		
		
		

		if (a > b && a > c){
			System.out.println("A est le plus grand! (" + a + ").");
		} else if (b > a && b > c){
			System.out.println("B est le plus grand! (" + b + ").");
		} else if (c > b && c > a){
			System.out.println("C est le plus grand! (" + c + ").");
		}

	}
}
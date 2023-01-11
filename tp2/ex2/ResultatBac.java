
import java.util.Scanner;

public class ResultatBac{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Insérez votre moyenne générale:");
		double moyenne = scanner.nextDouble();

		if (moyenne >= 0 && moyenne <= 20){

			if (moyenne < 8){
				System.out.println("Refusé");
			}
			else if (moyenne >= 8 && moyenne < 10){
				System.out.println("Doit passer l'oral de rattrapage.");

				System.out.println("Insérez votre moyenne générale de rattrapage:");
				double notePostRattrapage = scanner.nextDouble();

				while(notePostRattrapage < 0 || notePostRattrapage > 20){

					System.out.println("Valeur Incorrecte! Insérez votre moyenne générale de rattrapage:");
					notePostRattrapage = scanner.nextDouble();
	
				}

				if (notePostRattrapage < 10 && notePostRattrapage >= 0){
						System.out.println("Refusé");
				} else if (notePostRattrapage >= 10 && notePostRattrapage <= 20){
					System.out.println("admis mention passable.");
				} 
				
			}
			else if (moyenne >=10 && moyenne < 12){
				System.out.println("Admis mention passable.");
			}
			else if (moyenne >= 12 && moyenne < 14){
				System.out.println("Admis mention assez bien.");
			}
			else if (moyenne >=14 && moyenne < 16){
				System.out.println("Admis mention bien.");
			}
			else{
				System.out.println("Admis mention très bien.");
			}


		}
		else {

			System.out.println("Moyenne incorrecte: ce n'est pas une moyenne entre 0 et 20.");
		}



	}
}
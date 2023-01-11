public class Main {
    public static void main(String[] args) {

        int taille = 10;
        int[][] escargot = new int[taille][taille];

        FonctionsEscargot.afficherEscargot(escargot);
        System.out.println("--------------------------------------------------");
        FonctionsEscargot.remplirEscargot(escargot);

        FonctionsEscargot.afficherEscargot(escargot);



    }
}
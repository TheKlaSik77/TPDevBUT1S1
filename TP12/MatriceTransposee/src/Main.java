public class Main {
    public static void main(String[] args) {

        int[][] matrice3 = { {1,2,3}, {4,5,6}, {7,8,9} };

        Matrices.afficherMatrice(matrice3);
        System.out.println("------------------------------------");
        Matrices.afficherMatrice(Matrices.transposerMatrice(matrice3));
    }
}
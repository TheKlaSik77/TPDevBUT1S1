public class Main {

    public static void main(String[] args) {

        // déclaration, création et initialisation d'un tableau à deux dimensions qui représente une matrice de hauteur 3 (3 lignes) et de largeur 4 (4 colonnes)
        /*
        int[][] mat = { {1,2,3,4} , {5,6,7,8} , {9,10,11,12} };

        MethodesTabDoubles.afficherMatrice(mat);
        */
        /*
        int[][] mat2 = new int[4][4];
        MethodesTabDoubles.remplir(mat2,3);
        MethodesTabDoubles.afficherMatrice(mat2);
        */
        int[][] mat3 = new int[5][5];
        MethodesTabDoubles.remplirMatriceAvecDiagonale(mat3);
        MethodesTabDoubles.afficherMatrice(mat3);
    }
}

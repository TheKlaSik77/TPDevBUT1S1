import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatricesTest {

    @Test
    void transposerMatrice(){

        int[][] matriceVide = new int[0][0];
        int[][] matriceVideTransposee = new int[0][0];

        int[][] matrice3 = { {1,2,3}, {4,5,6}, {7,8,9} };
        int[][] matrice3Transposee = { {1,4,7}, {2,5,8}, {3,6,9} };

        assertArrayEquals(matriceVideTransposee, Matrices.transposerMatrice(matriceVide));
        assertArrayEquals(matrice3Transposee,Matrices.transposerMatrice(matrice3));
    }

}
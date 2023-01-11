
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class MethodesQuiModifientDesTableauxTest {

// RAZ	

    @Test
    public final void raz() {

        int[] tabLong0 = new int[0];
        MethodesQuiModifientDesTableaux.raz(tabLong0);
        assertArrayEquals(new int[0], tabLong0, "cas longueur zéro");

        int[] tabMoyen = {-6, 7, 444, -777, 0, 12};
        int[] tabMoyenResultat = {0, 0, 0, 0, 0, 0};
        MethodesQuiModifientDesTableaux.raz(tabMoyen);
        assertArrayEquals(tabMoyenResultat, tabMoyen, "cas longueur > 0");
    }


// VALEUR ABSOLUE

    @Test
    public final void valAbs() {

        int[] tabLong0 = new int[0];
        MethodesQuiModifientDesTableaux.valAbs(tabLong0);
        assertArrayEquals(new int[0], tabLong0, "cas longueur zéro");

        int[] tabMoyenNegatifsAuxBornes = {-6, 7, 444, -777, 0, -12};
        int[] tabMoyenResultatNegatifsAuxBornes = {6, 7, 444, 777, 0, 12};
        MethodesQuiModifientDesTableaux.valAbs(tabMoyenNegatifsAuxBornes);
        assertArrayEquals(tabMoyenResultatNegatifsAuxBornes, tabMoyenNegatifsAuxBornes, "cas longueur > 0, Negatifs aux bornes");

        int[] tabMoyenPositifsAuxBornes = {6, 7, -444, 777, 0, 12};
        int[] tabMoyenResultatPositifsAuxBornes = {6, 7, 444, 777, 0, 12};
        MethodesQuiModifientDesTableaux.valAbs(tabMoyenPositifsAuxBornes);
        assertArrayEquals(tabMoyenResultatPositifsAuxBornes, tabMoyenPositifsAuxBornes, "cas longueur > 0, Negatifs aux bornes");


    }

    // REMPLIR UN TABLEAU AVEC DES VALEURS ALEATOIRES
    @Test
    public final void remplirTableauAvecValeursAleatoires() {

        int[] t = new int[100];
        MethodesQuiModifientDesTableaux.remplirTableauAvecValeursAleatoires(t, 2, 4);

        verifierValeursEntre2et4(t);
    }



    @Test
    public final void creerEtremplirTableauAvecValeursAleatoires() {

        int[] t = MethodesQuiModifientDesTableaux.creerEtremplirTableauAvecValeursAleatoires(100, 2, 4);

        verifierValeursEntre2et4(t);
    }

    private void verifierValeursEntre2et4(int[] t) {
        // on vérifie que les valeurs 1, 2 et 3 sont bien présentes dans le tableau
        boolean trouve2 = false, trouve3 = false, trouve4 = false;
        for (int val : t) {
            if (val==2) trouve2 = true;
            if (val==3) trouve3 = true;
            if (val==4) trouve4 = true;
        }
        assertTrue(trouve2, "valMin pas présente");
        assertTrue(trouve3, "valeur moyenne pas présente");
        assertTrue(trouve4, "valMax pas présente");

        // on vérifie qu'il n'y a pas d'autre valeur que 1, 2 et 3
        for (int val : t)
            assertTrue((val >= 2 && val <= 4), "valeur hors bornes");
    }

}



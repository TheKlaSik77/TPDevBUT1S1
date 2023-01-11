import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FonctionsCarreTest {

    void sommeLignesEgales() {

        int[][] tab = { {1,2,3} , {3,2,1} , {2,1,3}};
        int[][] tab2 = { {1,4,3} , {3,2,1} , {2,1,3}};

        assertTrue(FonctionsCarre.sommeLignesEgales(tab));
        assertFalse(FonctionsCarre.sommeLignesEgales(tab2));
    }

    @Test
    void sommeColonnesEgales() {

        int[][] tab = { {1,2,3} , {3,3,2} , {2,1,1}};
        int[][] tab2 = { {3,4,34} , {3,2,1} , {2,1,3}};

        assertTrue(FonctionsCarre.sommeColonnesEgales(tab));
        assertFalse(FonctionsCarre.sommeColonnesEgales(tab2));
    }

    @Test
    void sommeDiagonalesEgales() {

        int[][] tab = { {1,2,3} , {3,2,2} , {1,1,3}};
        int[][] tab2 = { {3,4,34} , {3,2,1} , {2,1,3}};

        assertTrue(FonctionsCarre.sommeDiagonalesEgales(tab));
        assertFalse(FonctionsCarre.sommeDiagonalesEgales(tab2));
    }

    @Test
    void estUnCarreMagique(){

        int[][] tab = { {2,7,6} , {9,5,1} , {4,3,8}};
        int[][] tab2 = { {3,4,34} , {3,2,1} , {2,1,3}};

        assertTrue(FonctionsCarre.estUnCarreMagique(tab));
        assertFalse(FonctionsCarre.estUnCarreMagique(tab2));
    }
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestDiversesMethodesSurDesTableaux {

    @Test
    void testNbOccurrences1(){
        int[] tabLongueurZero = new int[0];
        assertEquals(0,DiversesMethodesSurDesTableaux.nbOccurrences(tabLongueurZero,1),"cas longueur 0");

        int[] tab3occ0 = {0,1,1,4,5,0,1,0};
        assertEquals(3,DiversesMethodesSurDesTableaux.nbOccurrences(tab3occ0,0), "cas 3 occurences dans tab classique");

        int[] tab0occ = {0,1,1,4,5,0,1,0};
        assertEquals(0,DiversesMethodesSurDesTableaux.nbOccurrences(tab0occ,18),"cas 0 occurence dans tab classique");
    }

    @Test

    void testNbStrictementNegatifs(){

        int[] tabLongueurZero = new int[0];
        assertEquals(0,DiversesMethodesSurDesTableaux.nbStrictementNegatifs(tabLongueurZero),"cas longueur 0");

        int[] tab3occ0 = {-6,1,1,-10,5,0,1,-2};
        assertEquals(3,DiversesMethodesSurDesTableaux.nbStrictementNegatifs(tab3occ0), "cas 3 occurences dans tab classique");

        int[] tab0occ = {0,1,1,4,5,0,1,0};
        assertEquals(0,DiversesMethodesSurDesTableaux.nbStrictementNegatifs(tab0occ),"cas 0 occurences dans tab classique");
    }

    @Test
    void testSommeValeurs (){

        int[] tabLongueurZero = new int[0];
        assertEquals(0,DiversesMethodesSurDesTableaux.nbStrictementNegatifs(tabLongueurZero),"cas longueur 0");

        int[] tab2 = {-6,1,1,-10,5,0,1,-2};
        assertEquals(-10,DiversesMethodesSurDesTableaux.sommeValeurs(tab2));

        int[] tab3 = {0,1,1,4,5,0,1,0};
        assertEquals(12,DiversesMethodesSurDesTableaux.sommeValeurs(tab3));
    }

    @Test
    void testEstPresent(){
        int[] tabLongueurZero = new int[0];
        assertFalse(DiversesMethodesSurDesTableaux.estPresent(tabLongueurZero,2),"Cas tableau vide");

        int[] tab2 = {-6,1,1,-10,5,0,1,-2};
        assertFalse(DiversesMethodesSurDesTableaux.estPresent(tab2,-22), "Cas non présent");

        int[] tab3 = {0,1,12,4,5,0,1,0};
        assertTrue(DiversesMethodesSurDesTableaux.estPresent(tab3,12));
    }

    @Test
    void testTousPositifs(){

        int[] tabLongueurZero = new int[0];
        assertTrue(DiversesMethodesSurDesTableaux.tousPositifs(tabLongueurZero),"Cas tableau vide");

        int[] tab2 = {-6,1,1,-10,5,0,1,-2};
        assertFalse(DiversesMethodesSurDesTableaux.tousPositifs(tab2), "Cas nombres négatifs");

        int[] tab3 = {0,1,12,4,5,0,1,0};
        assertTrue(DiversesMethodesSurDesTableaux.tousPositifs(tab3),"Cas tous positifs");

    }

    @Test
    void testIndicePremOccurrence(){

        int[] tabLongueurZero = new int[0];
        assertEquals(-1,DiversesMethodesSurDesTableaux.indicePremOccurrence(tabLongueurZero,0));

        int[] tab2 = {-6,1,1,-10,7,0,1,-2};
        assertEquals(-1,DiversesMethodesSurDesTableaux.indicePremOccurrence(tab2,5));

        int[] tab3 = {0,1,12,4,5,0,1,0};
        assertEquals(0,DiversesMethodesSurDesTableaux.indicePremOccurrence(tab3,0));

        int[] tab4 = {0,1,12,4,5,0,1,7};
        assertEquals(7,DiversesMethodesSurDesTableaux.indicePremOccurrence(tab4,7));

    }
    @Test
    void testIndiceDernOccurrence(){
        int[] tabLongueurZero = new int[0];
        assertEquals(-1,DiversesMethodesSurDesTableaux.indiceDernOccurrence(tabLongueurZero,0));

        int[] tab2 = {-6,1,1,-10,7,0,1,-2};
        assertEquals(-1,DiversesMethodesSurDesTableaux.indiceDernOccurrence(tab2,5));

        int[] tab3 = {0,1,12,4,5,0,1,0};
        assertEquals(7,DiversesMethodesSurDesTableaux.indiceDernOccurrence(tab3,0));

        int[] tab4 = {0,1,12,4,5,0,1,7};
        assertEquals(7,DiversesMethodesSurDesTableaux.indiceDernOccurrence(tab4,7));
    }

    @Test
    void testNbOccurrences(){
        int[] tabLongueurZero = new int[0];
        assertEquals(0,DiversesMethodesSurDesTableaux.nbOccurrences(tabLongueurZero,0,10));

        int[] tab2 = {-6,1,1,-10,7,0,1,-2};
        assertEquals(-1,DiversesMethodesSurDesTableaux.nbOccurrences(tab2,-7,-12));

        int[] tab3 = {0,1,12,4,5,0,1,0};
        assertEquals(7,DiversesMethodesSurDesTableaux.nbOccurrences(tab3,0,5));

        int[] tab4 = {0,1,12,4,5,0,1,7};
        assertEquals(-1,DiversesMethodesSurDesTableaux.nbOccurrences(tab4,10,5));
    }

    @Test
    void plusGrandPositif(){

        double[] tabLongueurZero = new double[0];
        assertEquals(-1,DiversesMethodesSurDesTableaux.plusGrandPositif(tabLongueurZero));

        double[] tab2 = {-6.7,1,1,-10,7,0,1,-2};
        assertEquals(7,DiversesMethodesSurDesTableaux.plusGrandPositif(tab2));

        double[] tab3 = {-4.2,-7.6,0.0};
        assertEquals(0,DiversesMethodesSurDesTableaux.plusGrandPositif(tab3));

        double[] tab4 = {-1,-8,-6,-3};
        assertEquals(-1,DiversesMethodesSurDesTableaux.plusGrandPositif(tab4));
    }

    @Test
    void nbOccBigramme(){
        assertEquals(4,DiversesMethodesSurDesTableaux.nbOccBigramme("C'est troop coool waaw ee"));
        assertEquals(0,DiversesMethodesSurDesTableaux.nbOccBigramme("YO WORLD"));
        assertEquals(1,DiversesMethodesSurDesTableaux.nbOccBigramme("YO WORLD!!"));


    }


}

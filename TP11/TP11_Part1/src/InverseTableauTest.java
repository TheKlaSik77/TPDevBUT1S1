import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InverseTableauTest {

    @Test
    final void creeTableauInverse() {
        int[] tabLongueurZero = {};
        int[] attendutabLongueurZero = {};
        int[] observetabLongueurZero = InverseTableau.creeTableauInverse(tabLongueurZero);
        assertArrayEquals(attendutabLongueurZero, observetabLongueurZero);
        assertNotSame(tabLongueurZero, observetabLongueurZero);

        int[] tabLongueurUn = {3};
        int[] attenduTabLongueurUn = {3};
        int[] observetabLongueurUn = InverseTableau.creeTableauInverse(tabLongueurUn);
        assertArrayEquals(attenduTabLongueurUn, observetabLongueurUn);
        assertNotSame(tabLongueurUn, observetabLongueurUn);

        int[] tabLongueurPaire = {1,2,3,4,5,6};
        int[] attenduTabLongueurPaire = {6,5,4,3,2,1};
        assertArrayEquals(attenduTabLongueurPaire, InverseTableau.creeTableauInverse(tabLongueurPaire));

        int[] tabLongueurImpaire = {1,2,3,4,5};
        int[] attenduTabLongueurImpaire = {5,4,3,2,1};
        assertArrayEquals(attenduTabLongueurImpaire, InverseTableau.creeTableauInverse(tabLongueurImpaire));
    }

    @Test
    final void inverseTableau() {
        int[] tabLongueurZero = {};
        int[] attendutabLongueurZero = {};
        InverseTableau.inverseTableau(tabLongueurZero);
        assertArrayEquals(attendutabLongueurZero, tabLongueurZero);

        int[] tabLongueurUn = {3};
        int[] attenduTabLongueurUn = {3};
        InverseTableau.inverseTableau(tabLongueurUn);
        assertArrayEquals(attenduTabLongueurUn, tabLongueurUn);

        int[] tabLongueurPaire = {1,2,3,4,5,6};
        int[] attenduTabLongueurPaire = {6,5,4,3,2,1};
        InverseTableau.inverseTableau(tabLongueurPaire);
        assertArrayEquals(attenduTabLongueurPaire, tabLongueurPaire);

        int[] tabLongueurImpaire = {1,2,3,4,5};
        int[] attenduTabLongueurImpaire = {5,4,3,2,1};
        InverseTableau.inverseTableau(tabLongueurImpaire);
        assertArrayEquals(attenduTabLongueurImpaire, tabLongueurImpaire);
    }



}
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.zip.DeflaterInputStream;

class DiversesFonctionsTest {

    @Test
    void valAbs() {
        assertEquals(4, DiversesFonctions.valAbs(4), "cas positif");

        assertEquals(4, DiversesFonctions.valAbs(-4), "cas négatif");

        assertEquals(0, DiversesFonctions.valAbs(0), "cas nul");
    }

    @Test
    void estNul() {
        assertTrue(DiversesFonctions.estNul(0), "cas nul");

        assertFalse(DiversesFonctions.estNul(-6), "cas négatif");

        assertFalse(DiversesFonctions.estNul(3), "cas positif");
    }

    @Test
    void aleatoirePairEntre0et100inclus() {
        int alea;

        /*  Remarquons que ce test est loin d'être complet :
         *  Il vérifie que des valeurs hors domaine ne sont pas générées,
         *  mais ne vérifie pas que toutes les valeurs de l'interval [0,100] sont atteintes
         *  et encore moins que la probabilité est uniforme.
         */
        for (int i=1 ; i <= 150 ; i++){
            alea = DiversesFonctions.aleatoirePairEntre0et100inclus();
            assertTrue(alea >= 0 && alea <= 100 && alea%2 == 0);
        }
    }

    @Test
    void signe(){
        assertEquals(-1,DiversesFonctions.signe(-1), "cas a < 0");
        assertEquals(0,DiversesFonctions.signe(0), "cas a = 0");
        assertEquals(1,DiversesFonctions.signe(1),"cas a > 0");
    }

    @Test
    void pair(){
        assertTrue(DiversesFonctions.pair(4), "cas a est pair et différent de 0");
        assertFalse(DiversesFonctions.pair(-7), "cas a est impair et différent de 0");
        assertTrue(DiversesFonctions.pair(0), "cas a est pair et égale à 0");
    }

    @Test
    void max(){
        assertEquals(2,DiversesFonctions.max(2,2,2),"cas a = b = c");
        assertEquals(3,DiversesFonctions.max(3,2,1),"cas a est supérieur à b et c");
        assertEquals(45,DiversesFonctions.max(2,45,8),"cas b est supérieur à a et c");
        assertEquals(89,DiversesFonctions.max(-14,0,89),"cas c est supérieur à a et c");
        assertEquals(45,DiversesFonctions.max(45,45,8),"cas a=b et est supérieur à c");
        assertEquals(45,DiversesFonctions.max(-14,45,45),"cas b=c et est supérieur à a");
        assertEquals(45,DiversesFonctions.max(45,8,45),"cas a=c est supérieur à b");
    }

    @Test
    void auMoinsUnCaractere(){
        assertTrue(DiversesFonctions.auMoinsUnCaractère("blabla"),"cas ou longueur de s est supérieure à 0");
        assertFalse(DiversesFonctions.auMoinsUnCaractère(""),"cas ou longueur de s est égale à 0");
        assertTrue(DiversesFonctions.auMoinsUnCaractère(" "),"cas ou longueur de s est supérieure à 0");
    }

    @Test
    void nombreBinaire(){
        assertFalse(DiversesFonctions.nombreBinaire("1001112"),"Cas n'est pas un nombre binaire");
        assertTrue(DiversesFonctions.nombreBinaire("110011010"),"Cas est un nombre binaire");
        assertFalse(DiversesFonctions.nombreBinaire(""),"Cas s est vide");
    }

    @Test
    void valeur(){
        assertEquals(0,DiversesFonctions.valeur("0"));
        assertEquals(-1, DiversesFonctions.valeur(""));
        assertEquals(248, DiversesFonctions.valeur("248"));
        assertEquals(-1, DiversesFonctions.valeur("Bonjour"));
        assertEquals(-1, DiversesFonctions.valeur("-42"));
        assertEquals(-1, DiversesFonctions.valeur("0123456789"));
        assertEquals(48, DiversesFonctions.valeur("0048"));
    }
    @Test
    void valeurBinaire(){
        assertEquals(1,DiversesFonctions.valeurBinaire("1"));
        assertEquals(0,DiversesFonctions.valeurBinaire("0"));

        assertEquals(-1,DiversesFonctions.valeurBinaire("Bonjour!"));
        assertEquals(-1,DiversesFonctions.valeurBinaire("0111111010001100111001101010101"));
        assertEquals(798861429,DiversesFonctions.valeurBinaire("101111100111011010100001110101"));
        assertEquals(1456,DiversesFonctions.valeurBinaire("10110110000"));

    }

    @Test
    void pgcd(){
        assertEquals(145,DiversesFonctions.pgcd(145,145));
        assertEquals(17,DiversesFonctions.pgcd(221,782));
        assertEquals(0,DiversesFonctions.pgcd(0,0));
        assertEquals(5,DiversesFonctions.pgcd(-145,-755));
    }

    @Test
    void ecritureEnBase2NonSigne(){
        assertEquals("101111100111011010100001110101",DiversesFonctions.ecritureEnBase2NonSigne(798861429));
        assertEquals("10110110000",DiversesFonctions.ecritureEnBase2NonSigne(1456));
        assertEquals("0",DiversesFonctions.ecritureEnBase2NonSigne(0));
        assertEquals("1",DiversesFonctions.ecritureEnBase2NonSigne(1));


    }


}
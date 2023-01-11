import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class MethodesTabDoublesTest {

    @Test
    void nbTrue2D() {
        boolean[][] tabVide = new boolean[0][0];
        assertEquals(0,MethodesTabDoubles.nbTrue2D(tabVide));

        boolean[][] tabMoyen = { {true,false,true,true} , {true,true,true,false} };
        assertEquals(6,MethodesTabDoubles.nbTrue2D(tabMoyen));

        boolean[][] tabMoyenSansTrue = { {false,false,false,false} , {false,false,false,false} };
        assertEquals(0,MethodesTabDoubles.nbTrue2D(tabMoyenSansTrue));
    }

    @Test
    void nbTrue4D() {
        boolean[][][][] tabVide = new boolean[0][0][0][0];
        assertEquals(0,MethodesTabDoubles.nbTrue4D(tabVide));

        boolean[][][][] tabMoyen = { { { {true, false} }, { {true, true} } } , { { {true, true} }, { {true, false}, {true, true} } }};
        assertEquals(8,MethodesTabDoubles.nbTrue4D(tabMoyen));

        boolean[][][][] tabMoyenSansTrue = { { { {false, false} }, { {false, false} } } , { { {false, false} }, { {false, false}, {false, false} } }};
        assertEquals(0,MethodesTabDoubles.nbTrue4D(tabMoyenSansTrue));

    }

    @Test
    void estPresente2D(){

        int[][] tabVide = new int[0][0];
        int[][] tabMoyenAvecVal = { {1,2,3,4} , {5,6,7,8} };
        int[][] tabMoyenSansVal = { {1,3,12,14} , {17,42,61,17} };

        assertFalse(MethodesTabDoubles.estPresente2D(tabVide,4));
        assertTrue(MethodesTabDoubles.estPresente2D(tabMoyenAvecVal,8));
        assertFalse(MethodesTabDoubles.estPresente2D(tabMoyenSansVal,2));
    }

    @Test
    void estPresente4D(){

        int[][][][] tabVide = new int[0][0][0][0];
        int[][][][] tabMoyen = { { { {4,12,4} }, { {7,8,9} } } , { { {17,71,71} }, { {4,5,7,3}, {7,8,9,8} } }};

        assertFalse(MethodesTabDoubles.estPresente4D(tabVide,41));
        assertTrue(MethodesTabDoubles.estPresente4D(tabMoyen,12));
        assertFalse(MethodesTabDoubles.estPresente4D(tabMoyen,41));

    }


    @Test
    void remplaceNegParZeros2D(){
        int[][] tabVide = new int[0][0];
        int[][] tabMoyenAvecNeg = { {-1,3,-12,14} , {17,-42,-61,-17} };
        int[][] tabMoyenRes = { {0,3,0,14} , {17,0,0,0} };

        int[][] tabTemp = tabVide;
        MethodesTabDoubles.remplaceNegParZeros2D(tabVide);
        assertArrayEquals(tabTemp,tabVide);

        MethodesTabDoubles.remplaceNegParZeros2D(tabMoyenAvecNeg);
        assertArrayEquals(tabMoyenRes,tabMoyenAvecNeg);

        tabTemp = tabMoyenRes;
        MethodesTabDoubles.remplaceNegParZeros2D(tabMoyenRes);
        assertArrayEquals(tabTemp,tabMoyenRes);

    }

    @Test
    void remplaceNegParZeros4D(){
        int[][][][] tabVide = new int[0][0][0][0];
        int[][][][] tabMoyenAvecNeg = { { { {4,-12,4} }, { {7,8,9} } } , { { {-17,71,-71} }, { {4,-5,7,3}, {7,8,-9,8} } }};
        int[][][][] tabMoyenRes = { { { {4,0,4} }, { {7,8,9} } } , { { {0,71,0} }, { {4,0,7,3}, {7,8,0,8} } }};

        int[][][][] tabTemp = tabVide;
        MethodesTabDoubles.remplaceNegParZeros4D(tabVide);
        assertArrayEquals(tabTemp,tabVide);

        MethodesTabDoubles.remplaceNegParZeros4D(tabMoyenAvecNeg);
        assertArrayEquals(tabMoyenRes,tabMoyenAvecNeg);

        tabTemp = tabMoyenRes;
        MethodesTabDoubles.remplaceNegParZeros4D(tabMoyenRes);
        assertArrayEquals(tabTemp,tabMoyenRes);

    }

    @Test
    void sommeLignes(){

        int[][] tabVide = new int[0][0];
        int[] tabVideRes = new int[0];
        int[][] tabMoyen = { {1,2,3,4} , {5,6,7,8} };
        int[] tabMoyenRes= {10,26};

        assertArrayEquals(tabVideRes,MethodesTabDoubles.sommeLignes(tabVide));
        assertArrayEquals(tabMoyenRes,MethodesTabDoubles.sommeLignes(tabMoyen));
    }

    @Test
    void nbZerosParLigne(){

        int[][] tabVide = new int[0][0];
        int[] tabVideRes = new int[0];
        int[][] tabMoyen = { {1,0,3,1} , {5,0,0,8} , {5,14,4,4}};
        int[] tabMoyenRes= {1,2,0};

        assertArrayEquals(tabVideRes,MethodesTabDoubles.nbZerosParLigne(tabVide));
        assertArrayEquals(tabMoyenRes,MethodesTabDoubles.nbZerosParLigne(tabMoyen));

    }

    @Test
    void estPresent0ParLignes(){
        int[][] tabVide = new int[0][0];
        boolean[] tabVideRes = new boolean[0];
        int[][] tabMoyen = { {1,0,3,1} , {5,0,0,8} , {5,14,4,4}};
        boolean[] tabMoyenRes= {true,true,false};

        assertArrayEquals(tabVideRes,MethodesTabDoubles.estPresent0ParLignes(tabVide));
        assertArrayEquals(tabMoyenRes,MethodesTabDoubles.estPresent0ParLignes(tabMoyen));
    }


}
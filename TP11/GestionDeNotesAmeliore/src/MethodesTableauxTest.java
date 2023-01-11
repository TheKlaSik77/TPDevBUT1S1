import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodesTableauxTest {

    @Test
    void antizero(){
        int[] tabRemplis0Et1 = {0,1,0,1,0};
        MethodesTableaux.antizero(tabRemplis0Et1);
        int[] tabFinal = {1,1,1,1,1};
        assertEquals(tabFinal,tabRemplis0Et1);
    }


}
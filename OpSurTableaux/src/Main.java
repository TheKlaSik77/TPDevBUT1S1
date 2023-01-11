public class Main {
    public static void main(String[] args) {

        double[] tab1 = {2.1,4.7,6.9,8.8,10.54};
        double[] tab2 = {3.8, -5.5, 0.1, -1.4, 2.0};
        double[] tab3 = {1.52,2.4,3.4};

        EncoreDesMethodesSurDesTableaux.plusGrandSeuil(tab1,9.0);
        EncoreDesMethodesSurDesTableaux.plusGrandSeuil(tab2,0.0);
        EncoreDesMethodesSurDesTableaux.plusGrandSeuil(tab3,1.01);
    }
}
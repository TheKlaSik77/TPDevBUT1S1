public class Main {
    public static void main(String[] args) {
        int[] tab = MethodesQuiModifientDesTableaux.creerEtremplirTableauAvecValeursAleatoires(10 , -41 ,22);

        MethodesQuiModifientDesTableaux.afficherTab(tab);
        System.out.println("-------------------------------------------");
        MethodesQuiModifientDesTableaux.valAbs(tab);
        System.out.println("-------------------------------------------");

        MethodesQuiModifientDesTableaux.afficherTab(tab);
        System.out.println("-------------------------------------------");

        MethodesQuiModifientDesTableaux.raz(tab);
        System.out.println("-------------------------------------------");
        MethodesQuiModifientDesTableaux.afficherTab(tab);

    }
}

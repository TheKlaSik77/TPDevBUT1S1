public class FonctionsEscargot {

    public static void afficherEscargot(int[][] escargot){

        for (int i = 0 ; i < escargot.length ; i++){
            for (int j = 0 ; j < escargot[i].length ; j++){
                System.out.print(escargot[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void remplirEscargot(int[][] escargot){

        int direction = 1;
        int compteur = 1;

        int ligneActuelle = 0;
        int colonneActuelle = 0;

        while (compteur < Math.pow((escargot.length),2) - 1 ){

            switch(direction % 4){

                case 1:
                    while (colonneActuelle + 1 < escargot[ligneActuelle].length && escargot[ligneActuelle][colonneActuelle + 1] == 0){
                        escargot[ligneActuelle][colonneActuelle] = compteur;
                        colonneActuelle++;
                        compteur++;
                        System.out.println("compteur = " + compteur);

                    }
                    //escargot[ligneActuelle][colonneActuelle] = compteur;
                    //compteur++;
                    // Changement de direction
                    direction++;

                case 2:
                    while (ligneActuelle + 1 < escargot.length && escargot[ligneActuelle + 1][colonneActuelle] == 0){
                        escargot[ligneActuelle][colonneActuelle] = compteur;
                        ligneActuelle++;
                        compteur++;
                        System.out.println("compteur = " + compteur);

                    }
                    //escargot[ligneActuelle][colonneActuelle] = compteur;
                    //compteur++;
                    // Changement de direction
                    direction++;

                case 3:
                    while (colonneActuelle - 1 >= 0 && escargot[ligneActuelle][colonneActuelle - 1] == 0){
                        escargot[ligneActuelle][colonneActuelle] = compteur;
                        colonneActuelle--;
                        compteur++;
                        System.out.println("compteur = " + compteur);

                    }
                    // escargot[ligneActuelle][colonneActuelle] = compteur;
                    // compteur++;
                    // Changement de direction
                    direction++;

                case 0:
                    while (ligneActuelle - 1 >= 0 && escargot[ligneActuelle - 1][colonneActuelle] == 0){
                        escargot[ligneActuelle][colonneActuelle] = compteur;
                        ligneActuelle--;
                        compteur++;
                        System.out.println("compteur = " + compteur);

                    }
                    //escargot[ligneActuelle][colonneActuelle] = compteur;
                    //compteur++;
                    // Changement de direction
                    direction++;

            }

        }
        escargot[ligneActuelle][colonneActuelle] = compteur;

    }
}

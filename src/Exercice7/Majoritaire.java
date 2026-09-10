/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice7;

/**
 *
 * @author hp
 */
public class Majoritaire {

    /**
     * @param args the command line arguments
     */
   public static int elementMajoritaire(int[] t) {

        
        if (t == null || t.length == 0) {
            return -1;
        }

        int candidat = 0;
        int compteur = 0;

        for (int i = 0; i < t.length; i++) {

            if (compteur == 0) {
                candidat = t[i];
                compteur = 1;
            } else if (t[i] == candidat) {
                compteur++;
            } else {
                compteur--;
            }
        }

        int occurrences = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] == candidat) {
                occurrences++;
            }
        }

        if (occurrences > t.length / 2) {
            return candidat;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[][] tests = {
            {3, 3, 4, 3, 5},
            {2, 2, 1, 2, 3, 2, 2},
            {1, 1, 1, 1},
            {7},
            {1, 2, 3, 4},
            {1, 2, 2, 3},
            {1, 1, 2, 2},
            {-1, -1, -1, 2, 3},
            {-2, -2, -2, -2, 1, 3}
        };

        for (int i = 0; i < tests.length; i++) {

            System.out.print("Tableau : ");

            for (int j = 0; j < tests[i].length; j++) {
                System.out.print(tests[i][j] + " ");
            }

            int resultat = elementMajoritaire(tests[i]);

            System.out.println("-> Majoritaire = " + resultat);
        }
    }
    
}

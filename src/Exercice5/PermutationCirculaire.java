/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice5;

/**
 *
 * @author hp
 */
public class PermutationCirculaire {

    /**
     * @param args the command line arguments
     */
     public static boolean estPermutationCirculaire(int[] t) {

        
        if (t == null || t.length == 0) {
            return false;
        }

        int n = t.length;

        boolean[] vu = new boolean[n + 1];

       
        for (int i = 0; i < n; i++) {

            int x = t[i];

            
            if (x < 1 || x > n) {
                return false;
            }

            if (vu[x]) {
                return false;
            }

            vu[x] = true;
        }

        int pos = -1;

        for (int i = 0; i < n; i++) {
            if (t[i] == 1) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            return false;
        }

        for (int k = 0; k < n; k++) {

            int idx = (pos + k) % n;

            int valeurAttendue = k + 1;

            if (t[idx] != valeurAttendue) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[][] tests = {
            {1},
            {1, 2, 3, 4, 5},
            {2, 3, 4, 5, 1},
            {3, 4, 5, 1, 2},
            {4, 5, 1, 2, 3},
            {5, 1, 2, 3, 4},
            {3, 1, 2, 4, 5},
            {2, 1, 3, 4, 5},
            {4, 1, 2, 3, 5},
            {0, 1, 2, 3, 4},
            {1, 2, 2, 3, 4},
            {1, 2, 3, 4, 6}
        };

        for (int i = 0; i < tests.length; i++) {

            System.out.print("Tableau : ");

            for (int j = 0; j < tests[i].length; j++) {
                System.out.print(tests[i][j] + " ");
            }

            boolean resultat = estPermutationCirculaire(tests[i]);

            System.out.println(" -> " + resultat);
        }
    }
    
}

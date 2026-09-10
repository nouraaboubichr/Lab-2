/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice9;

/**
 *
 * @author hp
 */
public class Diagonales {

    /**
     * @param args the command line arguments
     */
     public static int differenceDiagonales(int[][] m) {

        int n = m.length;

        int sommePrincipale = 0;
        int sommeSecondaire = 0;

        for (int i = 0; i < n; i++) {

            sommePrincipale += m[i][i];

            sommeSecondaire += m[i][n - 1 - i];
        }

        int diff = sommePrincipale - sommeSecondaire;

        int absDiff = Math.abs(diff);

        System.out.println("Somme diagonale principale : " + sommePrincipale);
        System.out.println("Somme diagonale secondaire : " + sommeSecondaire);
        System.out.println("Différence absolue : " + absDiff);

        return absDiff;
    }

    public static void main(String[] args) {

        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        differenceDiagonales(m);
    }
    
}

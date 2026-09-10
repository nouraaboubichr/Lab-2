/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice10;

/**
 *
 * @author hp
 */
public class CarreMagique {

    /**
     * @param args the command line arguments
     */
     public static boolean estCarreMagique(int[][] m) {

        int ref = m[0][0] + m[0][1] + m[0][2];

        for (int i = 0; i < 3; i++) {

            int somme = 0;

            for (int j = 0; j < 3; j++) {
                somme += m[i][j];
            }

            if (somme != ref) {
                return false;
            }
        }

        for (int j = 0; j < 3; j++) {

            int somme = 0;

            for (int i = 0; i < 3; i++) {
                somme += m[i][j];
            }

            if (somme != ref) {
                return false;
            }
        }

        int diagonalePrincipale = m[0][0] + m[1][1] + m[2][2];

        if (diagonalePrincipale != ref) {
            return false;
        }

        int diagonaleSecondaire = m[0][2] + m[1][1] + m[2][0];

        if (diagonaleSecondaire != ref) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int[][] m1 = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        };

        int[][] m2 = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 7}
        };

        int[][] m3 = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };

        System.out.println("Matrice 1 :");

        if (estCarreMagique(m1)) {
            System.out.println("Carré magique");
        } else {
            System.out.println("Pas un carré magique");
        }

        System.out.println();

        System.out.println("Matrice 2 :");

        if (estCarreMagique(m2)) {
            System.out.println("Carré magique");
        } else {
            System.out.println("Pas un carré magique");
        }

        System.out.println();

        System.out.println("Matrice 3 :");

        if (estCarreMagique(m3)) {
            System.out.println("Carré magique");
        } else {
            System.out.println("Pas un carré magique");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice8;

/**
 *
 * @author hp
 */
public class NombresAbsents {

    /**
     * @param args the command line arguments
     */
     public static void afficherElementsManquants(int[] t) {

    
        if (t == null || t.length == 0) {
            System.out.println("Tableau vide");
            return;
        }

        int n = t.length;

        boolean[] vu = new boolean[n + 1];

     
        for (int i = 0; i < n; i++) {

            int x = t[i];

            if (x >= 1 && x <= n) {
                vu[x] = true;
            }
        }

       
        boolean trouve = false;

        System.out.print("Éléments manquants : ");

        for (int k = 1; k <= n; k++) {

            if (vu[k] == false) {
                System.out.print(k + " ");
                trouve = true;
            }
        }

        if (!trouve) {
            System.out.print("Aucun");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] t1 = {1, 3, 3, 5};
        int[] t2 = {1, 2, 3, 4};
        int[] t3 = {3, 3, 3};
        int[] t4 = {1, 1, 1, 1};
        int[] t5 = {4, 2, 2, 1, 5};
        int[] t6 = {1};
        int[] t7 = {1, 2, 3, 6};

        System.out.println("Test 1 :");
        afficherElementsManquants(t1);

        System.out.println("Test 2 :");
        afficherElementsManquants(t2);

        System.out.println("Test 3 :");
        afficherElementsManquants(t3);

        System.out.println("Test 4 :");
        afficherElementsManquants(t4);

        System.out.println("Test 5 :");
        afficherElementsManquants(t5);

        System.out.println("Test 6 :");
        afficherElementsManquants(t6);

        System.out.println("Test 7 :");
        afficherElementsManquants(t7);
    }
}

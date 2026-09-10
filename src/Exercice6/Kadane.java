/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice6;

/**
 *
 * @author hp
 */
public class Kadane {

    /**
     * @param args the command line arguments
     */
    public static int maxSubarraySum(int[] t) {

        
        if (t == null || t.length == 0) {
            return 0;
        }

        int currentSum = t[0];
        int maxSum = t[0];

        for (int i = 1; i < t.length; i++) {

            currentSum = Math.max(t[i], currentSum + t[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[][] tests = {
            {-2, 1, -3, 4, -1, 2, 1, -5, 4},
            {1, 2, 3, 4},
            {-1, -2, -3},
            {5},
            {-7},
            {-2, -1, 3, 4, -5},
            {1, -1, 1, -1, 1}
        };

        for (int i = 0; i < tests.length; i++) {

            System.out.print("Tableau : ");

            for (int j = 0; j < tests[i].length; j++) {
                System.out.print(tests[i][j] + " ");
            }

            int resultat = maxSubarraySum(tests[i]);

            System.out.println("-> Somme maximale = " + resultat);
        }
    }
    
}

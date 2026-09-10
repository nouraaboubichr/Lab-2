/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice1;

/**
 *
 * @author hp
 */
public class LIS {

    /**
     * @param args the command line arguments
     */
   public static int longueurLIS(int[] t) {

      
        if (t.length == 0) {
            return 0;
        }

        int n = t.length;
      
        int[] dp = new int[n];

       
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {

                if (t[j] < t[i]) {

                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int resultat = 0;

        for (int i = 0; i < n; i++) {

            if (dp[i] > resultat) {
                resultat = dp[i];
            }
        }

        return resultat;
    }

    public static void main(String[] args) {

        int[][] tests = {
            {},
            {5},
            {5, 4, 3, 2, 1},
            {1, 2, 3, 4, 5},
            {2, 1, 4, 2, 3, 5, 1, 7},
            {3, 3, 3, 3},
            {10, 9, 2, 5, 3, 7, 101, 18}
        };

        for (int[] t : tests) {
            System.out.println("LIS = " + longueurLIS(t));
        }
    }
    
}

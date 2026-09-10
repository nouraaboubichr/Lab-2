/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice4;

import java.util.Stack;

/**
 *
 * @author hp
 */
public class MaxRectangle {

    /**
     * @param args the command line arguments
     */
   static class Rectangle {
        int top;
        int left;
        int bottom;
        int right;
        int area;
    }

    
    public static Rectangle trouverMaxRectangle(int[][] m) {

        Rectangle meilleur = new Rectangle();

        meilleur.area = 0;

        if (m == null || m.length == 0) {
            return meilleur;
        }

        int R = m.length;
        int C = m[0].length;

        int[] hauteur = new int[C];

       
        for (int i = 0; i < R; i++) {

            for (int j = 0; j < C; j++) {

                if (m[i][j] == 1) {
                    hauteur[j]++;
                } else {
                    hauteur[j] = 0;
                }
            }

           
            Rectangle r = plusGrandRectangleHistogramme(
                    hauteur, i);

            if (r.area > meilleur.area) {
                meilleur = r;
            }
        }

        return meilleur;
    }

    
    public static Rectangle plusGrandRectangleHistogramme(
            int[] hauteur, int bottom) {

        Rectangle meilleur = new Rectangle();
        meilleur.area = 0;

        Stack<Integer> pile = new Stack<Integer>();

        int n = hauteur.length;

        for (int i = 0; i <= n; i++) {

            int h;

            
            if (i == n) {
                h = 0;
            } else {
                h = hauteur[i];
            }

            while (!pile.empty()
                    && h < hauteur[pile.peek()]) {

                int index = pile.pop();

                int height = hauteur[index];

                int right = i - 1;

                int left;

                if (pile.empty()) {
                    left = 0;
                } else {
                    left = pile.peek() + 1;
                }

                int width = right - left + 1;

                int area = height * width;

                if (area > meilleur.area) {

                    meilleur.area = area;
                    meilleur.bottom = bottom;
                    meilleur.top = bottom - height + 1;
                    meilleur.left = left;
                    meilleur.right = right;
                }
            }

            pile.push(i);
        }

        return meilleur;
    }

    
    public static int maxRectangle(int[][] m) {

        Rectangle r = trouverMaxRectangle(m);

        return r.area;
    }

    
    public static void afficherResultat(Rectangle r) {

        System.out.println("Aire maximale : " + r.area);

        if (r.area > 0) {

            System.out.println(
                    "Coordonnées : "
                    + "(top=" + r.top
                    + ", left=" + r.left
                    + ", bottom=" + r.bottom
                    + ", right=" + r.right + ")"
            );
        } else {
            System.out.println("Aucun rectangle de 1");
        }
    }

    
    public static void afficherMatrice(int[][] m) {

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] m = {
            {0, 1, 1, 0, 1},
            {1, 1, 1, 1, 0},
            {1, 1, 1, 1, 0},
            {1, 1, 0, 0, 1}
        };

        System.out.println("Matrice :");
        afficherMatrice(m);

        System.out.println();

        Rectangle resultat = trouverMaxRectangle(m);

        afficherResultat(resultat);
    }
    
}

package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {
    /**permet d'afficher le tableau
     *
     * @param tableau de scores
     */
    public static void afficherTableau (int tableau[]){
        for (int i = 0 ; i < 7 ; i++ ) {
            System.out.println(tableau[i]);
        }
    }

    /**affiche le meilleur score
     *
     * @param tableau de scores
     * @return renvoie le plus grand score du tableau
     */

    public static int meilleurScore (int tableau[]){
        int max = 0 ;
        for (int i = 0 ; i < 7 ; i++) {
            if (tableau[i]>max ){
                max = tableau[i];
            }
        }
        return max ;
    }

    /**dit si il y a un nombre inférieur a 10
     *
     * @param tableau de scores
     * @return renvoie vrai si le tableau contient au moins une valeur
     * inférieure à 10
     */
    public static boolean moinsde10 (int[] tableau){
        boolean nombremoinsde10 = false ;
        int N = 10 ;
        for (int i = 0 ; i < 7 ; i++) {
            if (tableau[i]<N ){
                N = tableau[i];
                nombremoinsde10 = true ;
            }

        }
        return nombremoinsde10 ;
    }




    public static void main(String[] args) {
        int[] scores = new int[7];
        scores [0] = 27 ;
        scores [1] = 7 ;
        scores [2] = 15 ;
        scores [3] = 230 ;
        scores [4] = 46 ;
        scores [5] = 32 ;
        scores [6] = 50 ;
//        for (int i = 0 ; i < scores.length ; i++ ) {
//            int s = scores [i] ;
//            System.out.println("scores = " + s );
//        }
//        int somme = 0 ;
//        for(int i = 0 ; i < scores.length ; i++) {
//            somme += scores[i];
//        }
//        float moyenne = somme / scores.length ;
//        System.out.println("la moyenne des scores est : " + moyenne);


        afficherTableau(scores);
        int bestscore = meilleurScore(scores);
        System.out.println("le meilleur score est : " + bestscore);
        boolean under10 = moinsde10(scores);
        System.out.println("est-ce qu'il y a un nombre plus petit que 10 ? : " + under10);




    }
}

package com.company;

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
        int max = Integer.MIN_VALUE ;
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

    /**Recherche binaire dans une liste de nombre
     *
     * @param tableau
     * @param nombreRecherché
     * @return Cette fonction renvoie l'index de la case contenant le nombre
     */
    public static int recherchebinaire (int[] tableau , int nombreRecherché ){

        int premierindex = 0;
        int dernierindex = tableau.length-1;

        while (premierindex <= dernierindex) {
            int moitié = (premierindex + dernierindex)/2 ;
            if (nombreRecherché > tableau[moitié]){ // vérifie la partie droite du tableau
                premierindex = moitié + 1 ;
            }
            else if (nombreRecherché < tableau[moitié]){ // vérifie la partie gauche du tableau
                dernierindex = moitié - 1 ;
            }
            else {
                return moitié ;
            }

        }
        return -1;
    }

    public static int rechercheBinnaireRécursive (int[] tableau , int dernierindex, int premierindex, int nombreRecherché ) {

        if (premierindex <= dernierindex) {
            int moitié = (premierindex + dernierindex) / 2;

            if (nombreRecherché == tableau[moitié]) {
                return moitié;
            }
            if (nombreRecherché > tableau[moitié]) {
                return rechercheBinnaireRécursive(tableau, dernierindex,moitié+1, nombreRecherché);
            }
            else if (nombreRecherché < tableau[moitié]) {
                return rechercheBinnaireRécursive(tableau, moitié-1 , premierindex, nombreRecherché);
            }
        }
        return -1;
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

        int[] tableau = {1, 2, 3, 4, 5, 6, 7, 8, 9} ;



        afficherTableau(scores);

        int bestscore = meilleurScore(scores);
        System.out.println("le meilleur score est : " + bestscore);

        boolean under10 = moinsde10(scores);
        System.out.println("est-ce qu'il y a un nombre plus petit que 10 ? : " + under10);

        int resultat = recherchebinaire(tableau, 5) ;

        if (resultat == -1){
            System.out.println("le nombre que vous cherchez n'est pas dans la liste");
        }
        else {
            System.out.println("Votre nombre est a l'index : " + resultat);
        }


        int resultat2 = rechercheBinnaireRécursive(tableau, tableau.length-1, 0, 0) ;

        if (resultat2 == -1){
            System.out.println("le nombre que vous cherchez n'est pas dans la liste");
        }
        else {
            System.out.println("Votre deuxième nombre est a l'index : " + resultat2);
        }
    }
}

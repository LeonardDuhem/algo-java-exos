package com.company;

public class Main {

    public static void main(String[] args) {
        int[] scores = new int[7];
        scores [0] = 27 ;
        scores [1] = 1 ;
        scores [2] = 15 ;
        scores [3] = 23 ;
        scores [4] = 46 ;
        scores [5] = 32 ;
        scores [6] = 50 ;
        for (int i = 0 ; i < scores.length ; i++ ) {
            int s = scores [i] ;
            System.out.println("scores = " + s );
        }
        int somme = 0 ;
        for(int i = 0 ; i < scores.length ; i++) {
            somme += scores[i];
        }
        float moyenne = somme / scores.length ;
        System.out.println("la moyenne des scores est : " + moyenne);


        




    }
}

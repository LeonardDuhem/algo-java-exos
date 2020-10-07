package com.company;

public class Main {
    /**
     * display the table
     * @param table your table
     */
    public static void DisplayTable (int[] table){
        for (int i = 0 ; i < 7 ; i++ ) {
            System.out.println(table[i]);
        }
    }

    /**
     * displays the best score
     * @param table your table
     * @return  the highest score in the array
     */
    public static int BestScore (int[] table){
        int max = Integer.MIN_VALUE ;
        for (int i = 0 ; i < 7 ; i++) {
            if (table[i]>max ){
                max = table[i];
            }
        }
        return max ;
    }

    /**
     * say if there is a number less than 10
     * @param table your table
     * @return true if the array contains at least one value <10
     */
    public static boolean LessThan10 (int[] table){
        boolean numberLessThan10 = false ;
        int ten = 10 ;
        for (int i = 0 ; i < 7 ; i++) {
            if (table[i]<ten ){
                ten = table[i];
                numberLessThan10 = true ;
            }

        }
        return numberLessThan10 ;
    }

    /**
     * Binary search in a list of numbers
     * @param table your table
     * @param ResearchNumber The number you search
     * @return the index of the cell containing the number
     */
    public static int BinaryResearch (int[] table , int ResearchNumber ){

        int firstindex = 0;
        int lastindex = table.length-1;

        while (firstindex <= lastindex) {
            int middle = (firstindex + lastindex)/2 ;
            if (ResearchNumber > table[middle]){ // check the right part of the table
                firstindex = middle + 1 ;
            }
            else if (ResearchNumber < table[middle]){ // check the left part of the table
                lastindex = middle - 1 ;
            }
            else {
                return middle ;
            }

        }
        return -1;
    }

    /**
     *Binary search in a list of numbers(recursive methode)
     * @param table your table
     * @param lastindex the index of the last number in your table
     * @param firstindex The index of the first number in the table
     * @param researchNumber The number you search
     * @return the index of the cell containing the number
     */
    public static int RecursiveBinaryResearch (int[] table , int lastindex, int firstindex, int researchNumber ) {

        if (firstindex <= lastindex) {
            int middle = (firstindex + lastindex) / 2;

            if (researchNumber == table[middle]) {
                return middle;
            }
            if (researchNumber > table[middle]) {
                return RecursiveBinaryResearch(table, lastindex,middle+1, researchNumber);
            }
            else if (researchNumber < table[middle]) {
                return RecursiveBinaryResearch(table, middle-1 , firstindex, researchNumber);
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

        int[] table = {1, 2, 3, 4, 5, 6, 7, 8, 9} ;



        DisplayTable(scores);


        int bestscore = BestScore(scores);
        System.out.println("The best score is : " + bestscore);


        boolean under10 = LessThan10(scores);
        System.out.println("is there a number less than 10? : " + under10);


        int result = BinaryResearch(table, 5) ;
        if (result == -1){
            System.out.println("the number you are looking for is not in the list");
        }
        else {
            System.out.println("Your number is on the index : " + result);
        }


        int result2 = RecursiveBinaryResearch(table, table.length-1, 0, 0) ;
        if (result2 == -1){
            System.out.println("the number you are looking for is not in the list");
        }
        else {
            System.out.println("Your second number is on the index : " + result2);
        }
    }
}

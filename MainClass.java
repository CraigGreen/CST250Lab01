package edu.ru.cst250;
//Craig Greenwald 
//Array Practice

public class MainClass {

    public static void main(String[] args) {

        printArraYS();

        }

    private static void printArraYS() {
          String[] array1 = {"word1", "word2", "word3", "word4"};
        String[] array2 = array1;
         
        for (int index = 0; index < array1.length; index++) {
            System.out.println("_" + array1[index]);
            System.out.println(array2[index]);
    }
        

    }

    
 

}

package com.MMG.HolaMundo;

public class TrabajarConArrays {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("Array de trabalenguas = " + trabalenguas.toCharArray());

        char[] array = trabalenguas.toCharArray();
        int largo = array.length;
        for(int i=0;i<largo;i++){
            System.out.println("Array 1: " + array[i]);
        }

        System.out.println("\nArray = " + trabalenguas.split("[a]"));

        String archivo="Imagen.en.pdf";
        String[] archivoArray=archivo.split("[.]");
        int largo2=archivoArray.length;

        for (int j=0;j<largo2;j++){
            System.out.println("Array 2: " + archivoArray[j]);
        }
        System.out.println("Extension = " + archivoArray[largo2-1]);
    }
}

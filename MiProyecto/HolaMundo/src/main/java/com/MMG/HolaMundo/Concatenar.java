package com.MMG.HolaMundo;

import javax.swing.*;

public class Concatenar {
    public static void main(String[] args) {

        //Prueba de rendimiento
         String a="a";
         String b="b";
         String c=a;

         long inicio = System.currentTimeMillis();

         StringBuilder sb = new StringBuilder(a);

         for (int i=0;i<500;i++){
           //c = c.concat(a).concat(b).concat("\n"); //500=2Ms
           //c+=a + b + "\n"; //500=12Ms
           sb.append(a).append(b).append("\n"); //500=0Ms
         }
         long fin = System.currentTimeMillis();
         System.out.println(fin-inicio);
         System.out.println("c = " + c);
         System.out.println("sb = " + sb.toString());

    }
}

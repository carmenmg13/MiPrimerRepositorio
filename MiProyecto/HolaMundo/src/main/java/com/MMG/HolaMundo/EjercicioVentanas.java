package com.MMG.HolaMundo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioVentanas {
    public static void main(String[] args) {
        //Crear pantalla Scanner
        int numeroEntero=0;

        Scanner consola = new Scanner(System.in);
        System.out.println("Introduzca un numero entero: ");

        try {
            numeroEntero=consola.nextInt(); //Integer.parseInt(consola.nextLine());
       // }catch (InputMismatchException e){
        }catch (Exception e){
            System.out.println("Debe introducir un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("El numero introducido es: " + numeroEntero);


    }
}

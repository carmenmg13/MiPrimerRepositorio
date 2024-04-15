package com.MMG.HolaMundo;

import java.util.Scanner;

public class EjercicioComparar {
    public static void main(String[] args) {
        String usuario = "Carmen";
        String passw = "12345";
        Scanner consola = new Scanner(System.in);

        System.out.println("Introduzca el usuario: ");
        String u = consola.next();
        System.out.println("Introduzca la contraseña: ");
        String p = consola.next();

        Boolean acceso = false;
        if (usuario.equals(u) && passw.equals(p)) {
            //System.out.println("Bienvenido " + u);
            acceso = true;
        } else System.out.println("Usuario desconocido ");

        if (acceso){
            System.out.println("Bienvenido " + u);
        } else System.out.println("Acceso incorrecto ");

    }
}

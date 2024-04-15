package com.MMG.HolaMundo;

import javax.swing.*;

public class EjercicioVariables {
    public static void main(String[] args) {
        //Crear cuadro de Dialogo

        int numeroEntero=0;
        String numeroStr= JOptionPane.showInputDialog(null,"Ingrese un numero entero: ");

        try {
            numeroEntero=Integer.parseInt(numeroStr);
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Debe introducir un numero entero ");
            main(args);
            System.exit(0);
        }

        //System.out.println("Numero entero introducido: " + numeroEntero);
        JOptionPane.showMessageDialog(null,"El numero introducido es: " + numeroEntero);

    }
}

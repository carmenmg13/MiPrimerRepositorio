package com.MC.EjercicioRectangulo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class EjercicioRectanguloApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioRectanguloApplication.class, args);

		int alto;
		int ancho;
		int area;
		int perimetro;

        var consola = new Scanner(System.in);

		System.out.println("Introduzca el ancho = ");
		ancho=Integer.parseInt( consola.nextLine() );
		System.out.println("Introduzca el alto = ");
		alto=Integer.parseInt( consola.nextLine() );

		area = ancho * alto;
        perimetro = (ancho+alto) * 2;

		System.out.println("Area = " + area);
		System.out.println("Perimetro = " + perimetro);
	}

}

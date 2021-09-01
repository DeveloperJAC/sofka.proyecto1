package com.sofka.proyecto1;

import java.util.Scanner;

public class Informacion {

    String nombre, celular;
    int edad;

    public void leerInfo(){
        Scanner datos = new Scanner(System.in);
        System.out.println("Gracias por ingresar a nuestro sistema, para continuar le solicitaremos unos datos personales.");
        System.out.println("Escriba su nombre");
        nombre = datos.nextLine();
        System.out.println("Escriba su numero de celular");
        celular = datos.nextLine();
        System.out.println("Escriba su edad");
        edad = datos.nextInt();

    }
    public void mostrarDatos(){

        System.out.println("Bienvenido señor "+nombre+ "," + " es un placer para nosotros contar con una persona de " + edad
        + " años.");
        System.out.println("Próximamente nos comunicaremos con usted al numero " + celular + "." + "\n" + "Feliz día" );

    }


    }


package com.sofka.proyecto1;

import java.util.Scanner;

public class Informacion {

    String nombre,celular;
    int edad;

    public void leerInfo(){
        Scanner datos = new Scanner(System.in);
        System.out.println("Gracias por ingresar a nuestro sistema, para continuar le solicitaremos unos datos personales.");
        System.out.println("Escriba su nombre");
        String nombre = datos.nextLine();
        System.out.println("Escriba su numero de celular");
        String celular = datos.nextLine();
        System.out.println("Escriba su edad");
        int edad = datos.nextInt();


    }



    }


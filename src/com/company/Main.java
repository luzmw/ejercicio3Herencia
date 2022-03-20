package com.company;

import com.sun.source.tree.IfTree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Constructores:
        //Definir las clases necesarias de un portal de noticias que tiene publicidades
        //Generar objetos de cada una de las clases sabiendo que las noticias tienen un titulo y autor y las publicidades tienen una marca
        //Generar los objetos utilizando constructores. Mostrar la info generada en los objetos. Se puede ingresar en forma dinamica desde teclado con un Scanner (opcional)

    Publicidad publicidad = new Publicidad("limpie ma", "10 de abril", 23, "puloi");
    Noticia noticia = new Noticia ("editorial","20 de abril", 32, "Julio lopez", "la voz humana");

    //menu verrDatos

        Scanner sc = new Scanner(System.in);
        int op = 0;

    System.out.println("bienvenido al portal / Si desea ver noticias digite 1, si desea ver publicidades digite 2 o 0 para salir ");
   do {
       op = sc.nextInt();

       switch (op) {
           case 0:
               System.out.println("gracias por elegirnos ");
               break;

           case 1:
               System.out.println(noticia.verDatos());
               break;
           case 2:
               System.out.println(publicidad.verDatos());
               break;
       }
   }while (op >= 1 & op <=2);


    }

}

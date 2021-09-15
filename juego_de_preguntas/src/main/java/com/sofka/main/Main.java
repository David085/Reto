package com.sofka.main;

import com.sofka.preguntas.PreguntasRonda1;
import com.sofka.preguntas.PreguntasRonda2;
import com.sofka.preguntas.PreguntasRonda3;
import com.sofka.preguntas.PreguntasRonda4;
import com.sofka.preguntas.PreguntasRonda5;
import com.sofka.usuario.Usuario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {

    public static int puntos = 0, ronda = 1;

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        String nombre_user = "";
        Scanner menu = new Scanner(System.in);
        char respuesta_menu; // variable para tomar las respuestas que se dan en el menu
        boolean jugando = true; // variable para saver si el user sale de la partida

        System.out.println("-------------------------------------");
        System.out.println("-   ¿Cuánto sabes sobre geografía   -?");
        System.out.println("-------------------------------------");
        System.out.println("Este juego consta de una serie de preguntas sobre\n"
                + "las capitales de diferentes paises del mundo. Son 5 rondas \n"
                + "en donde saldŕa una pregunta con un pais aleatorio y tendrás\n"
                + "que elegir su capital correcta, si aciertas, ganarás puntos\n"
                + "y pasarás a la siguiente ronda; si fallas, se acabará el juego\n"
                + "con los puntos que tengas en ese momento.\n\n"
                + "Siempre que quieras finalizar el juego solo presiona la "
                + "tecla 's'");
        System.out.println("¿Estás listo?\n'S' = si\n'N' = no");

        try {

            //Aqui se leen los datos del ppuntaje anterior que se imprimen al final
            ObjectInputStream leerDatos = new ObjectInputStream(new FileInputStream("/home/david/Escritorio/Usuario.txt"));
            Usuario usuarioRecuperado = (Usuario) leerDatos.readObject();
            leerDatos.close();

            // Aqui tomamos la respuesta del usuario si esta listo o no
            respuesta_menu = menu.next().toLowerCase().charAt(0); // toma el primer caracter de un string y lo convierte en minuscula           

            if (respuesta_menu != 's' && respuesta_menu != 'n') {
                System.out.println("Respuesta incorrecta");
                System.exit(0);
            } else if (respuesta_menu == 'n') {
                System.out.println("Suerte");
                System.exit(0);
            }

            System.out.println("\nCuál es tu nombre?");
            nombre_user = menu.next();

            while (jugando) {

                switch (ronda) {
                    case 1 -> {
                        PreguntasRonda1 ronda1 = new PreguntasRonda1();
                        jugando = ronda1.ejecutar();
                    }
                    case 2 -> {
                        PreguntasRonda2 ronda2 = new PreguntasRonda2();
                        jugando = ronda2.ejecutar();
                    }
                    case 3 -> {
                        PreguntasRonda3 ronda3 = new PreguntasRonda3();
                        jugando = ronda3.ejecutar();
                    }
                    case 4 -> {
                        PreguntasRonda4 ronda4 = new PreguntasRonda4();
                        jugando = ronda4.ejecutar();
                    }
                    case 5 -> {
                        PreguntasRonda5 ronda5 = new PreguntasRonda5();
                        jugando = ronda5.ejecutar();
                    }
                    default ->
                        jugando = false;
                }

            }
            
            System.out.println("Juego termidado, puntaje final: " + puntos + "\n\n\n");
            Usuario usuario = new Usuario(nombre_user, puntos);
            
            //Creamos un flijo de datos para guardar el objeto usuario en el escritorio
            ObjectOutputStream escribirDatos = new ObjectOutputStream(new FileOutputStream("/home/david/Escritorio/Usuario.txt"));
            escribirDatos.writeObject(usuario);
            escribirDatos.close();

            // Se imprime los datos del usuario anterior que se leen al inicio del try
            System.out.println("El ultimo puntaje fue de " + usuarioRecuperado.getNombre() + " con: "
                    + usuarioRecuperado.getPuntos() + " puntos");
            
        } catch (Exception e) {

            System.out.println("Error al ejecutar el programa");

        } // fin try-catch

    } //Fin main

} // fin clase

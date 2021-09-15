package com.sofka.preguntas;

import com.sofka.main.Main;
import java.util.Scanner;

public class Pregunta {

    //declaramos las variables que contienen las preguntas y respuestas
    static String pregunta1, pregunta2, pregunta3, pregunta4, pregunta5;
    static char respuesta1, respuesta2, respuesta3, respuesta4, respuesta5;
    // numero aleatorio para obtener la pregunta
    int numero = (int) (Math.random() * 5 + 1);

    // metodo para obtener una pregunta aleatoria
    public  String getPregunta() {

        switch (numero) {
            case 1 -> {
                return pregunta1;
            }
            case 2 -> {
                return pregunta2;
            }
            case 3 -> {
                return pregunta3;
            }
            case 4 -> {
                return pregunta4;
            }
            case 5 -> {
                return pregunta5;
            }
            default -> {
            }
        } // fin switch

        return null;

    } // fin metodo getPregunta

    
    // metodo para combrobar si una respuesta es correcta o no
    public boolean comprobarPregunta() {

        // scanner para tomar la respuesta a la pregunta
        Scanner scanner = new Scanner(System.in);
        // variable para guardar la resupuesta
        char respuesta = scanner.next().toLowerCase().charAt(0);

        // se evalua con el mismo numero aleatorio en que pregunta se está
        switch (numero) {
            case 1 -> {
                if (respuesta == respuesta1) {
                    System.out.println("Respuesta correcta. +10 puntos\n");
                    Main.puntos += 10;
                    return true;
                } else {
                    System.out.println("Respuesta incorrecta, game over\n");
                    return false;
                }
            }

            case 2 -> {
                if (respuesta == respuesta2) {
                    System.out.println("Respuesta correcta. +10 puntos\n");
                    return true;
                } else {
                    System.out.println("Respuesta incorrecta, game over\n");
                    return false;
                }
            }

            case 3 -> {
                if (respuesta == respuesta3) {
                    System.out.println("Respuesta correcta. +10 puntos\n");
                    return true;
                } else {
                    System.out.println("Respuesta incorrecta, game over\n");
                    return false;
                }
            }

            case 4 -> {
                if (respuesta == respuesta4) {
                    System.out.println("Respuesta correcta. +10 puntos\n");
                    return true;
                } else {
                    System.out.println("Respuesta incorrecta, game over\n");
                    return false;
                }
            }

            case 5 -> {
                if (respuesta == respuesta5) {
                    System.out.println("Respuesta correcta. +10 puntos\n");
                    return true;
                } else {
                    System.out.println("Respuesta incorrecta, game over\n");
                    return false;
                }
            }
        }

        return false;

    } // fin metodo comprobarPregunta

} // fin clase

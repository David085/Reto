package com.sofka.main;

import com.sofka.preguntas.PreguntasRonda1;
import com.sofka.preguntas.PreguntasRonda2;
import com.sofka.usuario.Usuario;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;



public class Main {

    public static int puntos = 0, ronda = 1;
    
    public static void main(String[] args) {
        
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
            
            respuesta_menu = menu.next().toLowerCase().charAt(0); // toma el primer caracter de un string y lo convierte en minuscula           
            
            if (respuesta_menu != 's' && respuesta_menu != 'n') {  
                System.out.println("Respuesta incorrecta");
                System.exit(0);
            } else if  (respuesta_menu == 'n'){
                System.out.println("Suerte");
                System.exit(0);
            }
            
            System.out.println("\nCuál es tu nombre?");
            nombre_user = menu.next();
            Usuario usuario = new Usuario(nombre_user, puntos);
            
            while(jugando){
                
                switch(ronda){
                    case 1:
                        PreguntasRonda1 ronda1 = new PreguntasRonda1();
                        jugando = ronda1.ejecutar();
                        break;
                    case 2:
                        PreguntasRonda2 ronda2 = new PreguntasRonda2();
                        jugando = ronda2.ejecutar();
                        break;
                    default:
                        jugando = false;
                        break;
                }
                
            }
            System.out.println(puntos);
            ObjectOutputStream escribirDatos = new ObjectOutputStream(new FileOutputStream("/home/david/Escritorio/Usuario.txt"));
            escribirDatos.writeObject(usuario);
            escribirDatos.close();
            
        } catch (Exception e) {
            
            System.out.println("Error al ejecutar el programa");
            
        } // fin try-catch
       
    } //Fin main
    
} // fin clase

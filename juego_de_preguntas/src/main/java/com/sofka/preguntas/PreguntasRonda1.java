package com.sofka.preguntas;

public class PreguntasRonda1 extends Pregunta {

    

    public boolean ejecutar() {
        pregunta1 = "\n¿Cuál es la capital de Estados Unidos?\n"
                + "a. Washington\n"
                + "b. Los Angeles\n"
                + "c. New York\n"
                + "d. Miami";
        respuesta1 = 'a';
        
        pregunta2 = "\n¿Cuál es la capital de Colombia?\n"
                + "a. Cali\n"
                + "b. Bogotá\n"
                + "c. Medellín\n"
                + "d. Cartagena";
        respuesta2 = 'b';
        
        pregunta3 = "\n¿Cuál es la capital de México?\n"
                + "a. Acapulco\n"
                + "b. Guadalajara\n"
                + "c. Ciudad de México\n"
                + "d. Puebla";
        respuesta3 = 'c';
        
        pregunta4 = "\n¿Cuál es la capital de Canadá?\n"
                + "a. Vancouver\n"
                + "b. Montreal\n"
                + "c. Toronto\n"
                + "d. Ottawa";
        respuesta4 = 'd';
        
        pregunta5 = "\n¿Cuál es la capital de España?\n"
                + "a. Madrid\n"
                + "b. Barcelona\n"
                + "c. Valencia\n"
                + "d. Sevilla";
        respuesta5 = 'a';
        
        System.out.println(super.getPregunta());
        return super.comprobarPregunta();
        
    } // fin metodo ejecutar

} // fin clase

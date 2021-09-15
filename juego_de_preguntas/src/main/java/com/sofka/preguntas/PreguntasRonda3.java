package com.sofka.preguntas;

public class PreguntasRonda3 extends Pregunta {

    

    public boolean ejecutar() {
        pregunta1 = "\n¿Cuál es la capital de Australia?\n"
                + "a. Canberra\n"
                + "b. Melbourne\n"
                + "c. Sídney\n"
                + "d. Adelaide";
        respuesta1 = 'a';
        
        pregunta2 = "\n¿Cuál es la capital de Filipinas?\n"
                + "a. Dávao\n"
                + "b. Zamboanga\n"
                + "c. Ciudad Quezon\n"
                + "d. Manila";
        respuesta2 = 'd';
        
        pregunta3 = "\n¿Cuál es la capital de India?\n"
                + "a. Nueva Delhi\n"
                + "b. Bombay\n"
                + "c. Agra\n"
                + "d. Jaipur";
        respuesta3 = 'a';
        
        pregunta4 = "\n¿Cuál es la capital de China?\n"
                + "a. Shanghái\n"
                + "b. Pekín\n"
                + "c. Hong Kong\n"
                + "d. Wuhan";
        respuesta4 = 'b';
        
        pregunta5 = "\n¿Cuál es la capital de Egipto?\n"
                + "a. Alejandría\n"
                + "b. Lúxor\n"
                + "c. El Cairo\n"
                + "d. Guiza";
        respuesta5 = 'c';
       
        System.out.println(super.getPregunta());
        return super.comprobarPregunta();
        
    } // fin metodo ejecutar

} // fin clase

package com.sofka.preguntas;

public class PreguntasRonda5 extends Pregunta {

    

    public boolean ejecutar() {
        pregunta1 = "\n¿Cuál es la capital de Nauru?\n"
                + "a. Yaren\n"
                + "b. Denigomodu\n"
                + "c. Yaren\n"
                + "d. Ijuw";
        respuesta1 = 'a';
        
        pregunta2 = "\n¿Cuál es la capital de Tayikistán?\n"
                + "a. Dusambé\n"
                + "b. Istaravshan\n"
                + "c. Qurghonteppa\n"
                + "d. Kulob";
        respuesta2 = 'a';
        
        pregunta3 = "\n¿Cuál es la capital de Baréin?\n"
                + "a. Al Muharraq\n"
                + "b. Madinat Hamad\n"
                + "c. Juffair\n"
                + "d. Manama";
        respuesta3 = 'd';
        
        pregunta4 = "\n¿Cuál es la capital de Gabón?\n"
                + "a. Oyem\n"
                + "b. Libreville\n"
                + "c. Tchibanga\n"
                + "d. Koulamoutou";
        respuesta4 = 'b';
        
        pregunta5 = "\n¿Cuál es la capital de Bosnia y Herzegovina?\n"
                + "a. Tuzla\n"
                + "b. Mostar\n"
                + "c. Sarajevo\n"
                + "d. Bania Luka";
        respuesta5 = 'c';
        
        System.out.println(super.getPregunta());
        return super.comprobarPregunta();
        
    } // fin metodo ejecutar

} // fin clase


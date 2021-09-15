package com.sofka.preguntas;

public class PreguntasRonda4 extends Pregunta {

    

    public boolean ejecutar() {
        pregunta1 = "\n¿Cuál es la capital de Surinam?\n"
                + "a. Nieuw Nickerie\n"
                + "b. Paramaribo\n"
                + "c. Albina\n"
                + "d. Lelydorp";
        respuesta1 = 'b';
        
        pregunta2 = "\n¿Cuál es la capital de Marruecos?\n"
                + "a. Rabat\n"
                + "b. Fez\n"
                + "c. Tánger\n"
                + "d. Esauira";
        respuesta2 = 'a';
        
        pregunta3 = "\n¿Cuál es la capital de Serbia?\n"
                + "a. Subótica\n"
                + "b. Kragujevac\n"
                + "c. Belgrado\n"
                + "d. Novi Pazar";
        respuesta3 = 'c';
        
        pregunta4 = "\n¿Cuál es la capital de Papúa Nueva Guinea?\n"
                + "a. Puerto Moresby\n"
                + "b. Lae\n"
                + "c. Madang\n"
                + "d. Alotau";
        respuesta4 = 'a';
        
        pregunta5 = "\n¿Cuál es la capital de Irak?\n"
                + "a. Ninaua\n"
                + "b. Kirkuk\n"
                + "c. Mosul\n"
                + "d. Bagdad";
        respuesta5 = 'd';
        
        System.out.println(super.getPregunta());
        return super.comprobarPregunta();
        
    } // fin metodo ejecutar

} // fin clase


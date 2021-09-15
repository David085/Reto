package com.sofka.preguntas;



public class PreguntasRonda2 extends Pregunta {

    

    public boolean ejecutar() {
        pregunta1 = "\n¿Cuál es la capital de Perú?\n"
                + "a. Trujillo\n"
                + "b. Arequipa\n"
                + "c. Lima\n"
                + "d. Cusco";
        respuesta1 = 'c';
        
        pregunta2 = "\n¿Cuál es la capital de Francia?\n"
                + "a. París\n"
                + "b. Toulouse\n"
                + "c. Marsella\n"
                + "d. Lyon";
        respuesta2 = 'a';
        
        pregunta3 = "\n¿Cuál es la capital de Argentina?\n"
                + "a. Rosario\n"
                + "b. Mar del Plata\n"
                + "c. Córdoba\n"
                + "d. Buenos Aires";
        respuesta3 = 'd';
        
        pregunta4 = "\n¿Cuál es la capital de Rusia?\n"
                + "a. Moscú\n"
                + "b. San Petesburgo\n"
                + "c. Kazán\n"
                + "d. Novosibirsk";
        respuesta4 = 'a';
        
        pregunta5 = "\n¿Cuál es la capital de República Dominicana?\n"
                + "a. Santiago de los Caballeros\n"
                + "b. Santo Domingo\n"
                + "c. Puerto Plata\n"
                + "d. La Romana";
        respuesta5 = 'b';
        
        System.out.println(super.getPregunta());
        return super.comprobarPregunta();
        
    } // fin metodo ejecutar

} // fin clase


package com.sofka.preguntas;

public class PreguntasRonda1 extends Pregunta {

    

    public void ejecutar() {
        super.pregunta1 = "Pregunta 1 ronda 1";
        super.pregunta2 = "Pregunta 2 ronda 1";
        super.pregunta3 = "Pregunta 3 ronda 1";
        super.pregunta4 = "Pregunta 4 ronda 1";
        super.pregunta5 = "Pregunta 5 ronda 1";
        super.getPregunta();
        super.comprobarPregunta();
    }

    /*
    public Pregunta pregunta_final() {
        
        try {
            
            int numero_pregunta = (int) (Math.random() * 4 + 1);
            
            switch (numero_pregunta) {
                case 1 -> {
                    Pregunta pregunta1 = new Pregunta();
                    pregunta1.texto = "pregunta 1 ronda 1";
                    pregunta1.respuesta = 'c';
                    return pregunta1;
                }

                case 2 -> {
                    Pregunta pregunta2 = new Pregunta();
                    pregunta2.texto = "pregunta 2 ronda 1";
                    pregunta2.respuesta = 'a';
                    return pregunta2;
                }
                case 3 -> {
                    Pregunta pregunta3 = new Pregunta();
                    pregunta3.texto = "pregunta 3 ronda 1";
                    pregunta3.respuesta = 'a';
                    return pregunta3;
                }
                case 4 -> {
                    Pregunta pregunta4 = new Pregunta();
                    pregunta4.texto = "pregunta 4 ronda 1";
                    pregunta4.respuesta = 'b';
                    return pregunta4;
                }
                case 5 -> {
                    Pregunta pregunta5 = new Pregunta();
                    pregunta5.texto = "pregunta 5 ronda 1";
                    pregunta5.respuesta = 'd';
                    return pregunta5;
                }
                default -> System.out.println("Error al generar la pregunta");
                
            } // fin switch
            
        } catch (Exception e) {
        } // fin try catch
        
        return null;
        
    } // fin metodo pregunta */
} // fin clase

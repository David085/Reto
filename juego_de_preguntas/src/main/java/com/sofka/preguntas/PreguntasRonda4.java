package com.sofka.preguntas;

public class PreguntasRonda4 {

    public Pregunta pregunta_final() {
        
        try {
            
            int numero_pregunta = (int) (Math.random() * 4 + 1);
            
            switch (numero_pregunta) {
                case 1 -> {
                    Pregunta pregunta1 = new Pregunta();
                    pregunta1.texto = "pregunta 1 ronda 4";
                    pregunta1.respuesta = 'a';
                    return pregunta1;
                }

                case 2 -> {
                    Pregunta pregunta2 = new Pregunta();
                    pregunta2.texto = "pregunta 2 ronda 4";
                    pregunta2.respuesta = 'b';
                    return pregunta2;
                }
                case 3 -> {
                    Pregunta pregunta3 = new Pregunta();
                    pregunta3.texto = "pregunta 3 ronda 4";
                    pregunta3.respuesta = 'c';
                    return pregunta3;
                }
                case 4 -> {
                    Pregunta pregunta4 = new Pregunta();
                    pregunta4.texto = "pregunta 4 ronda 4";
                    pregunta4.respuesta = 'd';
                    return pregunta4;
                }
                case 5 -> {
                    Pregunta pregunta5 = new Pregunta();
                    pregunta5.texto = "pregunta 5 ronda 4";
                    pregunta5.respuesta = 'a';
                    return pregunta5;
                }
                default -> System.out.println("Error al generar la pregunta");
                
            } // fin switch
            
        } catch (Exception e) {
        } // fin try catch
        
        return null;
        
    } // fin metodo pregunta
    
} // fin clase

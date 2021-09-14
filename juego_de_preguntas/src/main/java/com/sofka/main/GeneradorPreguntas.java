package com.sofka.main;

import com.sofka.preguntas.Pregunta;
import com.sofka.preguntas.PreguntasRonda1;



public class GeneradorPreguntas {
    
    public Pregunta generador(int ronda){
        
        
        switch (ronda) {
            case 1:
                PreguntasRonda1 preguntaR1 = new PreguntasRonda1();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                break;
        }
                
        return null;
        
    }
    
} // fin clase

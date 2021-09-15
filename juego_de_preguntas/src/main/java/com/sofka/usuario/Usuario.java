package com.sofka.usuario;

import java.io.Serializable;

public class Usuario implements Serializable{
    
    String nombre;
    int puntos;
    
    public Usuario(String nombre, int puntos){
        
        this.nombre = nombre;
        this.puntos = puntos;
        
    } // fin constructor
    
} // fin clase

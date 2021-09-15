package com.sofka.usuario;

import java.io.Serializable;

public class Usuario implements Serializable{
    
     String nombre;
     int puntos;
    
    public Usuario(String n, int p){
  
         nombre = n;
         puntos = p;
        
    } // fin constructor
    
    public String getNombre(){
        return nombre;
    }
    
    public int getPuntos(){
        return puntos;
    }
    
} // fin clase

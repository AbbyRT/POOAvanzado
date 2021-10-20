package com.generation;

public class Persona {
    //no hay conflicto si hay otra clase con el mismo nombre
    //si esta en otro paquete
    //modificador de acceso privado solo tiene acceso desde la mismca clase
   private String nombre;
   private int edad;
    private void saludar(){ //los modificadores de acceso nos indican desde donde son accesibles
        System.out.println("Hola k ase "+this.nombre);
    }
}

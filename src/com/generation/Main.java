package com.generation;

import com.generation.banco.CuentaBancaria;
import com.generation.ejercicio.Person;
import com.generation.paquete2.Animal;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Persona persona = new Persona();
//        persona.nombre = "Abby"; //indica problemas de acceso si los atributos estan definidos coo privados
//        persona.edad = 25;
//        Animal animal = new Animal(); //se puede crear objeto pero no acceder a sus atributoso definirlos
//        animal.nombre = "Pájaro"; //no hay acceso

        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNombre("Abby");
        cuenta.setClave("ABC-120896");
        cuenta.setSaldo(1000000000);
//        cuenta.mostrarNombre();
//        cuenta.mostrarSaldo();

        //gracias a encapsular codigo se puede validar ciertos daots
        // 1) los atributos deben ser privados

        //tarea: aplicar el principio de encapsulamiento e imprimir los sig datis
//        Person person= new Person("Santiago", 33, "102045455");
//        System.out.println( "Name: " + person.name);
//        System.out.println( "Age: "+ person.age);
//        System.out.println( "Id: " +  person.id);
        Person person = new Person();
        person.setName("Santiago");
        person.setAge(33);
        person.setId("102045455");

        System.out.println("Name: "+(person.getName())); //opcion 1
        System.out.println("Age: "+(person.getAge()));
        System.out.println("Id: "+(person.getId()));
        //opcion 2 de imprimir
        //person.mostrarInfo();
    }
}

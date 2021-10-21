package com.generation;

import com.generation.banco.CuentaBancaria;
import com.generation.ejercicio.Person;
import com.generation.paquete2.Animal;

public class Main {
    public static int numerador = 10;  //estos son atributos
    public static int denominador = 0;
    public static float division;

    public static void main(String[] args) { //este es un método
        //la diferencia entre los errores y las excepciones es que
        //los errores no dependen de nuestro codigo, las excepciones si
        //las excepciones engloba todas las subclases
        //es posible anidar los catch
        //si se anidan tiene que ir de lo especifico a lo general
        //por ejemplo, primero nullpointer exception y despues exception
        System.out.println("antes de la division");
        try { //solo se puede atrapar 1 excepcion
            division = numerador/denominador;
        }catch (NullPointerException ex){
            System.out.println("Nullpointer");
            System.out.println(ex.getMessage());

        } catch (Exception ex){
            //en los parentesis sed indica que vamos a "capturar" una excepcion
            //se guarda en la variable ex
            System.out.println("Exception");
            System.out.println( ex.getMessage()); //se rescata porque fallo el codigo
        } finally {
            //este bloque siempre se ejecuta
            //es opcional, puede estar o no
            System.out.println("soy finally :v");
        }

        System.out.println("despues de la division");
	// write your code here
//        Persona persona = new Persona();
//        persona.nombre = "Abby"; //indica problemas de acceso si los atributos estan definidos coo privados
//        persona.edad = 25;
//        Animal animal = new Animal(); //se puede crear objeto pero no acceder a sus atributoso definirlos
//        animal.nombre = "Pájaro"; //no hay acceso

//        CuentaBancaria cuenta = new CuentaBancaria();
//        cuenta.setNombre("Abby");
//        cuenta.setClave("ABC-120896");
//        cuenta.setSaldo(1000000000);

//        cuenta.mostrarNombre();
//        cuenta.mostrarSaldo();

        //gracias a encapsular codigo se puede validar ciertos daots
        // 1) los atributos deben ser privados

        //tarea: aplicar el principio de encapsulamiento e imprimir los sig datis
//        Person person= new Person("Santiago", 33, "102045455");
//        System.out.println( "Name: " + person.name);
//        System.out.println( "Age: "+ person.age);
////        System.out.println( "Id: " +  person.id);
//        Person person = new Person();
//        person.setName("Santiago");
//        person.setAge(33);
//        person.setId("102045455");
//
//        System.out.println("Name: "+(person.getName())); //opcion 1
//        System.out.println("Age: "+(person.getAge()));
//        System.out.println("Id: "+(person.getId()));
        //opcion 2 de imprimir
        //person.mostrarInfo();

    }
}

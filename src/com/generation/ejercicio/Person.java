package com.generation.ejercicio;

public class Person {
    //tarea: aplicar el principio de encapsulamiento
    //volver los atributos (constructores)privados
    private String name;

    private int age;

    private String id;
    //constructor 1
    public Person(){

    }
    //constructor con esos parametros
    public Person( String name, int age, String id ){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    //declarar constructor vacio y otro con atributos

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void mostrarInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Id: "+this.id);
    }
}

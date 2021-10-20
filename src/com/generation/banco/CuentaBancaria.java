package com.generation.banco;

public class CuentaBancaria {
    private String nombre; //los atributos se vuelven privados, solo se peuden acceder a ellos con metodoso de la misma clase
    private String clave;
    private float saldo;

//    public String getNombre() { //para que se pueda MOSTRAR la info
//        return this.nombre;
//    }
//    public String getClave(){
//        return this.clave;
//    }
//    public float getSaldo(){
//        return this.saldo;
//    }
    //para crearlos de manera no manual: click derecho en fondo de codigo, seleccionar generate ->
    //getter & setter, para seleccionar todos: control y seleccioanr o shift alt


    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setClave(String clave){
        this.clave=clave;
    }
    public void setSaldo(float saldo){ //para validar datos
        if(saldo<0){
            this.saldo= 0;
        }else{
            this.saldo =saldo;
        }
    }

    public void mostrarSaldo(){
        System.out.println("Su saldo es de "+ this.saldo);
    }
    public void mostrarNombre(){
        System.out.println(this.nombre);
    }

}

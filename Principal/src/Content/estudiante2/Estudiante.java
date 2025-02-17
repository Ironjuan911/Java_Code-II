/*
Crear una clase llamada Estudiante que tenga cuatro atributos de tipo doublé; estos atributos
son uno por cada una de las notas del semestre. Adicionalmente se deben tener dos atributos
de tipo cadena uno para el código y otro para el nombre del estudiante. debe tener un
método sin parámetros que haga el cálculo de la definitiva y otro sobrecargado con
parámetros que reciba las notas y también haga el cálculo de la definitiva. hacer un método
imprimir que muestre por pantalla el valor de todos los atributos de la clase. además un
método imprimir sobrecargado que reciba un entero de manera que cuando el valor del
parámetro es 1, imprime solo el código y nombre y en cualquier otro caso imprime todos los
valores.
 */


package Content.estudiante2;

import iron_package.F_System;

public class Estudiante {

    private String codigo;
    private String nombre;

    private float parcial1;
    private float parcial2;
    private float nota3;
    private float parcialFinal;

    // Encapsulamiento Start

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getParcial1() {
        return parcial1;
    }

    public void setParcial1(float parcial1) {
        this.parcial1 = parcial1;
    }

    public float getParcial2() {
        return parcial2;
    }

    public void setParcial2(float parcial2) {
        this.parcial2 = parcial2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getParcialFinal() {
        return parcialFinal;
    }

    public void setParcialFinal(float parcialFinal) {
        this.parcialFinal = parcialFinal;
    }

    // Encapsulamiento End

    public float calcularDefinitiva(){
        return calcularDefinitiva(parcial1, parcial2, nota3, parcialFinal);
    }

    public float calcularDefinitiva(float parcial1, float parcial2, float nota3, float parcialFinal){
        return (parcial1 + parcial2 + nota3)*(70.01f/300.0f) + parcialFinal*(0.3f);
    }

    public void Imprimir(){
        F_System.clean_terminal();
        System.out.println(
            "Codigo: " + codigo + "\n" +
            "Nombre: " + nombre + "\n" +
            "Parcial 1: " + parcial1 + "\n" +
            "Parcial 2: " + parcial2 + "\n" +
            "Nota 3: " + nota3 + "\n" +
            "Parcial Final: " + parcialFinal + "\n" +
            "Definitiva: " + calcularDefinitiva()
        );

    }

    public void Imprimir(int x){
        F_System.clean_terminal();

        switch (x) {
            case 1 -> {
                System.out.println(
                    "Codigo: " + codigo + "\n" +
                    "Nombre: " + nombre
                );
            }
        
            default -> {
                System.out.println("Comando no reconocido");
            }

        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

public class Employee extends Person {
    private double salary;

    // Sobrecarga
    public Employee(int id, String name) {
        this(id, name, 0.0);
    }
    public Employee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String getDetails() {
        return String.format("ID: %d, Nombre: %s, Salario: %.2f",
            getId(), getName(), salary);
    }
}

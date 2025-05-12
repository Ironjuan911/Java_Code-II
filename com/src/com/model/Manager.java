/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

public class Manager extends Employee {
    private String department;

    public Manager(int id, String name, double salary, String department) {
        super(id, name, salary);
        this.department = department;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public String getDetails() {
        return super.getDetails() + String.format(", Departamento: %s", department);
    }
}

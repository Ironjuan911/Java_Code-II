/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.business;

import com.data.EmployeeStorage;
import com.model.Person;
import com.model.Employee;
import java.util.List;
import java.util.ArrayList;

public class EmployeeManager {
    private EmployeeStorage storage = new EmployeeStorage();
    private int nextId = 1;

    // Añade Employee; podrías especializar para Manager si lo deseas
    public int addEmployee(String name, double salary) {
        Person p = new Employee(nextId++, name, salary);
        storage.save(p);
        return p.getId();
    }

    public List<Person> getAllEmployees() {
        return new ArrayList<>(storage.getAll().values());
    }
}

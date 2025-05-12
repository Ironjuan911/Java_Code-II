/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.data;

import com.model.Person;
import java.util.HashMap;
import java.util.Map;

public class EmployeeStorage {
    private Map<Integer, Person> storage = new HashMap<>();

    public void save(Person p) {
        storage.put(p.getId(), p);
    }

    public Map<Integer, Person> getAll() {
        return storage;
    }
}

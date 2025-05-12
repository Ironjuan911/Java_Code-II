/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.presentation;

import com.business.EmployeeManager;
import com.model.InvalidInputException;

/**
 *
 * @author USUARIO
 */
public class Mediator {
    private AddEmployeePanel addPanel;
    private EmployeeListPanel listPanel;
    private EmployeeManager manager = new EmployeeManager();

    // Métodos para "registrar" los paneles
    public void setAddPanel(AddEmployeePanel p) {
        this.addPanel = p;
    }
    public void setListPanel(EmployeeListPanel p) {
        this.listPanel = p;
    }

    // Lógica de negocio delegada
    public void addEmployee(String name, String salaryText) throws InvalidInputException {
        if (name.isEmpty() || salaryText.isEmpty()) {
            throw new InvalidInputException("Nombre o salario vacío.");
        }
        try {
            double salary = Double.parseDouble(salaryText);
            manager.addEmployee(name, salary);
            listPanel.updateList(manager.getAllEmployees());
            addPanel.clearFields();
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Salario no es un número válido.");
        }
    }    
}

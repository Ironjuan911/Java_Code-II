/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.presentation;

/**
 *
 * @author USUARIO
 */
import javax.swing.*;
import com.model.InvalidInputException;

public class AddEmployeePanel extends JPanel {
    private Mediator mediator;
    private JTextField nameField = new JTextField(10);
    private JTextField salaryField = new JTextField(10);
    private JButton addButton = new JButton("Agregar");

    public AddEmployeePanel(Mediator mediator) {
        this.mediator = mediator;
        mediator.setAddPanel(this);

        setBorder(BorderFactory.createTitledBorder("Agregar Persona"));
        add(new JLabel("Nombre:"));   add(nameField);
        add(new JLabel("Salario:"));  add(salaryField);
        add(addButton);

        addButton.addActionListener(e -> {
            try {
                mediator.addEmployee(nameField.getText(), salaryField.getText());
            } catch (InvalidInputException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Error de entrada", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public void clearFields() {
        nameField.setText("");
        salaryField.setText("");
    }
}

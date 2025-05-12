/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.presentation;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Gestión de Personas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Mediator mediator = new Mediator();
        AddEmployeePanel addPanel = new AddEmployeePanel(mediator);
        EmployeeListPanel listPanel = new EmployeeListPanel(mediator);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(addPanel);
        add(listPanel);
        pack();
        setLocationRelativeTo(null);
    }
}

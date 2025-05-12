/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.presentation;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import com.model.Person;

public class EmployeeListPanel extends JPanel {
    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private JList<String> list = new JList<>(listModel);

    public EmployeeListPanel(Mediator mediator) {
        mediator.setListPanel(this);

        setBorder(BorderFactory.createTitledBorder("Lista de Personas"));
        setLayout(new BorderLayout());
        add(new JScrollPane(list), BorderLayout.CENTER);
    }

    public void updateList(List<Person> persons) {
        listModel.clear();
        for (Person p : persons) {
            listModel.addElement(p.getDetails());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;

public class MainScreen extends JFrame {

    private GridBagConstraints constraints;
    private JLabel lblTitle;
    private JLabel lblVehicleWeight;
    private JLabel lblRegistration;

    private JTextField txtWeight;
    private JTextField txtRegistration;

    private JButton btnAdd;
    private JButton btnRemove;
    private JButton btnCalculate;

    public MainScreen() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        initComponents();
        constraints = new GridBagConstraints();
        layoutComponents();
    }

    public void initComponents() {
        lblTitle = new JLabel("Vehicle Management System");
        lblRegistration = new JLabel("Vehicle Registration Number");
        lblVehicleWeight = new JLabel("Vehicle Weight");

        txtWeight = new JTextField();
        txtRegistration = new JTextField();
        btnAdd = new JButton("Add Vehicle");
        btnRemove = new JButton("Remove Vehicle");
        btnCalculate = new JButton("Calculate Price");
    }

    public void layoutComponents() {
        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        this.add(lblTitle, constraints);
        constraints.gridy = 1;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(lblRegistration, constraints);
        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtRegistration, constraints);
        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 2;
        constraints.gridx = 0;
        this.add(lblVehicleWeight, constraints);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        this.add(txtWeight, constraints);
        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 3;
        constraints.gridx = 0;
        this.add(btnAdd, constraints);
        constraints.gridx = 1;
        this.add(btnCalculate, constraints);
        constraints.gridx = 2;
        this.add(btnRemove, constraints);
    }

}

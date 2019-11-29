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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class MainScreen extends JFrame implements ActionListener {

    private GridBagConstraints constraints;
    private JLabel lblTitle;
    private JLabel lblVehicleWeight;
    private JLabel lblRegistration;

    private JTextField txtWeight;
    private JTextField txtRegistration;

    private JButton btnAdd;
    private JButton btnRemove;
    private JButton btnCalculate;

    private Bridge bridge;

    public MainScreen() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        initComponents();
        bridge =new Bridge(30000,20);
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
        btnAdd.addActionListener(this);
        btnRemove = new JButton("Remove Vehicle");
        btnRemove.addActionListener(this);
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
@Override
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource().equals(btnAdd)) {
            Vehicle veh = null;
            String id = txtRegistration.getText();
            String weightStr = txtWeight.getText();
            double weight=0;

            try{
            weight = Double.parseDouble(weightStr);
            }catch(Exception ex){
                System.out.println("cannot parse double"+weightStr);
            }
            if(weight<2000){
                veh = new MotorBike(,);
  
            }
            else if(weight>= 2000 && weight <3500){
                veh = new Car(,);
            }
            else{
                veh = new Lorries(,);
            }
            if(bridge.addVehicle(veh)){
                lblStatus.setText("Entry Granted!");
                lblLoad.setText(bridge.addVehicle()+"Kg");
                lblFee.setText(veh.calculateFee()+"£");
            }
            else{
                lblStatus.setText("Access Deenied!");
            }
            
            
        }
        else if(ev.getSource().equals(btnRemove)){
            String reg = txtReg.getText();
                    if(bridge.removeVehicle(reg)){
                        lblStatus.setText("Vehicle Removed");
                        lblLoad.setText(bridge.calcTotalWeight()+"kg");
                        lblFee.setText("-");
                    }
            
            
        }
    }

}


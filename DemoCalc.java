/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author smrit
 */
public class DemoCalc extends Frame implements ActionListener{
    Label lbfn, lbsn, lbadd;
    Button btnadd;
    TextField tfn , tsn,tadd;
    
    Panel p;
    
    public DemoCalc()
    {
        super("APNA CALCULATOR");
        lbfn = new Label("Enter first no");
        lbfn.setBounds(10, 50, 150, 20);
        lbsn = new Label("Enter second no ");
        lbsn.setBounds(10, 70, 150, 20);
        lbadd = new Label("RESULT");
        lbadd.setBounds(10, 90, 150, 20);
        
        
        tfn = new TextField(20);
        tfn.setBounds(175,50, 150,20);
        tsn = new TextField(20);
        tsn.setBounds(175,70, 150,20);
        tadd = new TextField(20);
        tadd.setBounds(175,90, 150,20);
        
        btnadd = new Button("ADD");
        btnadd.setBounds(10, 150, 100, 20);
        p= new Panel(null);
        
        add(p);
        p.add(lbfn); p.add(tfn);
        p.add(lbsn); p.add(tsn);
        p.add(lbadd); p.add(tadd);
        p.add(btnadd);
        
        setSize(800,600);
        setVisible(true);
        p.setBackground(Color.gray);
        btnadd.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ev)
    {
        Object obj = ev.getSource();
        int a, b, rs;
        a = Integer.parseInt(tfn.getText());
        b = Integer.parseInt(tsn.getText());
        
        if(obj == btnadd)
        {
            rs = a+b;
            tadd.setText(String.valueOf(rs));
            
            
        }
    }
    public static void main(String[] args) {
        DemoCalc dc = new DemoCalc();
        
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;


import java.awt.*;
import java.awt.event.*;
public class DemoRadioButton extends Frame implements ItemListener{
    
    CheckboxGroup cg;
    Checkbox chkMale,chkFemale;
    Label lblmsg;
    Panel p1;
    public DemoRadioButton()
    {
        super("DEMO RADIO BUTTON");
        lblmsg=new Label("Example to Check Message on Radio Button Click");
        lblmsg.setBounds(10,50,250,20);
        cg=new CheckboxGroup();
        chkMale=new Checkbox("MALE",cg,true);
        chkMale.setBounds(10,70,70,20);
        chkFemale=new Checkbox("FEMALE",cg,false);
        chkFemale.setBounds(100,70,70,20);
        p1=new Panel(null);
        add(p1);
        p1.add(lblmsg);
        p1.add(chkMale);
        p1.add(chkFemale);
        chkMale.addItemListener(this);
        chkFemale.addItemListener(this);
        p1.setBackground(Color.PINK);
    }
    
    public void itemStateChanged(ItemEvent evt)
    {
        Object obj=evt.getSource();
        Checkbox chk_label;
        if(obj==chkMale)
        {
            p1.setBackground(Color.red);
            chk_label=cg.getSelectedCheckbox();
            lblmsg.setText(chk_label.getLabel());
        }
        else if(obj==chkFemale)
        {
             p1.setBackground(Color.green);
            chk_label=cg.getSelectedCheckbox();
            lblmsg.setText(chk_label.getLabel());
        }        
    }
    
    public static void main(String[] args) {
        DemoRadioButton d=new DemoRadioButton();
        d.setSize(600, 400);
        d.setVisible(true);
        d.setLocation(200, 150);
    }
}

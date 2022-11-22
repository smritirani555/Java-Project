/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.*;

/**
 *
 * @author smrit
 */
public class studentForm extends Frame{
    
    Label lbrn, lbnm, lbadd,lbq, lbsub;
    Button btnok, btncncl;
    TextField trn , tname;
    TextArea tadd;
    Choice c1;
    Checkbox chx1, chx2;
    Panel p;
    
    public studentForm()
    {
        super("STUDENT FORM");
        lbrn = new Label("Enter Roll No");
        lbrn.setBounds(10, 50, 150, 20);
        lbnm = new Label("Enter the Name");
        lbnm.setBounds(10, 70, 150, 20);
        lbadd = new Label("Enter Address");
        lbadd.setBounds(10, 90, 150, 20);
        lbq = new Label("Qualification");
        lbq.setBounds(10, 200, 150, 20);
        lbsub = new Label("Qualification");
        lbsub.setBounds(10, 230, 150, 20);
        
        trn = new TextField(20);
        trn.setBounds(175,50, 150,20);
        tname = new TextField(20);
        tname.setBounds(175,70, 150,20);
        tadd= new TextArea(5,4);
        tadd.setBounds(175, 90, 400, 100);
        
        c1= new Choice();
        c1.add("MCA");
        c1.add("BCA");
        c1.add("BTECH");
        c1.add("MTECH");
        c1.add("BSC");
        c1.add("MSC");
        c1.add("BBA");
        
        c1.setBounds(175, 200, 150, 20);
        
        chx1= new Checkbox("JAVA");
        chx1.setBounds(175, 230, 150, 20);
        chx2 = new Checkbox("C++");
        chx2.setBounds(175,260, 150, 20);
        
        btnok = new Button("ok");
        btnok.setBounds(175,300,150,20);
        btncncl = new Button("Cancel");
        btncncl.setBounds(350,300,150,20);
        
        p = new Panel(null);
        add(p);
        p.add(lbrn);p.add(trn);
        p.add(lbnm); p.add(tname);
        p.add(lbadd); p.add(tadd);
        p.add(lbq); p.add(c1);
        p.add(lbsub); p.add(chx1); p.add(chx2);
        p.add(btnok); p.add(btncncl);
        
       setSize(800,600);
       setVisible(true);
       
        p.setBackground(Color.yellow);
        
        
    }
    public static void main(String[] args) {
         studentForm  sf = new studentForm();
        
    }
    
}

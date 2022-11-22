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
public class DemoChoice extends Frame implements ItemListener{
    Choice ch;
    Panel p;
    
    public DemoChoice()
    {
       super("Demo Choice in AWT");
       ch = new Choice();
       ch.add("RED");
       ch.add("GREEN");
       ch.add("YELLOW");
       ch.add("BLUE");
       
       p =new Panel(null);
       add(p);

       p.add(ch);
       ch.addItemListener(this);
       p.setBackground(Color.pink);
    }
    public void itemStateChanged(ItemEvent ev)
    {
        Object obj = ev.getSource();
        
        if(ch==obj)
        {
            String str= ch.getSelectedItem();
            if(str.equals("RED"))
            {
               p.setBackground(Color.red);
            }
            else if(str.equals("GREEN"))
            {
               p.setBackground(Color.green);
            }
            else if(str.equals("YELLOW"))
            {
               p.setBackground(Color.yellow);
            }
            else if(str.equals("BLUE"))
            {
               p.setBackground(Color.blue);
            }
            
        }
    }
    public static void main(String[] args) {
        DemoChoice dc = new DemoChoice();
        dc.setSize(600, 400);
        dc.setLocation(100, 100);
        dc.setVisible(true);
    }
    
    
}

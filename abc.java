/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.applet.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author smrit
 */
public class abc extends Applet {

    public void paint(Graphics g)
    {
       // g.setColor(Color.black);
      g.setColor(Color.yellow);
      g.fillOval(20, 40, 250,250);
      
      g.setColor(Color.BLACK);
      g.fillOval(50,100,40, 60);
      g.fillOval(185,100,40,60);
      
      for(int i=0;i<=1000000;i++)
      {
          g.setColor(Color.red);
          g.fillArc(95,156,100,100,0,-180);
          
          g.setColor(Color.green);
          g.fillArc(95,156,100,100,0,-180);
          g.setColor(Color.red);
          g.fillArc(95,156,100,100,0,180);
          
          g.setColor(Color.green);
          g.fillArc(95,156,100,100,0,180);
      }
      
      
    }
    
    
}

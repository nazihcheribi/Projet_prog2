/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_prog2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author nazihcheribi
 */
public class Second extends JPanel implements ActionListener{
    Timer t = new Timer(5, this);
    double x=0, y=0, velX =2, velY=2;
    
    public void paintComponent(Graphics g){
     super.paintComponents(g);
             Graphics2D g2 = (Graphics2D) g;
             Ellipse2D circle = new Ellipse2D.Double(x,y,40,40);
             g2.fill(circle);
             t.start();
   
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (x<0 || x>300)
        {
        velX=-velX;
    }
        if (y<0 || y>300)
        {
        velY=-velY;
    }
        x+= velX;
        y+= velY;
        repaint();
    }
}

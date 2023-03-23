/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_prog2.views;

import com.mycompany.projet_prog2.RouteConnection;
import com.mycompany.projet_prog2.RoutePoint;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JPanel;

/**
 *
 * @author nazihcheribi
 */
public class MapPanel extends JPanel {
    private ArrayList<RoutePoint> routePoints;

    public MapPanel(ArrayList<RoutePoint> routePoints) {
        this.routePoints = routePoints;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        HashSet<RoutePoint> processedPoints = new HashSet<>();

        for (int i = 0; i < routePoints.size(); i++) {
            RoutePoint point = routePoints.get(i);
            
            for (RouteConnection connection : point.getConnections()) {
                RoutePoint destinationPoint = connection.getDestinationPoint();
                
                // Skip point if it was already processed
                if (processedPoints.contains(destinationPoint))
                    continue;
                
                g.setColor(Color.red);
                g.drawLine(point.getX(), 
                        point.getY(), 
                        destinationPoint.getX(), 
                        destinationPoint.getY());
                
                System.out.println("Created segment");
            }
            
            processedPoints.add(point);
        }
    }
}

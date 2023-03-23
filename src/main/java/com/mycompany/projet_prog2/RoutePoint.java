/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_prog2;

import java.util.ArrayList;

/**
 *
 * @author nazihcheribi
 */
public class RoutePoint {
    private int x;
    private int y;
    private ArrayList<RouteConnection> connections;
    private Parking parking;
     
    public RoutePoint(int x, int y, Parking parking) {
        this.x = x;
        this.y = y;
        this.parking = parking;
        this.connections = new ArrayList<>();
    }
    
    public void connect(RoutePoint routePoint){
        RouteConnection connection = new RouteConnection(routePoint);
        this.connections.add(connection);
        routePoint.getConnections().add(connection);
    }
    
    public ArrayList<RouteConnection> getConnections(){
        return connections;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Parking getParking() {
        return parking;
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;
        
        if (obj.getClass() != this.getClass())
            return false;
        
        RoutePoint other = (RoutePoint) obj;
        
        return this.x == other.x && this.y == other.y;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 51 * hash + x;     
        hash = 51 * hash + y;
        return hash;
    }
}

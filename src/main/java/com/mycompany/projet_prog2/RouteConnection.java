/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_prog2;

/**
 *
 * @author nazihcheribi
 */
public class RouteConnection {
    
    private RoutePoint destinationPoint;

    public RouteConnection(RoutePoint destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    public RoutePoint getDestinationPoint() {
        return destinationPoint;
    }
}

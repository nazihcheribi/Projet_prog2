/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_prog2;

/**
 *
 * @author nazihcheribi
 */
public class Parking {
    private int TotalSlots;
    private int AvailableSlots;
    
    public Parking(int TotalSlots, int AvailableSlots){
        this.TotalSlots = TotalSlots;
        this.AvailableSlots = AvailableSlots;
    }

    public int getTotalSlots() {
        return TotalSlots;
    }

    public int getAvailableSlots() {
        return AvailableSlots;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wahyurhy.belajarjavamaven.Abstraction;

/**
 *
 * @author wahyurahayu
 */
public abstract class Kendaraan {
    private String merk;
    
    abstract void nyalakanMesin();
    
    public void matikanMesin() {
        System.out.println("Mesin dimatikan.");
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    
}

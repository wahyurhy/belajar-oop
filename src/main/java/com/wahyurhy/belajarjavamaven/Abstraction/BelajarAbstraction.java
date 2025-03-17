/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wahyurhy.belajarjavamaven.Abstraction;

/**
 *
 * @author wahyurahayu
 */
public class BelajarAbstraction {
    public static void main(String[] args) {
        Kendaraan bus = new Bus();
        bus.setMerk("Volvo");
        String merkBus = bus.getMerk();
        System.out.println("Merk Bus : " + merkBus);
        bus.nyalakanMesin();
        bus.matikanMesin();
    }
}

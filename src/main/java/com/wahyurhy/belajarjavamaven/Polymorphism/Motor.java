/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wahyurhy.belajarjavamaven.Polymorphism;

/**
 *
 * @author wahyurahayu
 */
public class Motor implements Kendaraan {

    @Override
    public void berjalan() {
        System.out.println("Motor bisa berjalan.");
    }

    @Override
    public void diperbaiki() {
        System.out.println("Motor bisa diperbaiki.");
    }
    
    
}

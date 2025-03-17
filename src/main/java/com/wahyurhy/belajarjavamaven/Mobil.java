/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wahyurhy.belajarjavamaven;

/**
 *
 * @author wahyurahayu
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merk) {
        super(merk);
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }
    
    // Polymorphism Runtime
    @Override
    public void info() {
        System.out.println("Ini adalah mobil.");
        System.out.println("Merk: " + merk);
        System.out.println("Jumlah Pintu: " + this.jumlahPintu);
    }
}
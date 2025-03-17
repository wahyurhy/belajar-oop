/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wahyurhy.belajarjavamaven;

/**
 *
 * @author wahyurahayu
 */
public class BelajarPolymorphism {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        int hasilWith2Params = kalkulator.tambah(2, 3);
        int hasilWIth3Params = kalkulator.tambah(2, 5, 6);
        System.out.println("Hasil = " + hasilWith2Params);
        System.out.println("Hasil = " + hasilWIth3Params);
        
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();
        
        kucing.bersuara();
        anjing.bersuara();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.wahyurhy.belajarjavamaven;

import java.util.Scanner;

/**
 *
 * @author wahyurahayu
 */
public class BelajarEncaptulation {

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Wahyu", "Informatika", 22);
        
        System.out.println("========= BEFORE =========");
        
        System.out.println("Halo, nama saya " + mahasiswa.getNama() + 
                ", saya berkuliah dengan jurusan " + mahasiswa.getJurusan() + 
                ", sekarang usia saya " + mahasiswa.getUsia() + " Tahun.");
        
        mahasiswa.setNama("Wahyu Rahayu");
        mahasiswa.setJurusan("Sistem Informasi");
        mahasiswa.setUsia(23);
        
        System.out.println("========= AFTER =========");
        
        System.out.println("Halo, nama saya " + mahasiswa.getNama() + 
                ", saya berkuliah dengan jurusan " + mahasiswa.getJurusan() + 
                ", sekarang usia saya " + mahasiswa.getUsia() + " Tahun.");
        
    }
}

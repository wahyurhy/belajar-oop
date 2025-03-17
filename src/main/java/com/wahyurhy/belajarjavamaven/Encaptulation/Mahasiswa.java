/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wahyurhy.belajarjavamaven.Encaptulation;

/**
 *
 * @author wahyurahayu
 */
public class Mahasiswa {
    private String nama;
    private String jurusan;
    private int usia;
    
    public Mahasiswa(String nama, String jurusan, int usia) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.usia = usia;
    }
    
    // Getter
    public String getNama() {
        return this.nama;
    }
    
    public String getJurusan() {
        return this.jurusan;
    }
    
    public int getUsia() {
        return this.usia;
    }
    
    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    public void setUsia(int usia) {
        this.usia = usia;
    }
}

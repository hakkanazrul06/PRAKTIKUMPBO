/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaskomposisi;
/**
 *
 * @author LENOVO
 */
class Mobil {
    private String namaMobil;
    private Merek merekMobil; 
    
    public Mobil (String namaMobil, Merek merek) { 
        this.namaMobil = namaMobil;
        this.merekMobil = merek; 
    }
    
    public String getNamaMobil() {
        return namaMobil;
    }
        
    public void infoMobil() {
        System.out.println("Nama Mobil: " + namaMobil);
        this.merekMobil.infoMerek();
    }
}

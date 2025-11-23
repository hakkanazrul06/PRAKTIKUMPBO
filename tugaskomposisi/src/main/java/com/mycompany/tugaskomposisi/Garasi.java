/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaskomposisi;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
class Garasi {
    private List<Mobil> listMobil; 
    
    public Garasi() {
        this.listMobil = new ArrayList<>();
    }
    
    public void tambahMobil (Mobil mobil) {
        listMobil.add(mobil);
        System.out.println("Mobil " + mobil.getNamaMobil() + " berhasil ditambahkan.");
    }
    
    public void infoGarasi() {
        for (Mobil mobil : listMobil) {
            mobil.infoMobil();
        }
    }
}

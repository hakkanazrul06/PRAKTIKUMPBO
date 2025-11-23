/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaskomposisi;

/**
 *
 * @author LENOVO
 */
public class main {
    public static void main(String[] args) {
        Merek toyota = new Merek("Toyota");
        Merek honda = new Merek("Honda");
        
        Mobil mobil1 = new Mobil("Innova", toyota);
        Mobil mobil2 = new Mobil("City", honda);
        
        Garasi g1 = new Garasi();
        
        g1.tambahMobil(mobil1);
        g1.tambahMobil(mobil2);
        
        g1.infoGarasi();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_5;

/**
 *
 * @author LENOVO
 */
public class main {
    public static void main(String[] args){
        Kocheng kucing = new Kocheng();
        kucing.nama = "Mas Narji";
        kucing.jenis = "British Shorthair";
        kucing.suarakucing = "Hohohoho";
        kucing.Mamalia = "Mamalia";
        kucing.tampilkanInfo();
        
        Anjeng anjing = new Anjeng();
        anjing.nama = "Mas Fuad";
        anjing.jenis = "Pitbull";
        anjing.suaraanjing = "Hihihih";
        anjing.Mamalia = "Mamalia";
        anjing.tampilkanInfo();
    }
}

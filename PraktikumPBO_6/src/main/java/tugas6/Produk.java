/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author LENOVO
 */
abstract class Produk {
    protected String nama;
    protected double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungDiskon();

    public void tampilkanInfo() {
        System.out.println("Produk:" + nama + ", harga:" + harga);
    }
    
    public double setelahDiskon() {
        return harga - hitungDiskon();
    }
}

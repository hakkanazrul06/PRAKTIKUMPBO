/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author LENOVO
 */
public class main {
    public static void main(String[] args) {
        System.out.println("Produk: ");
        Elektronik e1 = new Elektronik("Tablet Huion", 600000, 1);
        e1.tampilkanInfo();

        System.out.println();
        Makanan m1 = new Makanan("Pudding Coklat", 15000, "2023-12-30");
        m1.tampilkanInfo();

        System.out.println("\nPegawai:");
        PegawaiTetap p1 = new PegawaiTetap("Rayfal", 2500000, 1000000);
        p1.tampilkanInfo();

        System.out.println();
        PegawaiKontrak p2 = new PegawaiKontrak("Assep", 6000000, 12);
        p2.tampilkanInfo();

        System.out.println("\nPolimorfisme:");
        Produk produk1 = new Makanan("Croissant", 7000, "2024-06-15");
        Produk produk2 = new Elektronik("Headset Hyperx", 500000, 1);

        Pegawai peg1 = new PegawaiTetap("Rama", 5500000, 750000);
        Pegawai peg2 = new PegawaiKontrak("Hammamm", 3200000, 10);

        produk1.tampilkanInfo();
        System.out.println();
        produk2.tampilkanInfo();

        System.out.println();
        peg1.tampilkanInfo();
        System.out.println();
        peg2.tampilkanInfo();
    }
}
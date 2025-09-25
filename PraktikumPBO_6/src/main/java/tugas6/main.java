/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author LENOVO
 */
public class main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja(5);

        keranjang.tambahProduk(new Buku("Chainsaw Man Vol. 4", 180000));
        keranjang.tambahProduk(new Elektronik("HyperX Headset", 2000000));
        keranjang.tambahProduk(new Pakaian("Hoodie Nike", 300000));
        keranjang.tampilkanProduk();
        System.out.println("Total setelah diskon: " + keranjang.hitungTotal());
    }
}



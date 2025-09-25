/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author LENOVO
 */
class KeranjangBelanja {
    private Produk[] daftarProduk;
    private int jumlahProduk;

    public KeranjangBelanja(int kapasitas) {
        daftarProduk = new Produk[kapasitas];
        jumlahProduk = 0;
    }

    // Menyimpan produk ke dalam list
    public void tambahProduk(Produk a) {
        if (jumlahProduk < daftarProduk.length) {
            daftarProduk[jumlahProduk] = a;
            jumlahProduk++;
        }
    }

    public void tampilkanProduk() {
        for (int i = 0; i < jumlahProduk; i++) {
            daftarProduk[i].tampilkanInfo();
        }
    }
    public double hitungTotal() {
        double total = 0;
        for (int i = 0; i < jumlahProduk; i++) {
            total += daftarProduk[i].setelahDiskon();
        }
        return total;
    }
}


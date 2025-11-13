/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas10;

/**
 *
 * @author LENOVO
 */
public class main {
    public static void main (String[] args) {
        Pembayaran elektronik = new Elektronik();
        double hargaElektronik = 250000;
        System.out.println("Pajak Elektronik: " + elektronik.hitungPajak(hargaElektronik));
        
        Pembayaran makanan = new Makanan();
        double hargaMakanan = 20000;
        System.out.println("Pajak Makanan: " + makanan.hitungPajak(hargaMakanan));
                
    }
}

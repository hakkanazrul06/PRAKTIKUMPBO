/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO_3;

/**
 *
 * @author LENOVO
 */
public class MainMobil {
        public static void main(String[] args) {
        mobil mobil1 = new mobil("Nissan", "Ultima", 2010, "Merah");
        mobil1.displayinfo();
        mobil1.startengine();
        
        
        mobil mobil2 = new mobil("Lamborghini", "Aventador", 2013, "Yellow");
        mobil2.startengine();
        mobil2.displayinfo();

        // Ubah warna mobil1
        mobil1.setwarna("Hitam");
        System.out.println("Mobil telah dicat ulang ");
        mobil1.displayinfo();
    }
}

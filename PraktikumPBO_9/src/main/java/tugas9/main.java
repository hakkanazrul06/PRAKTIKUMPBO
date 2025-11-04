/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas9;

/**
 *
 * @author LENOVO
 */
public class main {
    public static void main (String[] args) {
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();
        
        kucing.bersuara();
        kucing.info();
        
        anjing.bersuara();
        anjing.info();
    }
}

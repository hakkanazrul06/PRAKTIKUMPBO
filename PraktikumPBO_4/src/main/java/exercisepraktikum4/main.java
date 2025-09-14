/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercisepraktikum4;

/**
 *
 * @author LENOVO
 */
public class main {
    public static void main (String[] Args) {
        Pekerja lutfi = new Pekerja ("Lutfi", 45, "Tukang Cukur", 3500000);
        
        System.out.println(lutfi.toString());
        
        lutfi.setNama("Narji");
        System.out.println(lutfi.toString());
    }
}

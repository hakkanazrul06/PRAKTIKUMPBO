/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaskomposisi;

/**
 *
 * @author LENOVO
 */
class Merek {
    private String namaMerek;
    
    public Merek (String namaMerek) {
        this.namaMerek = namaMerek;
    }
    
    public void infoMerek() {
        System.out.println("Merek: " + namaMerek);
    }
}

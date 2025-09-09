/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO_3;

/**
 *
 * @author LENOVO
 */
public class mobil {
    String merk;
    String model;
    int tahun;
    String warna;

    mobil(String inputmerk, String inputmodel, int inputtahun, String inputwarna) {
        merk = inputmerk;
        model = inputmodel;
        tahun = inputtahun;
        warna = inputwarna;
    }
    public String getmerk() {  
        return merk;
    }
    public void setmerk(String inputmerk) {  
        merk = inputmerk;
    }
    public String getmodel() {  
        return model;
    }
    public void setmodel(String inputmodel) {  
        model = inputmodel;
    }
    public int gettahun() {  
        return tahun;
    }
    public void settahun(int inputtahun) {  
        tahun = inputtahun;
    }
    public String getwarna(){  
        return warna;
    }
    public void setwarna(String inputwarna){  
        warna = inputwarna;
    }
    public void displayinfo() {  
        System.out.println("Merk :" + merk + ", Model :" + model + ", Tahun :" + tahun + ", Warna :" + warna);
    }
    void startengine() {  
        System.out.println("Mesin mobil " + merk + "  menyala");
    }
}   


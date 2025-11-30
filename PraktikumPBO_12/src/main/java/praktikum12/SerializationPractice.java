/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12;

/**
 *
 * @author LENOVO
 */
import java.io.*;

public class SerializationPractice {
    public static void main(String[] args) {
        String filePath = "produk.ser";

        Produk produk = new Produk("Laptop", 15000000, 10);

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filePath))) {

            oos.writeObject(produk);
            System.out.println("Objek berhasil disimpan ke file " + filePath);

        } catch (IOException e) {
            System.out.println("Kesalahan saat menyimpan objek.");
        }

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filePath))) {

            Produk deserialized = (Produk) ois.readObject();
            System.out.println("\nObjek berhasil dibaca dari file:");
            deserialized.tampilkanInfo();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Kesalahan saat membaca objek.");
        }
    }
}


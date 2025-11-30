/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum12_2;

/**
 *
 * @author LENOVO
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventorySystem {
    private static final String TEXT_FILE = "produk.txt";
    private static final String SERIAL_FILE = "produk.ser";

    private static List<Produk> produkList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Simpan ke File Teks");
            System.out.println("3. Simpan ke File Serial");
            System.out.println("4. Tampilkan Produk");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> tambahProduk(scanner);
                case 2 -> simpanKeFileTeks();
                case 3 -> simpanKeFileSerial();
                case 4 -> tampilkanProduk();
                case 5 -> { return; }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void tambahProduk(Scanner scanner) {
        System.out.print("Nama Produk: ");
        String nama = scanner.nextLine();

        System.out.print("Harga: ");
        double harga = scanner.nextDouble();

        System.out.print("Stok: ");
        int stok = scanner.nextInt();

        produkList.add(new Produk(nama, harga, stok));
        System.out.println("Produk berhasil ditambahkan.");
    }

    private static void simpanKeFileTeks() {
        try (FileWriter writer = new FileWriter(TEXT_FILE)) {
            for (Produk p : produkList) {
                writer.write(p.toString() + "\n");
            }
            System.out.println("Produk disimpan ke " + TEXT_FILE);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan ke file teks.");
        }
    }

    private static void simpanKeFileSerial() {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {

            oos.writeObject(produkList);
            System.out.println("Produk berhasil diserialisasi ke " + SERIAL_FILE);

        } catch (IOException e) {
            System.out.println("Gagal serialisasi.");
        }
    }

    private static void tampilkanProduk() {
        System.out.println("\nDaftar Produk:");
        for (Produk p : produkList) {
            p.tampilkanInfo();
        }
    }
}

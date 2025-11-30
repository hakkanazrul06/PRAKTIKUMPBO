/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas12;

/**
 *
 * @author LENOVO
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrarySystem {

    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";

    private static List<Buku> bukuList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Tambah Buku dan Simpan ke buku.txt");
            System.out.println("2. Simpan Objek Buku ke buku.ser");
            System.out.println("3. Tampilkan Buku dari buku.txt");
            System.out.println("4. Tampilkan Buku dari buku.ser");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // konsumsi newline

            switch (pilihan) {
                case 1 -> tambahBuku(scanner);
                case 2 -> simpanSerial();
                case 3 -> tampilkanDariFileTeks();
                case 4 -> tampilkanDariSerial();
                case 5 -> {
                    System.out.println("Keluar...");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private static void tambahBuku(Scanner scanner) {
        System.out.print("Judul: ");
        String judul = scanner.nextLine();

        System.out.print("Pengarang: ");
        String pengarang = scanner.nextLine();

        System.out.print("Tahun Terbit: ");
        int tahun = scanner.nextInt();

        Buku buku = new Buku(judul, pengarang, tahun);
        bukuList.add(buku);

        try (FileWriter writer = new FileWriter(TEXT_FILE, true)) {
            writer.write(buku.toString() + "\n");
            System.out.println("Buku berhasil disimpan ke buku.txt");
        } catch (IOException e) {
            System.out.println("Gagal menulis ke file teks.");
        }
    }

    private static void simpanSerial() {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {

            oos.writeObject(bukuList);
            System.out.println("Objek buku berhasil diserialisasi ke buku.ser");

        } catch (IOException e) {
            System.out.println("Gagal serialisasi!");
        }
    }

    private static void tampilkanDariFileTeks() {
        System.out.println("\n=== Isi buku.txt ===");

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(TEXT_FILE))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                Buku buku = new Buku(data[0], data[1], Integer.parseInt(data[2]));
                buku.tampilkanInfo();
            }

        } catch (IOException e) {
            System.out.println("Gagal membaca file teks.");
        }
    }

    private static void tampilkanDariSerial() {
        System.out.println("\n=== Isi buku.ser ===");

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {

            List<Buku> list = (List<Buku>) ois.readObject();
            for (Buku buku : list) {
                buku.tampilkanInfo();
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Gagal membaca serialisasi!");
        }
    }
}


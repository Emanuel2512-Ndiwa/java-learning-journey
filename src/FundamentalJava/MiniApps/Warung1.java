package FundamentalJava;

import java.util.InputMismatchException;
import java.awt.im.InputContext;
import java.util.Scanner;

public class Warung1 {

    private static void Warung() {
        Scanner input = new Scanner(System.in);

        System.out.println();//untuk jarak Dari Top terminal vs code dengan output agar tidak memepet dan rapih
        System.out.println("\t\tProgram Warung Sederhana");
        System.out.println();

        int PorsiNasi_Sayur = 8000;
        int semuaLauk = 3000;
        int Minuman = 2000;
        System.out.println("\tDaftar Harga Dan Menu");
        System.out.println("\t====================================");
        System.out.println("\t1 Porsi Nasi + Sayur\t=" + "\t" + PorsiNasi_Sayur);
        System.out.println("\tAyam Goreng\t\t=" + "\t" + semuaLauk);
        System.out.println("\tAyam Santan\t\t=" + "\t" + semuaLauk);
        System.out.println("\tAyam Balado\t\t=" + "\t" + semuaLauk);
        System.out.println("\tIkan Tongkol Goreng\t=" + "\t" + semuaLauk);
        System.out.println("\tTelur Dadar\t\t=" + "\t" + semuaLauk);
        System.out.println("\tTelur Balado\t\t=" + "\t" + semuaLauk);
        System.out.println("\tEs Teh\t\t\t=" + "\t" + Minuman);
        System.out.println("\tEs Nutrisari (Semua Rasa)=" + "\t" + Minuman);
        System.out.println("\tAir Es\t\t\t=" + "\t" + Minuman);
        System.out.println("\t====================================");
        System.out.println();
        System.out.print("\tApakah Anda Tertarik Memesan (Y/N)\t=");
        String jawaban = input.next();

        if (jawaban.equalsIgnoreCase("y")) {

            System.out.println("\tSelamat Datang Di Warung Murah-Meriah");
            System.out.println();
            System.out.println("\tSilahkan Masukan Data Diri Anda Terlebih Dahulu");
            System.out.println();
            System.out.print("\tNama Pemesan\t:");
            String namaPemesan = input.next();
            System.out.print("\tNomor Telepon\t:");
            String nomorTelepon = input.next();
            System.out.print("\tMau Bungkus Atau Makan Di Sini(Bungkus/Bawa)\t:");
            String pesananTempat = input.next();

            System.out.print("\tHallo ->\t" + namaPemesan + " Trimakasih Sudah Mengisi Data Diri Anda Dan Ingin " + pesananTempat + " Makanan Warung Kami");
            System.out.println();
            System.out.println("\tSilahkan input makanan yang mau dipesan sesuai daftar menu di atas\t");
            System.out.println();
            System.out.println("\t--------------------------------------------------");
            // Variabel untuk menyimpan input jumlah
            int jumlahPorsi = 0;
            String namaLauk = " "; // Inisialisasi agar bisa diakses di luar loop
            int jumlahLauk = 0;
            String namaMinuman = ""; // Inisialisasi
            int jumlahMinuman = 0;

            // ---- Logika untuk memastikan input "jumlahPorsi" adalah angka ----
            boolean inputValid = false;
            while (!inputValid) {//berarti ture nilainya 
                try {
                    System.out.print("\tJumlah Porsi Nasi+Sayur\t=" + "\t");
                    jumlahPorsi = input.nextInt();
                    input.nextLine(); // Konsumsi newline
                    inputValid = true; // Input berhasil, keluar dari loop
                } catch (InputMismatchException e) {
                    System.err.println("\tInput tidak valid. Harap masukkan ANGKA untuk jumlah porsi Nasi+Sayur.");
                    input.nextLine(); // Bersihkan buffer dari input yang salah
                }
            }
            // -----------------------------------------------------------------

            // --- Validasi Jumlah Porsi Nasi+Sayur (Numerik) ---
            boolean inputJumlahValid = false;
            while (!inputJumlahValid) {
                try {
                    System.out.print("\tJumlah Porsi Nasi+Sayur\t=" + "\t");
                    jumlahPorsi = input.nextInt();
                    input.nextLine(); // Konsumsi newline
                    inputJumlahValid = true;
                } catch (InputMismatchException e) {
                    System.err.println("\tInput tidak valid. Harap masukkan ANGKA untuk jumlah porsi Nasi+Sayur.");
                    input.nextLine(); // Bersihkan buffer
                }
            }
            // ---------------------------------------------------

            // --- Validasi Nama Lauk (Tidak boleh kosong atau hanya angka) ---
            boolean inputNamaValid = false;
            while (!inputNamaValid) {
                System.out.print("\tNama Lauk\t\t=" + "\t");
                namaLauk = input.nextLine().trim(); // Baca dan hapus spasi di awal/akhir

                // Cek apakah string kosong ATAU hanya terdiri dari angka
                if (namaLauk.isEmpty() || namaLauk.matches("\\d+")) {
                    System.err.println("\tInput tidak valid. Harap masukkan NAMA Lauk yang benar (tidak boleh kosong atau hanya angka).");
                    // inputNamaValid tetap false, loop berlanjut
                } else {
                    inputNamaValid = true; // Input valid, keluar dari loop
                }
            }
            // -----------------------------------------------------------------

            // --- Validasi Jumlah Lauk (Numerik) ---
            inputJumlahValid = false; // Reset flag
            while (!inputJumlahValid) {
                try {
                    System.out.print("\tJumlah Lauk\t\t=" + "\t");
                    jumlahLauk = input.nextInt();
                    input.nextLine(); // Konsumsi newline
                    inputJumlahValid = true;
                } catch (InputMismatchException e) {
                    System.err.println("\tInput tidak valid. Harap masukkan ANGKA untuk jumlah lauk.");
                    input.nextLine(); // Bersihkan buffer
                }
            }
            // ---------------------------------------------------

            // --- Validasi Nama Minuman (Tidak boleh kosong atau hanya angka) ---
            inputNamaValid = false; // Reset flag
            while (!inputNamaValid) {
                System.out.print("\tNama Minuman\t\t=" + "\t");
                namaMinuman = input.nextLine().trim(); // Baca dan hapus spasi di awal/akhir

                // Cek apakah string kosong ATAU hanya terdiri dari angka
                if (namaMinuman.isEmpty() || namaMinuman.matches("\\d+")) {
                    System.err.println("\tInput tidak valid. Harap masukkan NAMA Minuman yang benar (tidak boleh kosong atau hanya angka).");
                    // inputNamaValid tetap false, loop berlanjut
                } else {
                    inputNamaValid = true; // Input valid, keluar dari loop
                }
            }
            // -----------------------------------------------------------------

            // --- Validasi Jumlah Minuman (Numerik) ---
            inputJumlahValid = false; // Reset flag
            while (!inputJumlahValid) {
                try {
                    System.out.print("\tJumlah Minuman\t\t=" + "\t");
                    jumlahMinuman = input.nextInt();
                    input.nextLine(); // Konsumsi newline
                    inputJumlahValid = true;
                } catch (InputMismatchException e) {
                    System.err.println("\tInput tidak valid. Harap masukkan ANGKA untuk jumlah minuman.");
                    input.nextLine(); // Bersihkan buffer
                }
            }

        } else {
            System.out.println("\tTrimasih Sudah Berkunjung");
        }

    }

    public static void main(String[] args) {
        Warung();
    }

}
